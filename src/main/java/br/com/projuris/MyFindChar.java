package br.com.projuris;

import java.util.LinkedHashMap;
import java.util.Map;

public class MyFindChar implements FindCharacter {

	public char findChar(String work) {

		// Utilizarei um dicionário ordenado, assim só precisarei iterar 1 vez,
		// reduzindo a complexidade.
		Map<Character, Integer> contaLetras = new LinkedHashMap<Character, Integer>();

		for (Character x : work.toCharArray()) {
			// Se o caractere já está no dicionário, acrescenta ao contador
			if (contaLetras.containsKey(x)) {
				contaLetras.put(x, contaLetras.get(x) + 1);
			} else {
				// Caso não estiver, inicia a contagem para esta letra
				contaLetras.put(x, 1);
			}

		}
		// A interface definiu char, não consigo retornar char vazio, então vou retornar
		// espaço.
		return contaLetras.entrySet().stream() //
				.filter(e -> e.getValue().equals(1)) //
				.map(e -> e.getKey()).findFirst() //
				.orElse(' ');
	}

}
