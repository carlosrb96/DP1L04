
package acme.features.auditor.auditRecords;

import java.util.Collection;

import org.springframework.stereotype.Service;

import acme.entities.records.AuditRecord;
import acme.entities.roles.Auditor;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Principal;
import acme.framework.services.AbstractListService;

@Service
public class AuditorAuditRecordListService implements AbstractListService<Auditor, AuditRecord> {

	private AuditorAuditRecordRepository repository;


	@Override
	public boolean authorise(final Request<AuditRecord> request) {
		assert request != null;
		return true;
	}

	@Override
	public void unbind(final Request<AuditRecord> request, final AuditRecord entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "title", "status", "moment");
	}

	@Override
	public Collection<AuditRecord> findMany(final Request<AuditRecord> request) {
		assert request != null;

		Collection<AuditRecord> res;
		Principal principal;

		principal = request.getPrincipal();
		res = this.repository.findManyByAuditorId(principal.getAccountId());

		return res;
	}

}
