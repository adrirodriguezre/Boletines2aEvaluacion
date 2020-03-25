package boletin2EvParte2;

public abstract class Figura {

	private double area;
	
	protected abstract void calcularArea();
	
	protected void imprimirArea() {
		System.out.println(area);
	}
	//area del triangulo
	
	//area del cuadrado
	
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area=area;
	}
	

}
