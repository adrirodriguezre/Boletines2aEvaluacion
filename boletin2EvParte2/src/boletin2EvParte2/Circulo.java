package boletin2EvParte2;

public class Circulo extends Figura {

	private final double PI=3.14;
	private double radio;
	
	public Circulo(double radio)
	{
		this.radio=radio;
	}
	
	
	@Override
	protected void calcularArea() {
		setArea(radio*radio*PI);

	}
	
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio=radio;
	}
	@Override
	public String toString() {
		return "CIRCULO:\n\tradio:"+radio+"\n\tPI:"+PI+"\n\tarea:"+getArea();
		//String.format("TRIANGULO:\n\tbase:%s\n\taltura:%s\n\t�rea:%s", base,altura,getArea());
	}
}
