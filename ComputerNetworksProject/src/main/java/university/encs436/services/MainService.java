package university.encs436.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class MainService {

	public String index() { // return 'index.html' page
		return "index";
	}

	
	public String partOne() {  // return 'partOne.html' page
		
		return "partOne";
		
	}
	
	public ModelAndView firstRequest(String clientIP, int serverPort) { // return 'firstPage.html' page after sending query parameters to it.

		Map<String, Object> params = new HashMap<>();
		params.put("clientIP", clientIP);
		params.put("serverPort", serverPort);
		
		
		return new ModelAndView("firstPage", params);

	}

	public String secondRequest() {// return 'secondPage.html' page

		return "secondPage";

	}

	public String thirdRequest() { // return 'thirsPage.html' page

		return "thirdPage";

	}

}
