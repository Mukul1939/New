package com.ntt;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AppController {
	 @RequestMapping(value = "/", method = RequestMethod.GET)
	  public String showForm(Model model) {
	    model.addAttribute("registration", new Register());
	    return "register";
	  }

	  @RequestMapping(value = "/processForm", method = RequestMethod.POST)
	  public String processForm(@Valid @ModelAttribute("registration") Register register,
	      BindingResult bindingResult) {
	    if (bindingResult.hasErrors()) {
	      return "register";
	    } 
	      return "welcome";
	    

		}
}
