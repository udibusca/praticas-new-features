package br.com.feature.java12;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MismatchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f1 = new File ("texto1.txt");
		
		File f2 = new File ("texto2.txt");

		/**
		 * O método é usado para comparar dois arquivos e encontrar a posição do primeiro byte incompatível em seu conteúdo.
		 *
		 * O valor de retorno estará no intervalo inclusivo de 0L até o tamanho do byte do arquivo menor ou -1L se os arquivos forem idênticos.
		 *
		 * Agora vamos dar uma olhada em dois exemplos. Na primeira, criaremos dois arquivos idênticos e tentaremos encontrar uma incompatibilidade.
		 * O valor de retorno deve ser -1L:
		 */

		try {
			// Exemplo 1
			Path filePath1 = Files.createTempFile("arquivo1", ".txt");
			Path filePath2 = Files.createTempFile("arquivo2", ".txt");
			Files.writeString(filePath1, "Java 12 novas features");
			Files.writeString(filePath2, "Java 12 Tutorial");

			long resultado = Files.mismatch(filePath1, filePath2);
			
			System.out.println("Arquivos diferente -> "+ resultado);

			//Exemplo 2
			Path filePath3 = Files.createTempFile("arquivo3", ".txt");
			Path filePath4 = Files.createTempFile("arquivo4", ".txt");
			Files.writeString(filePath3, "Java 12 novas features");
			Files.writeString(filePath4, "Java 12 novas features");

			long mismatch = Files.mismatch(filePath3, filePath4);

			System.out.println("Arquivos iguais ----> "+ mismatch);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
