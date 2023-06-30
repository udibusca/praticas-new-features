package br.com.feature.java8;

//Functional interface
interface Figura2DEx1 {
	void desenha(Double largura, Double altura);
}

//Observe que a classe Retangulo nao esta implementando a interface Figura
class RetanguloEx1 {
	
	public void desenhaRetangulo(Double largura, Double altura) {
		System.out.println("Desenha retangulo de Largura: " + largura + " e Altura: " + altura);
	}
}

//Refer?ncia a um metodo de instancia de um objeto particular
public class MethodReferencesExemplo01 {

	public static void main(String[] args) {
		
		//Lambda expression
		Figura2DEx1 figura2DEx1 = (l, a) -> System.out.println("Desenha retangulo de Largura: " + l + " e Altura: " + a);

		figura2DEx1.desenha(8.0, 1.5);
		
		/*************************************************************/
		
		// Objeto especifico
		RetanguloEx1 retanguloEx1 = new RetanguloEx1();
		/* Method reference
		* Refer?ncia a um metodo de inst?ncia (desenhaRetangulo) de um objeto particular (ret)
		*/
		Figura2DEx1 figura2DEx11 = retanguloEx1::desenhaRetangulo;

		figura2DEx11.desenha(10.5, 7.0);
	}
}
