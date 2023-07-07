package br.com.feature.java12;

import java.text.CompactNumberFormat;
import java.text.NumberFormat;
import java.text.NumberFormat.Style;
import java.util.Locale;

public class CompactNumberFormatEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * O Java 12 vem com um novo formatador de números – o CompactNumberFormat.
		 * Ele foi projetado para representar um número de forma mais curta, com base nos padrões fornecidos por um determinado local.
		 *
		 * Podemos obter sua instância por meio do método getCompactNumberInstance na classe NumberFormat:
		 *
		 * public static NumberFormat getCompactNumberInstance(Locale locale, NumberFormat.Style formatStyle)
		 * cópia de
		 * Conforme mencionado anteriormente, o parâmetro locale é responsável por fornecer padrões de formato adequados.
		 * O estilo de formato pode ser CURTO ou LONGO. Para uma melhor compreensão dos estilos de formato, vamos considerar o número 1000 na localidade dos EUA. O estilo CURTO o formataria como “10K” e o LONGO o formataria como “10 mil”.
		 *
		 * Agora, vamos dar uma olhada em um exemplo que pegará os números de curtidas deste artigo e os compactará com dois estilos diferentes:
		 */

		NumberFormat nfPtLong = CompactNumberFormat.getCompactNumberInstance(new Locale("pt", "BR"), NumberFormat.Style.LONG);
		System.out.println("LONG pt --> "+ nfPtLong.format(5008600));

		NumberFormat nfPtShort = CompactNumberFormat.getCompactNumberInstance(new Locale("pt", "BR"), NumberFormat.Style.SHORT);
		System.out.println("SHORT pt -> "+ nfPtShort.format(9608888));

		NumberFormat nfUsLong = CompactNumberFormat.getCompactNumberInstance(Locale.US, Style.LONG);
		System.out.println("LONG us --> "+ nfUsLong.format(8760000));

		NumberFormat nfUsShort = CompactNumberFormat.getCompactNumberInstance(Locale.US, Style.SHORT);
		System.out.println("SHORT us -> "+ nfUsShort.format(5090000));
	}
}
