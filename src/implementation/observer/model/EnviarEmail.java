package implementation.observer.model;

public class EnviarEmail implements SalvarPedidoExecute {

	@Override
	public void executar(Pedido pedido) {
		System.out.println("Email Pedido enviado!");		
	}
}
