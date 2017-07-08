package aula;

/**
 *  A classe Square é utilizada para calcular a area de um quadrado
 * 
 * @author Matheus Truyts
 * @version 1.0
 *
 */

public class Square extends TwoDimensionalShape {

	private double comprimento;

	public Square() {
		setComp(0.0);
	}

	/**
	 * Construtor que recebe o comprimento do quadrado
	 * 
	 * @param c - comprimento do quadrado
	 */
	public Square(double c) {
		setComp(c);
	}

	/**
	 * Metodo que obtem o comprimento do quadrado
	 * 
	 * @param c - comprimento do quadrado
	 */
	public void setComp(double c) {
		comprimento = c;
	}

	/**
	 * Metodo que retorna o comprimento do quadrado
	 * 
	 * @return comprimento do quadrado
	 */
	public double getComp() {
		return comprimento;
	}

	/**
	 * Metodo que calcula a area do quadrado
	 * 
	 * @return area do quadrado
	 */
	@Override
	public double calcularArea() {
		return Math.pow(getComp(), 2); 
	}

	/**
	 * Metodo que imprime o comprimento do quadrado
	 * 
	 * @return comprimento do quadrado
	 * 
	 */
	@Override
	public String toString() {
		return String.format("%sComprimento: %.2f\n",super.toString(),getComp());
	}
}
