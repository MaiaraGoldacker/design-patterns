package implementation.strategy.model;

import java.math.BigDecimal;

public interface Imposto {
	
	BigDecimal calcularImposto(BigDecimal total);

}
