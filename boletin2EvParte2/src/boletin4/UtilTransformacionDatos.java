package boletin4;

public class UtilTransformacionDatos {

	public static boolean esValorNumerico(String string) {
		
		boolean valor= true;
		
		try {
			
			int entero= Integer.valueOf(string);
		}
		catch(Exception NumberFormatException) {
			
			System.out.println("No es númerico");
			valor=false;
		}
	
		return valor;
		
	}//esValorNumerico
	
	
	public static double obtenerValorDouble(String string) throws NumberFormatException {
		
		double valor= Integer.valueOf(string);
		
		return valor;
		
	}//ObtenerValorDouble
	
	public static int obtenerValorNumPositivo(int num) {
		
		try {
			
			System.out.println("-1");
		}
		catch(Exception ValorNumNegativoException){
			
		}
	
		return num;
		
	}//obtenerValorNumPositivo
}
