package br.com.magna.designpatterns.desconto;

import java.math.BigDecimal;

import br.com.magna.designpatterns.orcamento.Orcamento;

public class DescontoParaOrcamentoComMaisDeCincoItens {

	public BigDecimal calcular (Orcamento orcamento) {
		if (orcamento.getQuantItens() > 5) {
			return orcamento.getValor().multiply(new BigDecimal("0.1"));
		}
		
		return BigDecimal.ZERO;
	}
}
