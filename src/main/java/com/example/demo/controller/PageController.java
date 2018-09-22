package com.example.demo.controller;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {
		
	//Latihan
	@RequestMapping("/generator")
	public String generator(@RequestParam(value = "a", required=false, defaultValue="0") int a,
			@RequestParam(value = "b", required=false, defaultValue="0") int b, Model model) {
		
		model.addAttribute("a", a);
		model.addAttribute("b", b);
		
		/* hm = var untuk membuat kata hm sesuai banyaknya a
		 */
		String hm = "h";
		
		if (a>1) {
			for (int i=0; i<a; i++) {
				hm += "m";
			}
		}else {
			hm += "m";
		}
		
		/*
		 * hmm = variabel untuk menyimpan kata hm sebanyak b
		 */
		String hmm = "";
		
		if(b>1) {
			for (int i=0; i<b; i++) {
				hmm += hm + " ";
			}
		}else {
			hmm += hm;
		
		}
		
		model.addAttribute("hmm", hmm);
		return "generator";
	}
	



/*
	@RequestMapping(value = {"/challenge", "/challenge/{name}"})
	public String challengePath(@PathVariable Optional <String> name, Model model) {
		if (name.isPresent()) {
					
					model.addAttribute("name", name.get());
				}else {
					model.addAttribute("name","KB");
				}
				return "challenge";
			
			
	}*/
		
		
	
	@RequestMapping("/viral/challenge")
	public String challenge(@RequestParam(value = "name") String name, Model model) {
		model.addAttribute("name", name);
		return "challenge";
	}
	
	@RequestMapping("/viral")
	public String index() {
		return "viral";
	}
	

	
}

