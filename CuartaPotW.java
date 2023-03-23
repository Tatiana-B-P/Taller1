package While;

import java.util.Scanner;

public class CuartaPotW {

	public static void main(String[] args) {
		/*Programa que dados 4 números de 10 dígitos cada uno, me devuelva 
		 * el resultado de cada uno elevado a la 4 potencia; ejemplo: 1234567890 elevado a la 4 = 2.3230572279825926E36. */
		Scanner entrada = new Scanner(System.in);
		try {
			double almacen[] = new double[4];
			System.out.println("Digite cuatro numeros");
			int i = 0;
			int j = 0;
			while(i < almacen.length) {
				almacen[i] = entrada.nextDouble();
				if(almacen[i] < 1000000000 || almacen[i] > 1999999999) {
					entrada.close();
					throw new Exception("Numero menor o mayor de 10 digitos");
				}
				i++;
			}
			
			while(j < almacen.length) {
				System.out.println(Math.pow(almacen[j], 4));
				j++;
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