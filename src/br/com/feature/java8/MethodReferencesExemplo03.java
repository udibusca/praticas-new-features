package br.com.feature.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class ProdutoEx3 {
	private String nome;
	private Double preco;
	
	public ProdutoEx3(String nome, Double preco) {
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
	
	public void imprime() {
		System.out.println(nome + " = " + preco);
	}
}

public class MethodReferencesExemplo03 {
	
	public static void main(String[] args) {
		
		List<ProdutoEx3> lista = new ArrayList<>();
		
		lista.add(new ProdutoEx3("TV 42'", 2000.00));
		lista.add(new ProdutoEx3("Geladeira 470L'", 3200.00));
		lista.add(new ProdutoEx3("Fogao 4 bocas", 900.00));
		lista.add(new ProdutoEx3("Videogame", 1999.00));
		lista.add(new ProdutoEx3("Microondas", 550.00));
		
		/* Method reference
		*  Referencia a um metodo de instancia (imprime) de um objeto arbitrario (?) a partir de um tipo especefico (Produto)
		*/
		lista.forEach(ProdutoEx3::imprime);
		
	}
}
