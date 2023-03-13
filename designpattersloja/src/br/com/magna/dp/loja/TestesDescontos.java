package br.com.magna.dp.loja;

import java.math.BigDecimal;

import br.com.magna.designpatterns.desconto.CalculadoraDesconto;
import br.com.magna.designpatterns.orcamento.Orcamento;

public class TestesDescontos {

	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento(new BigDecimal("100"), 4);
		
		CalculadoraDesconto calculadoraDesconto = new CalculadoraDesconto();
		System.out.println(calculadoraDesconto.calcular(orcamento));

	}

}
