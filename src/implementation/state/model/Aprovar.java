package implementation.state.model;

import java.math.BigDecimal;

public class Aprovar extends StatusOrcamento {

	@Override
	public BigDecimal calcularDescontoExtra(Orcamento orcamento) {		
		return orcamento.getValor().multiply(new BigDecimal("0.02"));
	}
	
	@Override
	protected void finalizar(Orcamento orcamento) {
		orcamento.setStatus(new Finalizar());
	}
}
