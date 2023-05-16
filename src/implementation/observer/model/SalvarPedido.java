package implementation.observer.model;

public class SalvarPedido implements SalvarPedidoExecute {

	@Override
	public void executar(Pedido pedido) {
		System.out.println("Salvar Pedido!");
		
	}

}
