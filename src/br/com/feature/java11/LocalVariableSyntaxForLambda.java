package br.com.feature.java11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LocalVariableSyntaxForLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<String, String> concatena = (String s) -> s + ". ";
	
		//var em lambda expression
		Function<String, String> concatena2 = (var s) -> s + ". ";

		List<String> list = Arrays.asList("Java", "Kotlin");
		String resultString = list.stream()
				.map((var x) -> x.toUpperCase())
				.collect(Collectors.joining(", "));

		System.out.println(resultString);
	}
}
