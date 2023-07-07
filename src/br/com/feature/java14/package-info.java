package br.com.feature.java14;

/**
 * Correspondência de padrões para instanceof (JEP 305)
 * O JDK 14 introduziu a correspondência de padrões para instanceof com o objetivo de eliminar o código clichê e facilitar um pouco a vida do desenvolvedor.
 *
 *
 * freestar
 * Para entender isso, vamos considerar um exemplo simples.
 *
 * Antes desse recurso, escrevemos:
 *
 * if (obj instância de String) {
 *     String str = (String) obj;
 *     int len = str.length();
 *     // ...
 * }
 *
 * Agora, não precisamos de tanto código para começar a usar obj como String:
 *
 * if (obj instanceof String str) {
 *     int len = str.length();
 *     // ...
 * }
 *
 * Em versões futuras, o Java apresentará correspondência de padrões para outras construções, como um switch.
 *
 * */