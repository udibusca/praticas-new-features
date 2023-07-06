package br.com.feature.java9;

import java.math.BigDecimal;

public class InferenciaExemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Classe interna anonima exe 1
		SomaQualquerCoisa<String> somaString = new SomaQualquerCoisa<>() {

			@Override
			public String soma(String a, String b) {
				// TODO Auto-generated method stub
				return a + b;
			}
		};
		System.out.println(somaString.soma("Olá", " mundo!"));

    //Classe interna anonima exe 2
		SomaQualquerCoisa<Integer> somaInt = new SomaQualquerCoisa<>() {

			@Override
			public Integer soma(Integer a, Integer b) {
				return a + b;
			}
		};
		System.out.println(somaInt.soma(5, 14));

		//Classe interna anonima exe 3 -> Pode ser substituído por referência de método
		SomaQualquerCoisa<BigDecimal> somaBigDecimal = (SomaQualquerCoisa<BigDecimal>) BigDecimal::add;

		System.out.println(somaBigDecimal.soma(new BigDecimal(5), new BigDecimal(56)));

	}
}
