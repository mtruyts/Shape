package aula;

/**
 *  A classe TwoDimensionalShape contem metodos que devem ser implantados
 *  nas classes que forem do tipo TwoDimensionalShape
 * 
 * @author Matheus Truyts
 * @version 1.0
 *
 */

public abstract class TwoDimensionalShape extends Shape {
	private double area;

	public double getArea() {
		return area;
	}

	public abstract double calcularArea();

}
