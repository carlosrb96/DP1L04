
package acme.features.employer.application;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.applications.Application;
import acme.entities.roles.Employer;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface EmployerApplicationRepository extends AbstractRepository {

	// TODO cambiar esta quey por la correspondiente
	@Query("select a from Application a where a.job.employer.id = ?1")
	Collection<Application> findApplicationsByEmployerId(int id);

	@Query("select e from Employer e where e.userAccount.id = ?1")
	Employer findEmployer(int id);

	@Query("select a from Application a where a.id = ?1")
	Application findApplicationById(int id);

}
