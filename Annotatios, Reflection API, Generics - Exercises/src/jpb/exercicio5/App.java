package jpb.exercicio5;

public class App {
	
	/**
	 * 
	 * Recebe um array de um tipo T por par�metro e um elemento do tipo T, realiza a 
	 * contagem de quantos elementos do array s�o maiores que element.
	 * M�todo est�tico.
	 * 
	 * @param array array do tipo T
	 * @param element element do tipo T
	 * @return retorna quantos elementos do array s�o maiores que element
	 */

	public static <T extends Comparable<T>> int countElementsBiggerThan(T[] array, T element) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i].compareTo(element) == 1) {
				count++;
			}
		}
		return count;
	}
	

}
