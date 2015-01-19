public class FiguraGeometrica {
	private Double base, altura;
	
	public FiguraGeometrica() {}
	
	public FiguraGeometrica(double base,double altura) {
		this.base=base;
		this.altura = altura;
	}
	
	public void setBase(double base) {
		this.base = base;
	 }	
	public double getBase() {
		return base;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	 }
	public double getAltura() {
		return altura;
	}
	
	public double area() {double area=0.0;return area;}
	
	public double perimetro() {double perimetro=0.0; return perimetro;}
	
	public void mostrar() {
		System.out.println("Datos de la figura geometrica: ");
	}
	
}