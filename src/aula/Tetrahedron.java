package aula;

/**
 *  A classe Tetrahedron é utilizada para para calcular a area e o volume de um
 *  tetrahedron
 * 
 * @author Matheus Truyts
 * @version 1.0
 *
 */

public class Tetrahedron extends ThreeDimensionalShape {

	private double aresta;

	public Tetrahedron() {
		setAresta(0.0);
	}

	/**
	 * Constructor que recebe o tamanho da aresta do tetrahedron
	 * 
	 * @param a - aresta do tetrahedron
	 */
	public Tetrahedron(double a) {
		setAresta(a);
	}

	/**
	 * Metodo que obtem o tamanho da aresta do tetrahedron
	 * 
	 * @param a - aresta do tetrahedron
	 */
	public void setAresta(double a) {
		aresta = a;
	}

	/**
	 * Metodo que retorna o tamanho da aresta do tetrahedron
	 * 
	 * @return aresta do tetrahedron
	 */
	public double getAresta() {
		return aresta;
	}

	/**
	 * Metodo que calcula a area do tetrahedron
	 * 
	 * @return area do tetrahedron
	 */
	public double calcularArea() {
		return Math.sqrt(3) * Math.pow(getAresta(), 2);
	}

	/**
	 * Metodo que calcula o volume do tetrahedron
	 * 
	 * @return volume do tetrahedron
	 */
	public double calcularVolume() {
		return  Math.pow(getAresta(),3) / (6 * Math.sqrt(2));
	}

	/**
	 * Metodo que imprime o tamanho da aresta do tetrahedron
	 * 
	 * @return aresta do tetrahedron
	 * 
	 */
	@Override
	public String toString() {
		return String.format("%sAresta: %.2f\n",super.toString(),getAresta());
	}


}
