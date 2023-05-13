package implementation.state.main;

import java.math.BigDecimal;
import implementation.state.model.Orcamento;

/*
 O state é um design pattern onde você tem vários status/situações e você tem um determinado comportamento que pode variar ou ser o mesmo entre esses status.
 Com esse pattern você consegue controlar o comportamento de cada estado, e também se um estado pode sair de um tipo para o outro. Ele evita você ter vários IFs 
 dentro de uma classe, e é um conceito irmão do Strategy.
 * */

public class StateMain {

	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento(new BigDecimal(100), 3);
		orcamento.aprovar();
		orcamento.finalizar();
		
		//exception
		Orcamento orcamento2 = new Orcamento(new BigDecimal(100), 3);	
		orcamento2.finalizar();
	}
}