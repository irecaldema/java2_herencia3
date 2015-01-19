import java.util.Scanner;
public class Main {
	public static void main (String args[])	{
		char opcion;
		double base, altura;
		Scanner sc = new Scanner(System.in);
 
		System.out.print("\nElija la figura que quiere analizar: Rectangulo (R)  Triangulo (T) Salir (S)  "); 
		System.out.print("\n");
		opcion = sc.next().charAt(0);

		while (opcion!='S'&&opcion!='s') {
			if(opcion=='T'||opcion=='t') {
				System.out.print("\ningresa la base del triangulo a analizar: ");
				base = sc.nextDouble();
  
				System.out.print("\ningresa la altura del triangulo a analizar: ");
				altura = sc.nextDouble();
 
				Triangulo triangulo = new Triangulo(base,altura);

				triangulo.mostrar();
			}
			else  if(opcion=='R'||opcion=='r') { 
				System.out.print("\ningresa la base del rectangulo a analizar: ");
				base = sc.nextDouble();

				System.out.print("\ningresa la altura del rectangulo a analizar: ");
				altura = sc.nextDouble();   

				Rectangulo rectangulo = new Rectangulo(base,altura);

				rectangulo.mostrar();
			}
			else {
				System.out.println("\nVa a ser que no has escrito bien...");
				System.out.println("\nPrueba otra vez...");
			}
 
			System.out.print("\nElija la figura que quiere analizar: Rectangulo (R)  Triangulo (T) Salir (S)"); 
			System.out.print("\n");
			opcion = sc.next().charAt(0);
		}
		System.out.println("\nAdios");
		sc.close();
	}
}