
public class Ejercicio2 {

	public static void main(String[] args) {
		Coche c1= new Coche("12345", "COCHE", 124, 5);
		Conductor co1=new Conductor("583232434","Juan");
		c1.setConductor(co1);
		
		Remolque re1=new Remolque();
		re1.longitud=55;
		re1.matricula="45645"; //opcional 
		
		Camion ca1=new Camion("54543", "camion", 110, re1 );
		ca1.setConductor(co1);
		ca1.setAltura(25);
		//c1.mostrarDatos();
		//ca1.mostrarDatos();
		
		Camion ca2=new Camion("54543", "camion", 110,7);
		ca2.setConductor(co1);
		ca2.setRemolque(re1);
		//ca2.mostrarDatos();
		
		
		//impresionPolimorfismo2(c1);
		
		impresionPolimorfismo2(ca1);
	}
	
	public static void impresionPolimorfismo(Vehiculo veh) {
		veh.mostrarDatos();
	}
	
	public static void impresionPolimorfismo2(Vehiculo veh) {
		if(veh instanceof Camion)
		{
			Camion ca= ((Camion)veh);
			System.out.println(ca.getRemolque());
		}
	}

}
 