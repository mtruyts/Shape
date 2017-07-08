package aula;

/**
 *  A classe Sphere é utilizada para calcular a area e o volume de uma esfera 
 * 
 * @author Matheus Truyts
 * @version 1.0
 *
 */

public class Sphere extends ThreeDimensionalShape{

	private double raio;

	public Sphere() {
		setRaio(0.0);
	}

	/**
	 * Construtor que recebe o tamanho do raio da esfera
	 * 
	 * @param r - raio da esfera
	 */
	public Sphere(double r) {
		setRaio(r);
	}

	/**
	 * Metodo que obtem o tamanho do raio da esfera
	 * 
	 * @param r - raio da esfera
	 */
	public void setRaio(double r) {
		raio = r;
	}

	/**
	 * Metodo que retorna o tamanho do raio da esfera
	 * 
	 * @return tamanho do raio da esfera
	 */
	public double getRaio() {
		return raio;
	}

	/**
	 * Metodo que calcula a area da esfera
	 * 
	 * @return area da esfera
	 */
	public double calcularArea() {
		return (4 * Math.PI) * (Math.pow(getRaio(),2)); 
	}

	/**
	 * Metodo que calcula o volume da esfera
	 * 
	 * @return volume da esfera
	 */
	public double calcularVolume() {
		double v = 4/3;
		return (1.3333 * Math.PI) * (Math.pow(getRaio(),3));
	}

	/**
	 * Metodo que imprime o tamanho do raio da esfera
	 * 
	 * @return raio do cubo
	 * 
	 */
	@Override
	public String toString() {
		return String.format("%sRaio: %.2f\n",super.toString(),getRaio());
	}
}
