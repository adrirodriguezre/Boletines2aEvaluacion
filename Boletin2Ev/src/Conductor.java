public class Conductor {

	public String dni;
	public String nombre;
	public Conductor(String dni, String nombre) {
		this.dni=dni;
		this.nombre=nombre;
	}
	
	@Override
	public String toString() {
		
		return String.format("DNI:%s\nNombre:%s", dni,nombre);
	}
	
}
