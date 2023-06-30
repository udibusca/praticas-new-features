package br.com.feature.java8;

interface Figura {
  void desenha();
}

//Classe concreta implementa a interface Figura
class Circunferencia implements Figura {

  @Override
  public void desenha() {
    System.out.println("\nClasse Circunferencia: desenha circunferêancia.");
  }
}

public class LambdaExemplo01 {

  public static void main(String[] args) {

    // Implementação sem lambda expression - utilizando classe concreta
    Circunferencia circunferencia = new Circunferencia();
    circunferencia.desenha();

    /*************************************************************/

    // Implementação sem lambda expression - utilizando classe anônima
    Figura figura = new Figura() {

      @Override
      public void desenha() {
        System.out.println("\nInterface Figura: desenha circunferencia.");
      }
    };
    figura.desenha();

    /*************************************************************/

    //Lambda expression sem argumentos
    Figura figura1 = () -> System.out.println("\nLambda Expression: desenha circunferencia.");
    figura1.desenha();

    /*************************************************************/

    //Lambda expression sem argumentos e com multiplos metodos
    Figura figura2 = () -> {
      System.out.println("\nLambda Expression - multiplos metodos:");
      System.out.println("desenha circunferencia.");
    };
    figura2.desenha();
  }

}