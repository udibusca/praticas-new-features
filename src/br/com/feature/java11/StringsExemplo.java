package br.com.feature.java11;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringsExemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "      ";
		String str2 = "";
		String str3 = "Java Topicos Avançados ";

		//isBlank()
		System.out.println(str1.isBlank());
		System.out.println(str2.isBlank());
		System.out.println(str3.isBlank());
		
		/****************************************************************/
		
		String str4 = "Java\nTopicos\nAvancados";
		
		//lines()
		System.out.println(str4.lines().collect(Collectors.toList()));
		
		/****************************************************************/
		
		//repeat(n)
		System.out.println(str3.repeat(3));
				
		/****************************************************************/
	
		Function<String, String> concatena = (var s) -> s + ". ";

		String multilineString = "Andre Luiz \n \n developers \n explore Java.";
		List<String> lines = multilineString.lines()
				.filter(line -> !line.isBlank())
				.map(String::strip)
				.collect(Collectors.toList());

		System.out.println("-> "+ lines);
	}
}
