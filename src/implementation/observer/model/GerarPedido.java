package implementation.observer.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

//Classe que representa apenas os dados para a execução dos métodos do command
public class GerarPedido {
	
	private String cliente;
	private BigDecimal valor;
	private int quantidadeItens;
	private LocalDateTime horaEntrega;
	
	public GerarPedido(String cliente, BigDecimal valor, int quantidadeItens,  LocalDateTime horaEntrega) {
		this.cliente = cliente;
		this.valor = valor;
		this.quantidadeItens = quantidadeItens;
		this.horaEntrega = horaEntrega;
	}
	
	public GerarPedido(String cliente, BigDecimal valor, int quantidadeItens) {
		this.cliente = cliente;
		this.valor = valor;
		this.quantidadeItens = quantidadeItens;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public int getQuantidadeItens() {
		return quantidadeItens;
	}

	public void setQuantidadeItens(int quantidadeItens) {
		this.quantidadeItens = quantidadeItens;
	}

	public LocalDateTime getHoraEntrega() {
		return horaEntrega;
	}
}
