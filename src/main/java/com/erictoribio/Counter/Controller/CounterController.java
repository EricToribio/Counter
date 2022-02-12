package com.erictoribio.Counter.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/your_server")
public class CounterController {
	
	@RequestMapping("")
	public String index(HttpSession session) {
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}else {
			int temp = (int) session.getAttribute("count");
			temp += 1;
			session.setAttribute("count", temp );
		}
		
		return "index.jsp";
		
	}
	
	@RequestMapping("/counter")
	public String counter(HttpSession session,Model model) {
		Integer currentCount = (Integer) session.getAttribute("count");
		model.addAttribute("countToShow", currentCount);
		return "counter.jsp";
	}

	@RequestMapping("/reset")
	public String counter(HttpSession session) {
		session.removeAttribute("count");
		String redirectUrl = "";
        return "redirect:" + redirectUrl;
	}
	@RequestMapping("/addTwo")
	public String addTwo(HttpSession session) {
	int temp = (int) session.getAttribute("count");
	temp += 1;
	session.setAttribute("count", temp );
		String redirectUrl = "";
        return "redirect:" + redirectUrl;
	}
		

}
