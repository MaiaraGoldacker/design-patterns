package implementation.chainOfResponsability.model;

import java.math.BigDecimal;

public class DescontoParaCompraComMaisDeCincoItens extends Desconto {

	public DescontoParaCompraComMaisDeCincoItens(Desconto descontoProximo) {
		super(descontoProximo);		
	}

	@Override
	public BigDecimal calcular(Orcamento orcamento) {
		if (orcamento.getQuantidadeItens() > 5) {
			return orcamento.getValor().multiply(new BigDecimal(0.1));
		}
		
		return super.proximo.calcular(orcamento);
	}

}
