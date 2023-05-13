package implementation.state.model;

import java.math.BigDecimal;

public class Orcamento {
	
	private BigDecimal valor;
	private int quantidadeItens;
	private StatusOrcamento status;
	
	public Orcamento(BigDecimal valor, int quantidadeItens) {
		this.valor = valor;
		this.quantidadeItens = quantidadeItens;
		this.status = new EmAnalise(); //quando criar um orçamento, já está automaticamente em análise
	}
	
	public BigDecimal getValor() {
		return this.valor;
	}
	
	public int getQuantidadeItens() {
		return this.quantidadeItens;
	}
	
	public StatusOrcamento getStatus() {
		return this.status;
	}

	public void setStatus(StatusOrcamento statusOrcamento) {
		this.status = statusOrcamento;
	}
	

	public BigDecimal setDescontoExtra(Orcamento orcamento) {	
		return orcamento.getStatus().calcularDescontoExtra(orcamento);
	}
	
	public void aprovar() {
		this.status.aprovar(this);
	}
	
	public void reprovar() {
		this.status.reprovar(this);
	}
	
	public void finalizar() {
		this.status.finalizar(this);
	}	
}
