package implementation.templateMethod.main;

import java.math.BigDecimal;

import implementation.chainOfResponsability.model.CalculadoraDeDesconto;
import implementation.chainOfResponsability.model.Orcamento;

/*
** Template method é um design pattern que define um esqueleto de um método na sua superclasse, e cada subclasse implementa e sobrescreve suas regras especificas, sem mexer na estrutura 
*principal da lógica na superclasse
 */

public class TemplateMethodMain {
	
	public static void main(String[] args) {

		CalculadoraDeDesconto calculadora = new CalculadoraDeDesconto();
		System.out.println(calculadora.calcularDesconto(new Orcamento(new BigDecimal(100), 2))); //sem desconto
		
		System.out.println(calculadora.calcularDesconto(new Orcamento(new BigDecimal(1000), 2))); //desconto por valor
		
		System.out.println(calculadora.calcularDesconto(new Orcamento(new BigDecimal(100), 6))); //desconto por número de item
	}

}
