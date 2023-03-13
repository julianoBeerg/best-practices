package br.com.magna.designpatterns.desconto;

import java.math.BigDecimal;

import br.com.magna.designpatterns.orcamento.Orcamento;

public class DescontoParaOrcamentoComValorMaiorQue500 {

	public BigDecimal calcular (Orcamento orcamento) {
		if(orcamento.getValor().compareTo(new BigDecimal("500")) > 0) {
			return orcamento.getValor().multiply(new BigDecimal("0.05"));
		}
		
		return BigDecimal.ZERO;
	}
}
