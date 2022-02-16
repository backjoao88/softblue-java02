package exercicio2;

/**
 * Classe para representar uma corrida. Respons�vel por instanciar as threads(corredores) e inici�-las.
 * 
 * @author Jo�o Paulo Back
 *
 */
public class Corrida {

	private final static int DISTANCIA_TOTAL = 100; //distancia total a ser percorrida pelos corredores

	private final static int NUM_CORREDORES = 2; // n�mero de corredores (threads)

	public static void main(String[] args) {

		// bloco for que percorrer� todo o n�mero de corredores e ir� instanci�-los 
		
		for (int i = 0; i < NUM_CORREDORES; i++) {
			Corredor corredor = new Corredor(DISTANCIA_TOTAL, i + 1);
			Thread thread = new Thread(corredor);
			thread.start();
		}

	}

}
