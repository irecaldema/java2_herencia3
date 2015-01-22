public class Triangulo extends FiguraGeometrica {

	public Triangulo(double base, double altura) {
		super("Triangulo",base, altura);
	}

	@Override public double area(){
		double area = getBase()*getAltura()/2;
		return area;
	}
	//Triángulo equilatero
	@Override public double perimetro() {
		double peri = getBase()*3;
		return peri;
	}
	
	public void mostrar() {
	    super.mostrar();
		System.out.println("\nEl area del triangulo es: " + area());
		System.out.println("\nEl perimetro del triangulo es: " + perimetro());
	}
}