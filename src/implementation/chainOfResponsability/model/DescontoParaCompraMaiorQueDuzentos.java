package implementation.chainOfResponsability.model;

import java.math.BigDecimal;

public class DescontoParaCompraMaiorQueDuzentos extends Desconto {

	public DescontoParaCompraMaiorQueDuzentos(Desconto descontoProximo) {
		super(descontoProximo);
	}

	@Override
	public BigDecimal calcular(Orcamento orcamento) {
		if (orcamento.getValor().compareTo(new BigDecimal(200)) > 0) {
			return orcamento.getValor().multiply(new BigDecimal(0.05));
		}
		return super.proximo.calcular(orcamento);
	}

}
