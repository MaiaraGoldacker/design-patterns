package implementation.templateMethod.model;

import java.math.BigDecimal;

public class DescontoParaCompraComMaisDeCincoItens extends Desconto {

	public DescontoParaCompraComMaisDeCincoItens(Desconto descontoProximo) {
		super(descontoProximo);		
	}

	@Override
	protected boolean deveCalcular(Orcamento orcamento) {		
		return orcamento.getQuantidadeItens() > 5;
	}

	@Override
	protected BigDecimal aplicarDesconto(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal(0.1));		
	}

}
