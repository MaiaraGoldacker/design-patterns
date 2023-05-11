package implementation.templateMethod.model;

import java.math.BigDecimal;

public abstract class Desconto {

	protected Desconto proximo;
	
	public Desconto(Desconto descontoProximo) {
		this.proximo = descontoProximo;
	}
	
	public BigDecimal calcular(Orcamento orcamento) {
		if (deveCalcular(orcamento)) {
			return aplicarDesconto(orcamento);
		}
		return null;
	}
	
	protected abstract boolean deveCalcular(Orcamento orcamento);
	
	protected abstract BigDecimal aplicarDesconto(Orcamento orcamento);
}
