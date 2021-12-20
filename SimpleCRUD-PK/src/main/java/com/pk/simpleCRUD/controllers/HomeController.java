package com.pk.simpleCRUD.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pk.simpleCRUD.domain.CrudItem;
import com.pk.simpleCRUD.domain.DispText;
import com.pk.simpleCRUD.services.CrudService;
import com.pk.simpleCRUD.services.DispTextService;

@Controller
public class HomeController {
	
	@Autowired
	private CrudService service;

	@Autowired
	private DispTextService dispService;
	
	
	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("Items",service.getAllItems());
		return "index";
	}
	
	@GetMapping("/newContact")
	public String addNewContact(Model model) {
		model.addAttribute("crudItem", new CrudItem());
		model.addAttribute("text", new DispText("Add a new Contact..."));
		return "newContact";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveContact(@ModelAttribute("crudItem") CrudItem crudItem) {
		service.saveContact(crudItem);
		return "redirect:/";
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView editContact(@PathVariable("id") Long id) {
		ModelAndView ma = new ModelAndView("newContact");
		ma.addObject("crudItem",service.getContact(id));
		ma.addObject("text",dispService.getDisp());
		return ma;
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteContact(@PathVariable("id") Long id) {
		service.deleteContact(id);
		return "redirect:/";
	}
	
	
}
