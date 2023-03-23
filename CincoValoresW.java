package While;

import java.util.Scanner;

public class CincoValoresW {

	public static void main(String[] args) {
		/*
		 * Programa que recibe 5 valores, cada numero que recibe debe ser mayor o igual a 74,  menor o igual a 189, 
		 * además debe ser par, si el valor es correcto validar que sea múltiplo de 5 y devolver un mensaje 
		 * que imprima: “numero validado”. */
		
		Scanner entrada = new Scanner(System.in);
		try {
			double almacen[] = new double[5];
			System.out.println("Digite cuatro numeros");
			int i =0;
			while(i < almacen.length) {
				almacen[i] = entrada.nextDouble();
				if(almacen[i] < 74 || almacen[i] > 189 || almacen[i] % 2 != 0) {
					entrada.close();
					throw new Exception("Numero no valido");
				}else if(almacen[i] % 5 == 0) {
					System.out.println("Numero valido");
				}
				i++;
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
