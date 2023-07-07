package br.com.feature.java12;

public class StringEx {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    /**
     * O Java 12 vem com dois novos métodos na classe String.
     */

    /**
     * O primeiro - recuo ajusta o recuo de cada linha com base no parâmetro inteiro.
     * Se o parâmetro for maior que zero, novos espaços serão inseridos no início de cada linha.
     * Por outro lado, se o parâmetro for menor que zero, remove espaços do início de cada linha.
     * Se uma determinada linha não contiver espaço em branco suficiente, todos os caracteres iniciais de espaço em branco serão removidos.
     *
     * Agora, vamos dar uma olhada em um exemplo básico. Primeiramente, vamos recuar o texto com quatro espaços,
     * e então vamos remover todos o recuo:
     */
		String text = "Hello Modulo Java 12!\nEste é só mais um teste.";

		text = text.indent(4);
		System.out.println(text);
    /**
     * Observe que, mesmo que passemos o valor -10, que excede nossa contagem de recuo, apenas os espaços foram afetados.
     * Outros personagens são deixados intactos.
     */
		text = text.indent(-10);
		System.out.println(text);

    /**
     * O segundo novo método é transform. Ele aceita uma única função de argumento como parâmetro que será aplicado à string.
     *
     * Como exemplo, vamos usar o método transform para reverter a string:
     */

    String texto = "Olá Mundo!\nEste é o modulo Java 12.";

    String textoInvertido = texto.transform(s -> new StringBuilder(s).reverse().toString());

    System.out.println(textoInvertido);
  }
}
