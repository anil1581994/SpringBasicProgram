package com.bridgelabz.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.bridgelabz.model.Login;
import com.bridgelabz.model.User;
import com.bridgelabz.service.UserService;

@Controller
public class MyController {
	@Autowired
	public UserService userService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String homePage() {
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView loginPage() {
		return new ModelAndView("login", "login", new Login());
	}

	@RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("login") Login login) 
	{
	    System.out.println(login.getUsername()+" "+login.getPassword());
		ModelAndView mav = null;
		User user = userService.validateUser(login);// user should login here
		if (user!=null) 
		{
			//mav = new ModelAndView("redirect:/welcome.jsp");
			mav = new ModelAndView("welcome");
			mav.addObject("firstname",user.getFirstname());
		} else 
		{
			mav = new ModelAndView("login");
			mav.addObject("message", "username and password is wrong!!");
		}
		return mav;
	}

	// register
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView showRegister(HttpServletRequest request, HttpServletRequest response) 
	{
		ModelAndView modelAndView = new ModelAndView("register");
	
		modelAndView.addObject("user",new User());
		return modelAndView;
	}

	@RequestMapping(value = "/registerProcess", method = RequestMethod.POST)
	public String addUser(HttpServletRequest request, HttpServletRequest response,
			@ModelAttribute("user") User user ) 
	{
		System.out.println(user.getFirstname() );
		userService.register(user);// create new user
		return  "redirect:/login";
	}
}
