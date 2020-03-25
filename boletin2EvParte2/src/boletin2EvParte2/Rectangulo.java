package boletin2EvParte2;

public class Rectangulo extends Figura {
	
	private double base;
	private double altura;
	
	public Rectangulo(double base, double altura) 
	{
		this.base=base;
		this.altura=altura;
	}
	
	@Override
	protected void calcularArea() {
		setArea(base*altura);
	}
	
	public double getBase() {
		return base;
	}
	
	public void setBase(double base) {
		this.base=base;
	}
	
	public double getAltura(double altura) {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura=altura;
	}
	
	@Override
	public String toString() {
		return "RECTANGULO:\n\tbase:"+base+"\n\taltura:"+altura+"\n\tarea:"+getArea();
		//String.format("TRIANGULO:\n\tbase:%s\n\taltura:%s\n\t�rea:%s", base,altura,getArea());
	}

}
