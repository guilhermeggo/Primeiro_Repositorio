package br.usjt.previsao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.previsao.model.Previsao;
import br.usjt.previsao.service.PrevisaoService;

@Controller
public class PrevisaoController {
	//@Autowired
	//private PrevisaoRepository previsaoRepo;

	@Autowired
	private PrevisaoService previsaoService;

	//@Autowired
	//public PrevisaoController(PrevisaoRepository previsaoRepo) {
		//this.previsaoRepo = previsaoRepo;		
	//}

	//@Autowired
	//public void setPrevisaoRepo(PrevisaoRepository previsaoRepo) {
		//this.previsaoRepo = previsaoRepo;		
	//}

	@GetMapping("/previsao")
	public ModelAndView listarPrevisao(){
		//passe o nome da página ao construtor
		ModelAndView mv = new ModelAndView ("lista_previsao");
		mv.addObject(new Previsao());
		//Busque a coleção com o repositório
		List<Previsao> previsao = previsaoService.listarTodos();
		//adicione a coleção ao objeto ModelAndView
		mv.addObject("previsa", previsao);
		mv.addObject(new Previsao());
		//devolva o ModelAndView
		return mv;
	}

	@PostMapping("/previsao")
	public String salvar (Previsao previsao) {
		previsaoService.salvar(previsao);
		return "redirect:/previsao";
	}

}
