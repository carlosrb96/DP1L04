
package acme.entities.jobs;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.entities.descriptors.Descriptor;
import acme.entities.roles.Employer;
import acme.framework.datatypes.Money;
import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Job extends DomainEntity {

	// Serialisation Identifier -------------------------------------------------

	private static final long	serialVersionUID	= 1L;

	// Attributes ---------------------------------------------------------------

	@Column(unique = true)
	@NotBlank
	@Length(min = 5, max = 10)
	@Pattern(regexp = "^[A-Z]{4}\\-[A-Z]{4}$")
	private String				reference;

	@NotBlank
	@Pattern(regexp = "^(draft|published)$")
	private String				status;

	@NotBlank
	private String				title;

	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	private Date				deadline;

	@NotNull
	@Valid
	private Money				salary;

	@URL
	private String				link;

	private String				moreInfo;

	// Relationships -----------------------------------------------------------

	@NotNull
	@Valid
	@ManyToOne(optional = false)
	private Employer			employer;

	@NotNull
	@Valid
	@OneToOne(optional = false, mappedBy = "job")
	private Descriptor			descriptor;

}
