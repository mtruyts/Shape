package aula;

/**
 *  A classe Triangle é utilizada para calcular a area de um triangulo
 * 
 * @author Matheus Truyts
 * @version 1.0
 *
 */

public class Triangle extends TwoDimensionalShape {

	private double base;
	private double altura;

	public Triangle() {
		setBase(0.0);
		setAltura(0.0);
	}

	/**
	 * Construtor que recebe o tamanho da base e a altura do triângulo
	 * 
	 * @param b - base do triangulo
	 * @param a - altura do triangulo
	 */
	public Triangle(double b, double a) {
		setBase(b);
		setAltura(a);
	}

	/**
	 * Metodo que obtem o tamanho da base do triângulo
	 * 
	 * @param b - base do trinagulo
	 */
	public void setBase(double b) {
		base = b;
	}

	/**
	 * Metodo que obtem a altura do triângulo
	 * 
	 * @param a - altura do triangulo
	 */
	public void setAltura(double a) {
		altura = a;
	}

	/**
	 * Metodo que retorna o tamanho da base do triângulo
	 * 
	 * @return base do triangulo 
	 */
	public double getBase() {
		return base;
	}

	/**
	 * Metodo que retorna a altura do triângulo
	 * 
	 * @return altura do triangulo
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * Metodo que calcula a area do triangulo
	 * 
	 * @return area do triangulo
	 */
	@Override
	public double calcularArea() {
		return (getBase() * getAltura()) / 2;
	}

	/**
	 * Metodo que imprime a altura e a base do triangulo
	 * 
	 * @return altura do triangulo
	 * @return base do triangulo
	 * 
	 */
	@Override
	public String toString() {
		return String.format("%sBase: %.2f\nAltura: %.2f\n",super.toString(),getBase(),getAltura());
	}




}
