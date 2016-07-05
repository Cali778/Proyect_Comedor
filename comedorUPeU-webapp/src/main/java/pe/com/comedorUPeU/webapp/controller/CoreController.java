package pe.com.comedorUPeU.webapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pe.com.comedorUPeU.service.services.CoreUPeUServiceImpl;

@Controller
public class CoreController {

	@Autowired
	private CoreUPeUServiceImpl coreUPeUService;

	@RequestMapping(value = "home/dashboard", method = RequestMethod.GET)
	public String homeDashboard(Model model, HttpServletRequest request) {
		

		request.getSession().setAttribute("menuHeader", "home");

		System.out.println("home/dashboard:::: "+coreUPeUService);

		return "home/dashboard";
	}

}
