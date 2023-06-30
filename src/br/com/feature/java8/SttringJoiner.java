package br.com.feature.java8;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class SttringJoiner {

  public static void main(String[] args) {

    /**
     * Utilizando o StringTokenizer que existe desde a versão 1 do java
     */
    String nomes = " Andre, Natasha, Maria, João, José";

    StringTokenizer stringTokenizer = new StringTokenizer(nomes, ",");

    while (stringTokenizer.hasMoreTokens()) {
      System.out.println(stringTokenizer.nextToken());
    }

    /**
     * Utilizando o StringJoin apartir da versão 8
     */
    StringJoiner stringJoiner = new StringJoiner(",");

    stringJoiner.add("Rosamaria");
    stringJoiner.add("Fernades");
    stringJoiner.add("Paula");

    System.out.println(stringJoiner);

  }
}
