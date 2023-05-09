package implementation.strategy.main;

import java.math.BigDecimal;

import implementation.strategy.model.CalculadoraImposto;
import implementation.strategy.model.ICMS;
import implementation.strategy.model.ISS;

/*
 * O objetivo do design pattern Strategy nesse exemplo é evitar ter vários if else testando um enumerado no 'tipoImposto'(ISS ou ICMS), fazendo com que quando entrar um novo imposto, 
 *  ser necessário sempre adicionar mais um if na mesma classe. Utilizando o strategy mantemos isolado a implementação de cada um dos impostos, e caso seja necessário
 *  adicionar um novo imposto, criamos uma classe com o nome do novo imposto. 
 * */


public class StrategyMain {

	public static void main(String[] args) {

		CalculadoraImposto calculadora = new CalculadoraImposto();
		System.out.println(calculadora.calcular(new BigDecimal(10), new ICMS()));

		System.out.println(calculadora.calcular(new BigDecimal(10), new ISS()));
	}
}