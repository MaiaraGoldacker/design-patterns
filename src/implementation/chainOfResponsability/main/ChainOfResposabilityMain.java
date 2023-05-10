package implementation.chainOfResponsability.main;

import java.math.BigDecimal;

import implementation.chainOfResponsability.model.CalculadoraDeDesconto;
import implementation.chainOfResponsability.model.Orcamento;

/*
 * Aplicamos o padrão de projeto Chain of Responsability quando temos muitas regras que geram IFs e Elses dentro do nosso sistema, 
 * mas nós não sabemos quais serão aplicados exatamente(como seria no caso do Strategy por exemplo)
 * Então criamos uma 'cadeia' com essas regras fazendo com que a primeira chame a próxima, e assim sucessivamente
 * 
 */


public class ChainOfResposabilityMain {
	
	public static void main(String[] args) {

		CalculadoraDeDesconto calculadora = new CalculadoraDeDesconto();
		System.out.println(calculadora.calcularDesconto(new Orcamento(new BigDecimal(100), 2))); //sem desconto
		
		System.out.println(calculadora.calcularDesconto(new Orcamento(new BigDecimal(1000), 2))); //desconto por valor
		
		System.out.println(calculadora.calcularDesconto(new Orcamento(new BigDecimal(100), 6))); //desconto por número de item
	}

}
