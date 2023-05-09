package implementation.strategy.model;

import java.math.BigDecimal;

public class CalculadoraImposto {
	
	public BigDecimal calcular (BigDecimal valor, Imposto imposto) {
		return imposto.calcularImposto(valor);		
	}

}
