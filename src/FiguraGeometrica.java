//package java2_Herencia3;
public abstract class FiguraGeometrica {
	private String nombre;
	private Double base, altura;

	public void setBase(double base) {
		this.base = base;
	 }	
	protected double getBase() {
		return base;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	 }
	protected double getAltura() {
		return altura;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	 }
	public String getNombre() {
		return nombre;
	}
	
	protected abstract double area();
	protected abstract double perimetro();
	
	public void mostrar() {
		System.out.println("\nDatos de la figura geometrica: ");
	}
	
}