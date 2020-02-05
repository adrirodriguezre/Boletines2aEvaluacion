public class Camion extends Vehiculo {

	private int altura;
	private Remolque remolque;
	public Camion(String matricula, String tipo, int vMaxima, Remolque remolque) {
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
