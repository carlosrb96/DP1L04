
package acme.features.authenticated.auditor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.roles.Auditor;
import acme.framework.controllers.AbstractController;
import acme.framework.entities.Authenticated;

@Controller
@RequestMapping("authenticated/auditor")
public class AuthenticatedAuditorController extends AbstractController<Authenticated, Auditor> {

}
