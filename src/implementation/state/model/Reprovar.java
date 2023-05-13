package implementation.state.model;

public class Reprovar extends StatusOrcamento {
	
	@Override
	protected void finalizar(Orcamento orcamento) {
		orcamento.setStatus(new Finalizar());
	}

}
