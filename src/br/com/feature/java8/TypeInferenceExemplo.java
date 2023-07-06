package br.com.feature.java8;

import java.util.ArrayList;
import java.util.List;

class ProdutoExemlo {
	private String nome;
	private Double preco;
	
	public ProdutoExemlo(String nome, Double preco) {
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

class ImprimeProdutos {
	
	public static void imprime(List<ProdutoExemlo> lista) {
		if(!lista.isEmpty()) {
			lista.forEach(p -> System.out.println(p.getNome()));
		}
		else {
			System.out.println("Lista vazia");
		}
	}
}

public class TypeInferenceExemplo {

	public static void main(String[] args) {
		
		List<ProdutoExemlo> lista = new ArrayList<>();
		
		lista.add(new ProdutoExemlo("TV 42'", 2000.00));
		lista.add(new ProdutoExemlo("Geladeira 470L'", 3200.00));
		lista.add(new ProdutoExemlo("Fogao 4 bocas", 900.00));
		lista.add(new ProdutoExemlo("Videogame", 1999.00));
		lista.add(new ProdutoExemlo("Microondas", 550.00));
		
		//Inferencia de tipo na chamada ao metodo especializado imprime da classe ImprimeProdutos
		ImprimeProdutos.imprime(new ArrayList<>());
		
	}
}
