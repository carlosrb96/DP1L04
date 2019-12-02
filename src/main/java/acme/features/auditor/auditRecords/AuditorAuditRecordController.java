
package acme.features.auditor.auditRecords;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import acme.components.CustomCommand;
import acme.entities.records.AuditRecord;
import acme.entities.roles.Auditor;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;

public class AuditorAuditRecordController extends AbstractController<Auditor, AuditRecord> {

	@Autowired
	AuditorAuditRecordShowService	showService;

	@Autowired
	AuditorAuditRecordListService	listService;


	@PostConstruct
	private void Initialise() {
		super.addBasicCommand(BasicCommand.LIST, this.listService);
		super.addCustomCommand(CustomCommand.LIST_MINE, BasicCommand.LIST, this.showService);
	}
}
