package br.com.feature.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ProdutoVenda {
	
	private Integer codigo;
	private String nome;
	private Double preco;
	
	public ProdutoVenda() {
		this.codigo = 0;
		this.nome = "";
		this.preco = 0.0;
	}

	public ProdutoVenda(Integer codigo, String nome, Double preco) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
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

class OrdenaProdutoPorPreco implements Comparator<ProdutoVenda> {

	public int compare(ProdutoVenda p1, ProdutoVenda p2) {
		return p1.getPreco().compareTo(p2.getPreco());
	}
} 

public class JavaStreamsExemplo {

	public static void main(String[] args) {
		
		List<ProdutoVenda> listaProdutos = new ArrayList<>();
		
		listaProdutos.add(new ProdutoVenda(1000, "Geladeira 470L", 2999.00));
		listaProdutos.add(new ProdutoVenda(2000, "TV UHD 50''", 3500.00));
		listaProdutos.add(new ProdutoVenda(1001, "TV UHD 65''", 5000.00));
		listaProdutos.add(new ProdutoVenda(3000, "Microondas 20L", 399.00));
		listaProdutos.add(new ProdutoVenda(1001, "Geladeira 120L", 900.00));
		listaProdutos.add(new ProdutoVenda(4000, "Computador i5 2.9Ghz 4GB 1TB HD", 2429.00));
		listaProdutos.add(new ProdutoVenda(1002, "Geladeira 500L", 3100.00));
		
		System.out.println("Usando a forma 'antiga'...");
		
		// Cria lista so de geladeiras
		List<ProdutoVenda> listaGeladeiras = new ArrayList<ProdutoVenda>();
		for(ProdutoVenda p : listaProdutos) {
			if(p.getNome().contains("Geladeira")) {
				listaGeladeiras.add(p);
			}
		}
		
		//Ordena a lista de geladeiras por preço crescente
		Collections.sort(listaGeladeiras, new OrdenaProdutoPorPreco());
		
		//Cria a lista s� de nomes em letras maiusculas das geladeiras
		List<String> listaNomesGeladeiras = new ArrayList<String>();
		for(ProdutoVenda p : listaGeladeiras) {
			listaNomesGeladeiras.add(p.getNome().toUpperCase());
		}
		
		for(String nome : listaNomesGeladeiras) {
			System.out.println(nome);
		}
		
		/*************************************************************/
		
		System.out.println("\nUsando Java Streams...");

		/**
		 * Obtem um fluxo de dados (stream)
		 * Interface Predicate  - filtrar os nomes dos produtos que contem Geladeira
		 * Interface Comparator - ordenar o preco em ordem crescente de acordo com a implemetacao da classe OrdenaProdutoPorPreco
		 * Interface Function   - aplicar uma dada fun��o (toUpperCase) aos elementos dessa stream
		 * Interface Consumer   - percorrer cada elemento da stream e exibi-los no console
		 */

		listaProdutos.stream()
				.filter(p -> p.getNome().contains("Geladeira"))
				.sorted(Comparator.comparing(ProdutoVenda::getPreco))
				.map(p -> p.getNome().toUpperCase())
				.forEach(System.out::println);
	}

}
