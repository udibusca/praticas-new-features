package br.com.feature.java8;

/**
 * https://docs.oracle.com/javase/8/docs/api/java/lang/FunctionalInterface.html
 * Functional interface -> contem um unico metodo abstrato
 */
@FunctionalInterface
interface Figura2D {
	Retangulo desenha(Double largura, Double altura);
}

class Retangulo {
	
	public Retangulo(Double largura, Double altura) {
		System.out.println("Desenha ret�ngulo de Largura: " + largura + " e Altura: " + altura);
	}
}

public class MethodReferencesExemplo04 {

	public static void main(String[] args) {
		
		/**
		 * Method reference
		* Refer�ncia a um construtor
		*/
		Figura2D fig1 = Retangulo::new;
		
		fig1.desenha(10.5, 7.0);

	}

}
