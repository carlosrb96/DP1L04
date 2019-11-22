
package acme.entities.bulletins;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class HorrilloBulletin extends DomainEntity {

	private static final long	serialVersionUID	= 1L;

	@NotBlank
	private String				title;

	@NotBlank
	private String				text;

	@Temporal(TemporalType.TIMESTAMP)
	private Date				moment;

}
