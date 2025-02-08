package spring_mvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/pages")
public class HomeController {
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Model model) {
		System.out.println("This is our Home Page URL");
		model.addAttribute("name","Pranav Mahajan");
		model.addAttribute("id",10);
		
		List<String> friends = new ArrayList<String>();
		friends.add("Pranav");
		friends.add("Yash");
		friends.add("Kunal");
		friends.add("Sujal");
		
		model.addAttribute("f",friends);
		
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("This is our About Page URL");
		return "about";
	}
	
	@RequestMapping("/services")
	public String services() {
		System.out.println("This is our Services Page URL");
		return "services";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is our Help Page URL");
		
		//creating model and view object
		ModelAndView modelAndView = new ModelAndView();
		
		//setting the data
		modelAndView.addObject("rollNo", 28);
		modelAndView.addObject("name", "Pranav");
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time", now);
		
		//list
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		modelAndView.addObject("marks", list);
		
		//setting view name
		modelAndView.setViewName("help");
		
		return modelAndView;
	}
}
