public class FiguraGeometrica {
	private Double base, altura;
	private String nombre;
	
	public FiguraGeometrica() {}
	
	public FiguraGeometrica(String nombre,double base,double altura) {
		this.nombre=nombre;
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
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	 }
	public String getNombre() {
		return nombre;
	}
	
	public double area() {double area=0.0;return area;}
	
	public double perimetro() {double perimetro=0.0; return perimetro;}
	
	public void mostrar() {
		System.out.println("\nDatos de la figura geometrica: ");
	}
	
}