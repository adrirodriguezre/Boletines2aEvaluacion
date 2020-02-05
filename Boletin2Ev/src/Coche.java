public class Coche extends Vehiculo {

	private int numeroPlazas;
	public Coche(String matricula, String tipo, int velocidadMaxima, int numeroPlazas) {
		
		setMatricula(matricula);
		setTipo(tipo);
		setVelocidadMaxima(velocidadMaxima);
	}
	public int getNumeroPlazas() {
		return numeroPlazas;
	}
	public void setNumeroPlazas(int numeroPlazas) {
		this.numeroPlazas=numeroPlazas;
	}
}
