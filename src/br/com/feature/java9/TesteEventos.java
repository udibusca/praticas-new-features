package br.com.feature.java9;

public class TesteEventos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LogEventosI log = new LogEventosI() {

		};
		
		log.logError("Conexão falhou!");

	}

}
