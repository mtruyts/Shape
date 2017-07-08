package aula;

/**
 *  A classe Circle é utilizada para calcular a area de um circulo 
 * 
 * @author Matheus Truyts
 * @version 1.0
 *
 */

public class Circle extends TwoDimensionalShape {

	private double raio;

	public Circle() {
		setRaio(0.0);
	}

	/**
	 * Constructor que recebe o tamanho do raio do circulo
	 * 
	 * @param r - tamanho do raio do circulo
	 * 
	 */

	public Circle(double r) {
		setRaio(r);
	}

	/**
	 * Metodo que obtem o tamanho do raio do circulo 
	 * 
	 * @param r - tamanho do raio do circulo
	 * 
	 */

	public void setRaio(double r) {
		raio = r;
	}

	/**
	 * Metodo que retorna o tamanho do raio do circulo 
	 * 
	 * @return tamanho do raio do circulo
	 * 
	 */
	public double getRaio() {
		return raio;
	}

	/**
	 * Metodo que calcula a area do circulo 
	 * 
	 * @return area do circulo
	 * 
	 */
	public double calcularArea() {
		return Math.PI * (Math.pow(raio, 2));
	}

	/**
	 * Metodo que imprime o tamanho do raio do circulo
	 * 
	 * @return raio do circulo
	 * 
	 */
	@Override
	public String toString() {
		return String.format("%sRaio: %.2f\n",super.toString(),getRaio());
	}

}
