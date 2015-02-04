package figuras2;
public class Main {
	public static void main (String args[])	{
	    //los final no varian su valor
        //Circulo1.pi = 1.16; 
	    Circulo2.pi = 2.16;
	    //Circulo3.pi = 3.16;
	    
	    System.out.print("1 static final"+Circulo1.PI);
	    System.out.print("2 static"+Circulo2.pi);
	    Circulo3 circu = new Circulo3();
	    System.out.println("3 final"+circu.PI);
	}   
	
}