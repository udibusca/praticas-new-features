package br.com.feature.java8;

public class ThreadExemplo {

  public static void main(String[] args) {

    //Thread SEM lambda
    Thread t1 = new Thread(new Runnable() {

      @Override
      public void run() {
        System.out.println("Thread 1 em execucao...");
      }
    });
    t1.start();

    //Thread COM lambda
    Thread t2 = new Thread(() -> {
      System.out.println("Thread 2 em execucao...");
    });
    t2.start();

  }
}
