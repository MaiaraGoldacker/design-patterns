package implementation.templateMethod.model;

import java.math.BigDecimal;

public class DescontoParaCompraMaiorQueDuzentos extends Desconto {

	public DescontoParaCompraMaiorQueDuzentos(Desconto descontoProximo) {
		super(descontoProximo);
	}

	@Override
	protected boolean deveCalcular(Orcamento orcamento) {
		return orcamento.getValor().compareTo(new BigDecimal(200)) > 0;
	}

	@Override
	protected BigDecimal aplicarDesconto(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal(0.05));		
	}

}
