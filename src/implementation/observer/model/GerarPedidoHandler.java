package implementation.observer.model;

import java.time.LocalDateTime;
import java.util.List;

public class GerarPedidoHandler implements GerarPedidoCommand {

	
	public List<SalvarPedidoExecute> acoes;
	
	public GerarPedidoHandler(List<SalvarPedidoExecute> acoes) {
		this.acoes = acoes;
	}
	
	@Override
	public void executar(GerarPedido dados) {
		Orcamento orcamento = new Orcamento(dados.getValor(), dados.getQuantidadeItens());
		
		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
		
		
		acoes.forEach(acao-> acao.executar(pedido)); //inversão de dependências: ao invés da classe GerarPedidoHandler saber quais são as ações que ela deve executar, ela vai receber
													//quais as ações que ela deve executar				
		/*System.out.print("Salvar pedido no banco de dados" + pedido );
		System.out.print("enviar email" + pedido);
		System.out.print("Producer para Sistema Externo" + pedido);*/
	}
}
