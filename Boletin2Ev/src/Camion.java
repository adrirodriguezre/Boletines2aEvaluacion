public class Camion extends Vehiculo {
	private int altura;
	private Remolque remolque;
	
	
	public Camion(String matricula, String tipo, int vMaxima, Remolque remolque) {
		setMatricula(matricula);
		setTipo(tipo);
		setVelocidadMaxima(vMaxima);
		this.remolque=remolque;
		
	}
	
	public Camion(String matricula, String tipo, int vMaxima, int altura) {
		super(matricula, tipo, vMaxima);
		this.altura=altura;
		
	}
	
	//metodos
	
	public void mostrarDatos(){
		
		System.out.println("Altura:"+altura); 
		super.mostrarDatos();
		System.out.println(remolque); 
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
