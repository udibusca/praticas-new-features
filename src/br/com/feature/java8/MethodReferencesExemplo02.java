package br.com.feature.java8;

import java.util.ArrayList;
import java.util.List;

class ProdutoEx2 {
	private String nome;
	private Double preco;
	
	public ProdutoEx2(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
}

class Impressora {
	
	public static void imprime(ProdutoEx2 p) {
		System.out.println(p.getNome() + " = " + p.getPreco());
	}
}

public class MethodReferencesExemplo02 {
	
	public static void main(String[] args) {
		
		List<ProdutoEx2> lista = new ArrayList<>();
		
		lista.add(new ProdutoEx2("TV 42'", 2000.00));
		lista.add(new ProdutoEx2("Geladeira 470L'", 3200.00));
		lista.add(new ProdutoEx2("Fog�o 4 bocas", 900.00));
		lista.add(new ProdutoEx2("Videogame", 1999.00));
		lista.add(new ProdutoEx2("Microondas", 550.00));
		
		/*Method reference 
		* Refer�ncia a um metodo estatico (imprime)
		*/
		lista.forEach(Impressora::imprime);
		
	}
}
