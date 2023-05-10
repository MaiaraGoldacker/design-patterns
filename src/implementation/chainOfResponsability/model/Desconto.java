package implementation.chainOfResponsability.model;

import java.math.BigDecimal;

public abstract class Desconto {

	protected Desconto proximo;
	
	public Desconto(Desconto descontoProximo) {
		this.proximo = descontoProximo;
	}
	
	public abstract BigDecimal calcular(Orcamento orcamento);
}
