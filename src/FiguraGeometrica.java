abstract class FiguraGeometrica {
	private String nombre;
	private Double base, altura;

	
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
	
	abstract double area();
	abstract double perimetro();
	
	public void mostrar() {
		System.out.println("\nDatos de la figura geometrica: ");
	}
	
}