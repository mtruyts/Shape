package aula;

/**
 *  A classe Cube é utilizada para calcular a area e o volume de um cubo
 * 
 * @author Matheus Truyts
 * @version 1.0
 *
 */

public class Cube extends ThreeDimensionalShape {

	private double aresta;

	public Cube() {
		setAresta(0.0);
	}

	/**
	 * Construtor que recebe o tamanho da aresta do cubo
	 * 
	 * @param a - aresta do cubo
	 */
	public Cube(double a) {
		setAresta(a);
	}

	/**
	 * Metodo que obtem o tamanho da aresta do cubo
	 * 
	 * @param a - aresta do cubo
	 * 
	 */
	public void setAresta(double a) {
		aresta = a;
	}

	/**
	 * Metodo que retorna o tamanho da aresta do cubo
	 * 
	 * @return tamanho da aresta do cubo
	 * 
	 */
	public double getAresta() {
		return aresta;
	}

	/**
	 * Metodo que calcula a area do cubo
	 * 
	 * @return area do cubo
	 * 
	 */
	public double calcularArea() {
		return 6 * Math.pow(getAresta(),2);
	}

	/**
	 * Metodo que calcula o volume do cubo
	 * 
	 * @return volume do cubo
	 * 
	 */
	public double calcularVolume() {
		return  Math.pow(getAresta(),3);
	}

	/**
	 * Metodo que imprime o tamanho da aresta do cubo
	 * 
	 * @return aresta do cubo
	 * 
	 */
	@Override
	public String toString() {
		return String.format("%sAresta: %.2f\n",super.toString(),getAresta());
	}
}
