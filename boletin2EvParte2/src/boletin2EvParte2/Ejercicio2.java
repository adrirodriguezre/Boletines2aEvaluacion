package boletin2EvParte2;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		
		Figura[] arrayFiguras= {
				
				new Triangulo(3,2),
				new Cuadrado(5),
				new Triangulo(15,3),
				new Triangulo(8,7),
				new Rectangulo(9,5),
				new Rectangulo(15,6),
				new Circulo(5),
				new Circulo(9),
				new Rectangulo(8,3),
				new Cuadrado(9)
				};
				
		
			
		
		Triangulo t=new Triangulo(8,7);
		t.calcularArea();
		System.out.println(t);
	

	
	}
	
	private static void obtenerFiguras(Figura[] arrayFiguras) {
			
			int[] Cuadrado={5,9};
			int[] Triangulo={2,3,7,8,15};
			int[] Rectangulo={3,8,5,9,6,15};
			int[] Circulo={5,9};
			
			for(Figura miFigura: arrayFiguras) {
				
				if(miFigura instanceof Triangulo) {
					
					System.out.println(Triangulo);
					
				}else {
					
					if(miFigura instanceof Rectangulo) {
						
						System.out.println(Rectangulo);
					}else {
					
						if(miFigura instanceof Cuadrado) {
						
						System.out.println(Cuadrado);
						}else {
					
							if(miFigura instanceof Circulo);
						}
					}
						
				}
			}
					
		}
}
