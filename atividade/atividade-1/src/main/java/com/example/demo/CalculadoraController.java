package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class CalculadoraController {

	private  Operacao Mat = new Operacao();
	@RequestMapping (value = "/sum/{numeroUm}/ {numeroDois}",
			method=RequestMethod.GET)
	
		public Double sum (@PathVariable(value = "numeroUm" )String numeroUm,
						@PathVariable(value = "numeroDois") String numeroDois) {
			Double n1 = Double.parseDouble(numeroUm);
			Double n2 = Double.parseDouble(numeroDois);
			return Mat.soma(n1,n2);
		}
		
	public Double sub (@PathVariable(value = "numeroUm" )String numeroUm,
			@PathVariable(value = "numeroDois") String numeroDois
			) {
				Double n1 = Double.parseDouble(numeroUm);
				Double n2 = Double.parseDouble(numeroDois);
				return Mat.subtracao(n1,n2);
			}
	
	public Double mul (@PathVariable(value = "numeroUm" )String numeroUm,
			@PathVariable(value = "numeroDois") String numeroDois
			) {
				Double n1 = Double.parseDouble(numeroUm);
				Double n2 = Double.parseDouble(numeroDois);
				return Mat.multiplicacao(n1,n2);
			}
	
	public Double div (@PathVariable(value = "numeroUm" )String numeroUm,
			@PathVariable(value = "numeroDois") String numeroDois
			) {
				Double n1 = Double.parseDouble(numeroUm);
				Double n2 = Double.parseDouble(numeroDois);
				return Mat.divicao(n1,n2);
			}
			
		
		
	

}
