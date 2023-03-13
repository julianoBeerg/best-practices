package br.com.magna.designpatterns.imposto;

import java.math.BigDecimal;

import br.com.magna.designpatterns.orcamento.Orcamento;

public class CalculadoraImpostos {

	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
		return imposto.calcular(orcamento);

	}
}
