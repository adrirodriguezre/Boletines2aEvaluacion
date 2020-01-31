import java.time.LocalDate;

public class Ejercicio1 {

	public static void main(String[] args) {
		Persona p1 = new Persona();
		p1.nombre = "Jose";
		p1.apellidos = "Rodriguez Mata";
		p1.fechaNacimiento = LocalDate.of(1965, 1, 15);
		p1.estatura = 165;

		Persona p2 = new Persona();
		p2.nombre = "Maria";
		p2.apellidos = "Sanchez Gomez";
		p2.fechaNacimiento = LocalDate.of(1980, 12, 26);
		p2.estatura = 170;

		Persona p3 = new Persona();
		p3.nombre = "Alejandro";
		p3.apellidos = "Gomez Gomez";
		p3.fechaNacimiento = LocalDate.of(2001, 11, 1);
		p3.estatura = 190;

		Persona p4 = new Persona();
		p4.nombre = "Jose Manuel";
		p4.apellidos = "Perez Pons";
		p4.fechaNacimiento = LocalDate.of(2010, 5, 1);
		p4.estatura = 127;

		Persona p5 = new Persona();
		p5.nombre = "Lorena";
		p5.apellidos = "Remeseiro Neira";
		p5.fechaNacimiento = LocalDate.of(2000, 6, 12);
		p5.estatura = 160;

		Persona p6 = new Persona();
		p6.nombre = "Patricia";
		p6.apellidos = "Seoane Álvarez";
		p6.fechaNacimiento = LocalDate.of(1976, 8, 23);
		p6.estatura = 175;

		Persona array[] = new Persona[6];
		array[0] = p1;
		array[1] = p2;
		array[2] = p3;
		array[3] = p4;
		array[4] = p5;
		array[5] = p6;

		Persona pMayor=obtenerPersonaMayorEdad(array);
		pMayor.mostrarDatos();

	}// main

	
	private static Persona obtenerPersonaMayorEdad(Persona[] arrayPersonas)
	{
		long mayorEdad=0;
		Persona pMayorEdad=null;
		for (int x = 0; x <arrayPersonas.length; x++) {
			
			long num = arrayPersonas[x].obtenerEdad();
			if (num>mayorEdad) {
				mayorEdad=num;
				pMayorEdad= arrayPersonas[x];
			}

		}

		return pMayorEdad; 
	}
	
	
	
}// class
