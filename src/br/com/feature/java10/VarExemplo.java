package br.com.feature.java10;

import java.util.List;

public class VarExemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Inferência de tipos em variáveis locais Palavra-reservada var
		 *  - Deve ser declarada como local e inicializada;
		 *  - Pode ser usado no Enhanced For Loop;
		 *  - Pode ser usado como índice laço For tradicional.
		 *
		 */

		var listaDeFrutas = List.of("banana", "maça", "abacaxi");
		
		//Enhanced For
		for(var fruta : listaDeFrutas) {
			System.out.println(fruta);
		}
		
		//indice laço For
		for(var i=0; i < listaDeFrutas.size(); i++) {
			System.out.println(listaDeFrutas.get(i));
		}
		
		var e = new ArrayIndexOutOfBoundsException();
	}
}
