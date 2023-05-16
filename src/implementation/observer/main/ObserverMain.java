package implementation.observer.main;

import java.math.BigDecimal;
import java.util.List;

import implementation.observer.model.EnviarEmail;
import implementation.observer.model.GerarNotaFiscal;
import implementation.observer.model.GerarPedido;
import implementation.observer.model.GerarPedidoCommand;
import implementation.observer.model.GerarPedidoHandler;
import implementation.observer.model.SalvarPedido;

/*
 * Design pattern que trabalha com inversão de dependência: temos uma classe GerarPedidoHandler que executa várias ações, mas ao invés de ela saber e executar cada ação em si
 * ela recebe quais são as ações que deve executar, via uma lista de ações do tipo da interface implementada.
 * É como se cada ação ficasse 'ouvindo' se deve ser executada, e a classe com as regras executasse as ações, sem saber quais exatamente está chamando.
 * Dessa forma, a classe GerarPedidoHandler também não vai crescer a cada ação executada.
 * 
 */

public class ObserverMain {
	public static void main(String[] args) {
		
		GerarPedido gerarPedido = new GerarPedido("maiara", new BigDecimal(10), 1);
		GerarPedidoCommand handler = new GerarPedidoHandler(List.of(new SalvarPedido(), new GerarNotaFiscal(), new EnviarEmail()));
		handler.executar(gerarPedido);		
	}
}
