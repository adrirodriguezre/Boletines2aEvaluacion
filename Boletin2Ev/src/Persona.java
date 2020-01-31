import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Persona {

	//campos
	public String nombre;
	public String  apellidos;
	public LocalDate fechaNacimiento;
	public int estatura;

	//metodos
	public void mostrarDatos() {
		
		System.out.println(nombre);
		System.out.println(apellidos);
		System.out.println(fechaNacimiento);
		System.out.println(estatura);
		
	}
	public long obtenerEdad() {
		
		long edad= ChronoUnit.YEARS.between(fechaNacimiento, LocalDate.now());
		//System.out.println(edad);
		return edad;
	}
	
	//constructores
	public Persona() {
		
	}
		
}
