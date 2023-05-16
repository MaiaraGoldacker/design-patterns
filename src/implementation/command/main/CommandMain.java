package implementation.command.main;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Month;

import implementation.command.model.GerarPedido;
import implementation.command.model.GerarPedidoCommand;
import implementation.command.model.GerarPedidoHandler;

/*
 O command é utilizado quando temos métodos em diversas classes que possuem uma 'sequencia' igual de ações que precisam ser feitas. para não precisarmos duplicar ou até mesmo
 triplicar esses métodos os diferentes classes, nós abstraímos a entrada dos dados, e extraímos os métodos que se repetem em uma classe separada e mais genérica.
 Criamos uma interface então, com os métodos mais genéricos(executar, gerar, etc) e podemos utilizar a interface e abstrair a implementação
 * */

public class CommandMain {

	public static void main(String[] args) {
		
		//gerar pedido
		GerarPedido gerarPedido = new GerarPedido("maiara", new BigDecimal(10), 1);
		GerarPedidoCommand handler = new GerarPedidoHandler();
		handler.executar(gerarPedido);
		
		//gerar agendamento
		GerarPedido gerarAgendamento = new GerarPedido("bruna", new BigDecimal(10), 1, LocalDateTime.of(2023, Month.DECEMBER,10,8, 0));
		handler.executar(gerarAgendamento);
	}
}