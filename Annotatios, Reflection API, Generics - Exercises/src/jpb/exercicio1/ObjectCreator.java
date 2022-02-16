package jpb.exercicio1;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ObjectCreator {

	/**
	 * 
	 * Recebe uma classe de um tipo gen�rico, instancia a classe recebida e invoca
	 * todos seus m�todos. 
	 * Ao final retorna uma instancia da classe.
	 * M�todo est�tico.
	 * 
	 * @param clazz Classe a ser instanciada e ter seus m�todos invocados.
	 * @return Instancia da classe
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 */

	public static <T> T create(Class<T> clazz) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		T elemento = clazz.newInstance();
		
		Method[] methods = clazz.getDeclaredMethods();
		
		for (Method m : methods) {
			Init ann = m.getAnnotation(Init.class);
			if(ann.runOnInstantiation()) {
				m.invoke(elemento, 2, 2);
			}
		}
		
		return elemento;

	}

}
