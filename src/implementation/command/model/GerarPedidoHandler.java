package implementation.command.model;


public class GerarPedidoHandler implements GerarPedidoCommand {

	@Override
	public void executar(GerarPedido dados) {
		Orcamento orcamento = new Orcamento(dados.getValor(), dados.getQuantidadeItens());
		
		Pedido pedido = new Pedido(dados.getCliente(), dados.getHoraEntrega(), orcamento);
		
		System.out.println("Salvar pedido no banco de dados" + pedido.toString() );
		System.out.println("enviar email" + pedido.toString());
		System.out.println("Producer para Sistema Externo" + pedido.toString());
	}
}
