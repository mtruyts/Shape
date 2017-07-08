package aula;

/**
 * Classe que executa o programa
 * 
 * @author Matheus Truyts
 * @version 1.0
 * 
 */

public class Principal {

	/**
	 * Metodo principal da aplicacao responsavel por executar o programa
	 * 
	 * @param args
	 * 
	 */ 

	public static void main(String[] args) {
		Shape[] shapes = new Shape[6];

		shapes[0] = new Square(3.3);
		shapes[1] = new Triangle(1.2, 1.2);
		shapes[2] = new Circle(1.6);
		shapes[3] = new Sphere(1.8);
		shapes[4] = new Cube(2.2);
		shapes[5] = new Tetrahedron(1.4);

		for(Shape s : shapes) {
			if(s instanceof TwoDimensionalShape)
				System.out.printf("%sArea: %.2f\n\n", s.toString(),((TwoDimensionalShape) s).calcularArea() );
			else if(s instanceof ThreeDimensionalShape)
				System.out.printf("%sArea de Superficie: %.2f\nVolume: %.2f\n\n", s.toString(),
						((ThreeDimensionalShape) s).calcularArea(),
						((ThreeDimensionalShape) s).calcularVolume());
		}
	}

}
