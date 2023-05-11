package implementation.templateMethod.model;

import java.math.BigDecimal;

public class SemDesconto extends Desconto {

	public SemDesconto() {
		super(null);
	}

	@Override
	protected boolean deveCalcular(Orcamento orcamento) {
		return true;
	}

	@Override
	protected BigDecimal aplicarDesconto(Orcamento orcamento) {
		return BigDecimal.ZERO;
		
	}

}
