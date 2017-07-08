package aula;

/**
 *  A classe Shape contem um metodo que retorna a qual classe pertence cada shape
 * 
 * @author Matheus Truyts
 * @version 1.0
 *
 */

public abstract class Shape {
	@Override
	public String toString() {
		return String.format("%s\n", getClass().getName());
	}
}