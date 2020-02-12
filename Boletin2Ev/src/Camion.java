public class Camion extends Vehiculo {

	//metodos
	
	public void mostrarDatos(){
		
		System.out.println("Altura:"+altura); 
		super.mostrarDatos();
	}
	private int altura;
	private Remolque remolque;
	public Camion(String matricula, String tipo, int vMaxima, Remolque remolque) {
		setMatricula(matricula);
		setTipo(tipo);
		setVelocidadMaxima(vMaxima);
		this.remolque=remolque;
		
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura=altura;
	}
	
	public Remolque getRemolque() {
		return remolque;
	}
	public void setRemolque(Remolque remolque) {
		this.remolque=remolque;
	}
}
