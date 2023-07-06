package br.com.feature.java11;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class EscreveArquivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String caminho = "meutexto.txt";
		String meutexto = "Curso Java Topicos Avancados";
		
		/*********************************************************************************/
		
		/*
		 * Escreve fluxos de caracteres (string) em arquivo.
		 * Maneira mais simples ate entao.
		 * Indicado para poucas operaçoes de escrita.
		 */
		
		try(FileWriter myWriter = new FileWriter(caminho)) { 
			myWriter.write(meutexto);
		} 
		catch (IOException e) {
		}
		
		/*********************************************************************************/
		
		/*
		 * Grava o texto em uma stream de saida, usando mecanismo de buffer
		 * para gravação mais eficiente de caracteres.
		 */
		
		try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(caminho))) {
		    bufferedWriter.write(meutexto);
		} 
		catch (IOException e) {
		}
		
		/*********************************************************************************/
		
		try {
			Files.writeString(new File(caminho).toPath(), meutexto, StandardCharsets.ISO_8859_1);
		} 
		catch (IOException e) {
		}
	}
}
