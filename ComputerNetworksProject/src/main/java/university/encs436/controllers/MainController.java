package university.encs436.controllers;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import university.encs436.services.MainService;


@Controller
public class MainController {

	/** Main controllers that deals with http requests and calls service functions! **/
	

	@Autowired 
	MainService service;
	
	
	@RequestMapping("/")
	public String index(Model model, HttpServletRequest request) { // this method is fired whenever 'index.html' is called
		
		printRequest(request);
	    return service.index();
	}
	
	@RequestMapping("/partOne")
	public String partOne(HttpServletRequest request) { // this method is fired whenever 'partOne.html' is called
		
		printRequest(request);
		return service.partOne();
	}
	
	@RequestMapping("/1")
	public ModelAndView firstRequest(HttpServletRequest request) { // this method is fired whenever '/1' is called
		
		printRequest(request);
		return service.firstRequest(request.getRemoteAddr(), request.getRemotePort());
	}
	
	
	@RequestMapping("/2")
	public String secondRequest(HttpServletRequest request) { // this method is fired whenever '/2' is called
		
		printRequest(request);
		return service.secondRequest();
	}
	
	
	@RequestMapping("/3")
	public String thirdRequest(HttpServletRequest request) { // this method is fired whenever '/3' is called
		
		printRequest(request);
		return service.thirdRequest();
	}
	
	
	public void printRequest(HttpServletRequest request) { // This method prints out the received HTTP request
		System.out.println("---------------------------------------------");
		System.out.println(request.getMethod() + "/" + request.getProtocol());
		Enumeration<String> headerNames = request.getHeaderNames();
		while(headerNames.hasMoreElements()) {
		  String headerName = headerNames.nextElement();
		  System.out.println("" + headerName + ":" + request.getHeader(headerName));
		}
		System.out.println("---------------------------------------------");

	}
	
	
}

