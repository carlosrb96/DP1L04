
package acme.entities.records;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
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

	@NotBlank
	private LocalDateTime		creationMoment;

	@NotBlank
	@Temporal(TemporalType.TIMESTAMP)
	private String				body;

	// Relationships --------------------------------------------------------------

	@NotBlank
	@ManyToOne(optional = false)
	private Auditor				auditor;

	@NotBlank
	@OneToOne(optional = false)
	private Job					Job;
}
