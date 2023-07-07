package br.com.feature.java14;

interface Figura2D {
}

record Retangulo(double largura, double altura) implements Figura2D{
	public static void imprimeNome() {
		System.out.println("Olá ! Eu sou um retângulo.");
	}
}

public class RecordsEx {

	/**
	 * Records (preview) (JEP 359)
	 * Não pode estender ou ser estendido;
	 * Records não podem ser abstratos;
	 * Não pode haver variáveis de instância na estrutura;
	 * Todos os atributos são definidos como privados e final;
	 *
	 * A estrutura permite implementar interfaces;
	 * A estrutura permite métodos estáticos.
	 */
	public static void main(String[] args) {

		Retangulo r1 = new Retangulo(300.0, 200.0);
		
		System.out.println(r1.largura());
		System.out.println(r1.altura());
		
		Retangulo.imprimeNome();
	}
}
