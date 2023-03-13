package br.com.magna.designpatterns.imposto;

import java.math.BigDecimal;

import br.com.magna.designpatterns.orcamento.Orcamento;

public class ICMS implements Imposto{

	public BigDecimal calcular(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}
}
