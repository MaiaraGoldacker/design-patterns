package implementation.chainOfResponsability.model;

import java.math.BigDecimal;

public class CalculadoraDeDesconto {

	public BigDecimal calcularDesconto(Orcamento orcamento) {
	Desconto desconto = new DescontoParaCompraComMaisDeCincoItens(
			new DescontoParaCompraMaiorQueDuzentos(new SemDesconto()));
	
		return desconto.calcular(orcamento);
	}
}
	
	
