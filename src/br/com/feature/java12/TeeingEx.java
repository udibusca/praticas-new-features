package br.com.feature.java12;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TeeingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Collectors.teeing(soma, qtde, media)

		/**
		 * É um composto de dois coletores a jusante. Cada elemento é processado por ambos os coletores downstream.
		 * Em seguida, seus resultados são passados para a função de mesclagem e transformados no resultado final.
		 *
		 * O exemplo de uso do coletor de saída é contar uma média de um conjunto de números.
		 * O primeiro parâmetro do coletor somará os valores e o segundo nos dará a contagem de todos os números.
		 * A função de mesclagem pegará esses resultados e contará a média:
		 */

		double resultado = Stream.of(50, 10 ,3, 19, 11, 22, 19).collect(
				Collectors.teeing(Collectors.summingDouble(i -> i), Collectors.counting(), (soma, qtde) -> soma / qtde)
		);

		System.out.println(resultado);
	}
}
