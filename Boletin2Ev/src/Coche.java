public class Coche extends Vehiculo {
	
	//metodos
	public void mostrarDatos() {
		
		System.out.println(numeroPlazas);
		super.mostrarDatos();
	}

	private int numeroPlazas;
	public Coche(String matricula, String tipo, int velocidadMaxima, int numeroPlazas) {
		
		setMatricula(matricula);
		setTipo(tipo);
		setVelocidadMaxima(velocidadMaxima);
		setNumeroPlazas(numeroPlazas);
		this.numeroPlazas=numeroPlazas;
	}
	public int getNumeroPlazas() {
		return numeroPlazas;
	}
	public void setNumeroPlazas(int numeroPlazas) {
		this.numeroPlazas=numeroPlazas;
	}
}
