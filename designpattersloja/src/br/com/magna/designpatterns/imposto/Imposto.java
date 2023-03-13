package br.com.magna.designpatterns.imposto;

import java.math.BigDecimal;

import br.com.magna.designpatterns.orcamento.Orcamento;

public interface Imposto {

	BigDecimal calcular (Orcamento orcamento);
}
