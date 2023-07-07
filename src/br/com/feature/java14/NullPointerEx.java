package br.com.feature.java14;

class Aluno {

	private String nome = null;
	
	public Aluno() {
	}
	
	public String getNome(){
		return nome;
	}
	public void setNome(String n){
		this.nome = n;
	}
}

public class NullPointerEx {

	/**
	 * Anteriormente, o rastreamento de pilha para um NullPointerException não tinha muita história para contar, exceto que algum valor era nulo em uma determinada
	 * linha em um determinado arquivo.
	 *
	 * Embora úteis, essas informações apenas sugeriram uma linha para depurar, em vez de mostrar a mensagem inteira para um desenvolvedor entender, apenas olhando o log.
	 *
	 * Agora, o Java tornou isso mais fácil adicionando a capacidade de apontar exatamente o que era nulo em uma determinada linha de código.
	 *
	 *
	 * Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.substring(int, int)" because the return value of "br.com.feature.java14.Aluno.getNome()" is null
	 * 	at br.com.feature.java14.NullPointerEx.main(NullPointerEx.java:33)
	 *
	 */

	public static void main(String[] args) {

		Aluno a = new Aluno();
		
		a.getNome().substring(0, 1);
	}
}