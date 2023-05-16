package implementation.observer.model;

public class GerarNotaFiscal implements SalvarPedidoExecute {

	@Override
	public void executar(Pedido pedido) {
		System.out.println("Nova Fiscal Gerada!");		
	}

}
