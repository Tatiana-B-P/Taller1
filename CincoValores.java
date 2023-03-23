import java.util.Scanner;

public class CincoValores {

	public static void main(String[] args) {
		/*
		 * Programa que recibe 5 valores, cada numero que recibe debe ser mayor o igual a 74,  menor o igual a 189, 
		 * además debe ser par, si el valor es correcto validar que sea múltiplo de 5 y devolver un mensaje 
		 * que imprima: “numero validado”. */
		Scanner entrada = new Scanner(System.in);
		try {
			double almacen[] = new double[5];
			System.out.println("Digite cuatro numeros");
			for(int i =0; i <= almacen.length; i++) {
				almacen[i] = entrada.nextDouble();
				if(almacen[i] < 74 || almacen[i] > 189 || almacen[i] % 2 != 0) {
					entrada.close();
					throw new Exception("Numero no valido");
				}
				if(almacen[i] % 5 == 0) {
					System.out.println("Numero valido");
				}
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
