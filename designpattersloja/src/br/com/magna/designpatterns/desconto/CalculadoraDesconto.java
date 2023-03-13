package br.com.magna.designpatterns.desconto;

import java.math.BigDecimal;

import br.com.magna.designpatterns.orcamento.Orcamento;

public class CalculadoraDesconto {

	public BigDecimal calcular(Orcamento orcamento) {
		
		BigDecimal desconto= new  DescontoParaOrcamentoComMaisDeCincoItens().calcular(orcamento);
		if (desconto ==BigDecimal.ZERO) {
			desconto = new DescontoParaOrcamentoComValorMaiorQue500().calcular(orcamento); 	 	 
		}
		return BigDecimal.ZERO;
	}
}
