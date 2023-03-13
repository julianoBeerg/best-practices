package br.com.magna.designpatterns.orcamento;

import java.math.BigDecimal;

public class Orcamento {

	private BigDecimal valor;
	public Integer quantItens;

	public Orcamento(BigDecimal valor, Integer quantItens) {
		super();
		this.valor = valor;
		this.quantItens = quantItens;
	}

	public BigDecimal getValor() {
		return valor;
	}
	
	public Integer getQuantItens() {
		return quantItens;
	}

}
