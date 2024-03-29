
package acme.entities.threads;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import acme.framework.entities.Authenticated;
import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Thread extends DomainEntity {

	private static final long					serialVersionUID	= 1L;

	//Attributes

	@NotBlank
	private String								title;

	@Temporal(TemporalType.TIMESTAMP)
	@Past
	private Date								moment;

	//Relationships

	@Valid
	@NotNull
	@ManyToOne(optional = false)
	private Authenticated						authenticated;

	@ManyToMany
	@NotNull
	private Collection<@Valid Authenticated>	participants;

}
