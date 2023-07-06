package br.com.feature.java9;

import java.util.Set;

public class FactoryMethodExemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Ocorera uma Exception , pois o set não permite elementos duplicados
		 * Exception in thread "main" java.lang.IllegalArgumentException: duplicate element:
		 *
		 * List, Map, Set
		 * Metodos para criação deinstancias de coleções imutaveis
		 * Aplicação:
		 *  List.of(...)
		 *  Map.of(...)
		 *  Set.of(...)
		 */

		Set<String> lista = Set.of("Banana", "Maça", "Pera", "Banana", "Maça", "Pera");
		
		for(String s : lista) {
			System.out.println(s);
		}

	}

}
