package br.com.feature.java13;

import java.util.Scanner;

public class SwitchExpressionsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Inicialmente, vimos as expressões switch no JDK 12. As expressões switch do Java 13 se baseiam na versão anterior
		 * adicionando uma nova instrução yield.
		 *
		 * Usando yield, agora podemos efetivamente retornar valores de uma expressão switch:
		 */

		System.out.println("Digite o dia da semana: ");
		Scanner input = new Scanner(System.in);
		String dia = input.nextLine();
		input.close();
		
		String resultado =switch (dia) {
			case "segunda":
				yield "dia util";
			case "terça":
				yield "dia util";
			case "quarta":
				yield "dia util";
			case "quinta":
				yield "dia util";
			case "sexta":
				yield "dia util";
			case "sabado":
				yield "final de semana";
			case "domingo":
				yield "final de semana";
			default:
				yield "dia invalido";
		};
		System.out.println(resultado);


		var me = 4;
		var operation = "multiplica";
		var result = switch (operation) {
			case "dobra" -> {
				yield me * 2;
			}
			case "multiplica" -> {
				yield me * me;
			}
			default -> me;
		};

		System.out.println(result);

	}

}
