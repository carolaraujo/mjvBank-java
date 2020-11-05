package br.com.mjv.bank.cliente.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.mjv.bank.cliente.model.Cliente;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
	public ModelAndView inicio(@PathVariable Integer id) {
		ModelAndView mv = new ModelAndView("home");
//		mv.addObject("cliente", service.buscarPorId(id));
		return mv;
	}
	
	@RequestMapping(path = "/cadastrar", method = RequestMethod.GET)
	public String CadastrarCliente(Cliente cliente) {
		return "cliente/cadastro";
		
	}
}
