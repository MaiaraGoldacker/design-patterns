package implementation.strategy.model;

import java.math.BigDecimal;

public class ISS implements Imposto {

	@Override
	public BigDecimal calcularImposto(BigDecimal total) {		
		return total.multiply(new BigDecimal("0.06"));
	}

}
