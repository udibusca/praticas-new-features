package br.com.feature.java12;

import java.util.Scanner;

public class SwitchExpressionsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Digite o dia da semana: ");
		
		Scanner input = new Scanner(System.in);
		
		String dia = input.nextLine();
		
		input.close();
		
		String resultado = "";		
		/*switch (dia) {
			case "segunda":
				resultado = "dia util";
				break;
			case "terça":
				resultado = "dia util";
				break;
			case "quarta":
				resultado = "dia util";
				break;
			case "quinta":
				resultado = "dia util";
				break;
			case "sexta":
				resultado = "dia util";
				break;
			case "sabado":
				resultado = "final de semana";
				break;
			case "domingo":
				resultado = "final de semana";
				break;
			default:
				resultado = "dia invalido";
		}
		
		System.out.println(resultado);*/
		
		resultado = switch (dia) {
			case "segunda", "terça", "quarta", "quinta", "sexta" -> "dia util";
			case "sabado", "domingo" -> "final de semana";
			default -> "dia invilido";
		
		};
		
		System.out.println(resultado);

	}

}
