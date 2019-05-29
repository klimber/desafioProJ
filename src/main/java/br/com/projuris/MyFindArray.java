package br.com.projuris;

import java.util.Arrays;

public class MyFindArray implements FindArray {
	
	// Recebe 2 arrays, cria recortes do 1ro array com o tamanho do 2do.
	// Para cada recorte que for igual ao 2do array, salva a posição do 1ro array
	public int findArray(int[] array, int[] subArray) {
		int position = -1;
		for (int x = 0; x < array.length - subArray.length; x++) {
			if (Arrays.equals(Arrays.copyOfRange(array, x, x + subArray.length), subArray)) {
				position = x;
			}
		}
		return position;
		
		// Tentei fazer com Collections.lastIndexOfSubList, mas pelo que vi não poderia ser com primitivos.
		// Collections.lastIndexOfSubList(Arrays.asList(array), Arrays.asList(subArray));
	}
}
