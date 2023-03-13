package br.com.magna.dp.loja;
import java.math.BigDecimal;

import br.com.magna.designpatterns.imposto.CalculadoraImpostos;
import br.com.magna.designpatterns.imposto.ICMS;
import br.com.magna.designpatterns.imposto.ISS;
import br.com.magna.designpatterns.orcamento.Orcamento;

public class TestesImpostos {

	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento(new BigDecimal("100"), 6);
		CalculadoraImpostos calculadoraImpostos = new CalculadoraImpostos();
		System.out.println(calculadoraImpostos.calcular(orcamento, new ISS()));
		System.out.println(calculadoraImpostos.calcular(orcamento, new ICMS()));
	}

}
