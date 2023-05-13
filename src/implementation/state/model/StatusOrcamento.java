package implementation.state.model;

import java.math.BigDecimal;

import implementation.state.exception.DomainException;

public abstract class StatusOrcamento {
	
	public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}
	
	protected void analizar(Orcamento orcamento){
		throw new DomainException("Não é possível passar o orçamento para o status EM ANÁLISE");
	}
	
	protected void finalizar(Orcamento orcamento){
		throw new DomainException("Não é possível passar o orçamento para o status FINALIZADO");
	}
	
	protected void aprovar(Orcamento orcamento){
		throw new DomainException("Não é possível passar o orçamento para o status APROVADO");
	}

	protected void reprovar(Orcamento orcamento){
		throw new DomainException("Não é possível passar o orçamento para o status REPROVADO");
	}

}
