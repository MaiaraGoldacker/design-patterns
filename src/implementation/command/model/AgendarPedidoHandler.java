package implementation.command.model;


public class AgendarPedidoHandler implements GerarPedidoCommand {

	@Override
	public void executar(GerarPedido dados) {
	Orcamento orcamento = new Orcamento(dados.getValor(), dados.getQuantidadeItens());
		
		Pedido pedido = new Pedido(dados.getCliente(), dados.getHoraEntrega(), orcamento);
		
		System.out.print("Salvar pedido no banco de dados" + pedido );
		System.out.print("enviar email" + pedido);
		System.out.print("Producer para Sistema Externo" + pedido);
		
	}

}
