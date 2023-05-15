package implementation.command.model;

import java.time.LocalDateTime;

public class GerarPedidoHandler implements GerarPedidoCommand {

	@Override
	public void executar(GerarPedido dados) {
		Orcamento orcamento = new Orcamento(dados.getValor(), dados.getQuantidadeItens());
		
		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
		
		System.out.print("Salvar pedido no banco de dados" + pedido );
		System.out.print("enviar email" + pedido);
		System.out.print("Producer para Sistema Externo" + pedido);
	}
}
