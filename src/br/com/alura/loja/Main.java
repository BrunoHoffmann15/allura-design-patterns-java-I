package br.com.alura.loja;

import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class Main {
    public static void main(String []args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("1000"));
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
        System.out.println("Imposto ICMS: " + calculadoraDeImpostos.calcular(orcamento, new ISS()));
    }
}
