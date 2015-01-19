public class Rectangulo extends FiguraGeometrica {
	private double area, peri ;

	public Rectangulo(double base, double altura) {
		super (base,altura);
	}
		
	@override double area() {
		area = getBase()*getAltura();
		return area;
	}

	@override double perimetro() {
		peri = 2*getBase()+2*getAltura();
		return peri;
	}
	
	public void mostrar()
	{
	    super.mostrar();
		System.out.println("\nEl area del rectangulo es: " + area());
		System.out.println("\nEl perimetro del rectangulo es: " + perimetro());
	}
}