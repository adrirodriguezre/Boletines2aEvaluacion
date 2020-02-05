
public class Ejercicio2 {

	public static void main(String[] args) {
		Coche c1= new Coche("12345", "COCHE", 124, 5);
		Conductor co1=new Conductor("583232434","juan");
		c1.setConductor(co1);
		
		Remolque re1=new Remolque();
		re1.longitud=55;
		re1.matricula="45645"; //opcional 
		
		Camion ca1=new Camion("54543", "camion", 110, re1 );
		
	
	}

}
