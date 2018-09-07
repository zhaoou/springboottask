package com.michael.quotetask.quotes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.michael.quotetask.model.Quote;
import com.michael.quotetask.service.QuoteService;

@Controller
public class QuoteController {
	
	@Autowired
	QuoteService service;
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("quotes", service.findAll());
		model.addAttribute("quote", new Quote());
		return "quote";//the name of html
	}
	
	/*@GetMapping("/find")
	public List<Quote> getAllQuota() {
		return "quote";
	}*/
	
	@PostMapping("/save")
	public String saveQuote(Quote quote) {
		service.save(quote);
		return "redirect:/";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteQuote(@PathVariable("id") Long id) {
		service.deleteById(id);
		return "redirect:/";
		//return "redirect:/tasks/";
	}

}
