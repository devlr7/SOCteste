package com.app.socteste.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.socteste.model.Exame;
import com.app.socteste.repository.ExameRepository;

@Controller
public class ExameController {

	@Autowired
	private ExameRepository er;
	
	@RequestMapping(value="/cadastrarExame", method= RequestMethod.GET)
	public String form() {
		
		return "exame/formExame";
	}
	
	@RequestMapping(value="/cadastrarExame", method= RequestMethod.POST)
	public String form(Exame exame, BindingResult result, RedirectAttributes attributes) {
		if(result.hasErrors()) {
			attributes.addFlashAttribute("mensagem", "Verifique os campos!");
			return "redirect:/cadastrarExame";
		}
		er.save(exame);
		attributes.addFlashAttribute("mensagem", "Exame cadastrado com sucesso!");
		return "redirect:/cadastrarExame";
	}
	
	@RequestMapping("/alterarExame/{id}")
		public String alterarExame (@PathVariable("id") int id, Exame exame) {
		ModelAndView mv = new ModelAndView("/cadastrarExame");
		exame = er.findById(id);
		return "exame/alterarExame";
	}
	
	
	@RequestMapping("/deletarExame")
	public String deletarExame (int id) {
		Exame exame = er.findById(id);
		er.delete(exame);
		return "redirect:/exames";
	}
	
	@RequestMapping("/exames")
	public ModelAndView listaExames() {
		ModelAndView mv = new ModelAndView("/index");
		Iterable<Exame> exames =  er.findAll(); 
		mv.addObject("exames", exames);
		return mv;
	}
	
}
