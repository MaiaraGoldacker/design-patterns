package implementation.state.model;

import java.math.BigDecimal;

public class EmAnalise extends StatusOrcamento {

	@Override
	public BigDecimal calcularDescontoExtra(Orcamento orcamento) {		
		return orcamento.getValor().multiply(new BigDecimal("0.05"));
	}
	
	@Override
	protected void aprovar(Orcamento orcamento) {		
		orcamento.setStatus(new Aprovar());
	}
	
	@Override
	protected void reprovar(Orcamento orcamento) {		
		orcamento.setStatus(new Reprovar());
	}
}
