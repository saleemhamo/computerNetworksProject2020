package university.encs436.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import university.encs436.services.MainService;


@Controller
public class MainController {

	
	

	@Autowired 
	MainService service;
	
	
	@RequestMapping("/")
	public String index(Model model, HttpServletRequest request) {
	    return service.index();
	}
	
	@RequestMapping("/partOne")
	public String partOne(HttpServletRequest request) {
		return service.partOne();
	}
	
	@RequestMapping("/1")
	public ModelAndView firstRequest(HttpServletRequest request) {
		return service.firstRequest(request.getRemoteAddr(), request.getRemotePort());
	}
	
	
	@RequestMapping("/2")
	public String secondRequest(HttpServletRequest request) {
		return service.secondRequest();
	}
	
	
	@RequestMapping("/3")
	public String thirdRequest(HttpServletRequest request) {
		return service.thirdRequest();
	}
	
}

