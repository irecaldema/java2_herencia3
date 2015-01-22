public class Rectangulo extends FiguraGeometrica {

	public Rectangulo(double base, double altura) {
		super ("Rectangulo",base,altura);
	}
		
	@Override public double area() {
		area = getBase()*getAltura();
		return area;
	}

	@Override public double perimetro() {
		peri = 2*getBase()+2*getAltura();
		return peri;
	}
	
	final public void mostrar() {
	    super.mostrar();
		System.out.println("\nEl area del rectangulo es: " + area());
		System.out.println("\nEl perimetro del rectangulo es: " + perimetro());
	}
}