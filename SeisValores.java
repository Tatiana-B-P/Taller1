import java.util.Scanner;

public class SeisValores {

	public static void main(String[] args) {
		/*
		 * Programa que recibe 6 valores entre 15.12 y 19.31 
		 * y devuelve el resultado de hacer 
		 * ((numero*100)/2)+100 por cada número ingresado.
		 * */
		Scanner entrada = new Scanner(System.in);
		try {
			double almacen[] = new double[6];
			System.out.println("Digite cuatro numeros");
			for(int i = 0; i < almacen.length; i++) {
				almacen[i] = entrada.nextDouble();
				if(almacen[i] < 15.12 || almacen[i] > 19.31) {
					entrada.close();
					throw new Exception("Numero fuera de rango");
				}
			}
			
			for(int i = 0; i < almacen.length; i++) {
				System.out.println(((almacen[i]*100)/2)+100);
			}
			
		}catch(Exception e) {
			
			if(e.getMessage() != null) {
				System.out.println(e.getMessage());
			}else {
				System.out.println("Digito no valido");
			}
			
		}
		
	}

}
