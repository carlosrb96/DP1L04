
package acme.entities.records;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import acme.entities.jobs.Job;
import acme.entities.roles.Auditor;
import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class AuditRecord extends DomainEntity {

	//Serialization ---------------------------------------------------------------
	private static final long	serialVersionUID	= 1L;

	//Atributes -------------------------------------------------------------------

	@NotBlank
	private String				title;

	@NotBlank
	@Pattern(regexp = "^(draft|published)$")
	private String				status;

	@Temporal(TemporalType.TIMESTAMP)
	@Past
	private Date				creationMoment;

	@NotBlank
	private String				body;

	// Relationships --------------------------------------------------------------

	@NotNull
	@Valid
	@ManyToOne(optional = false)
	private Auditor				auditor;

	@NotNull
	@Valid
	@ManyToOne(optional = false)
	private Job					job;
}
