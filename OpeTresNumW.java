package While;

import java.util.Scanner;

public class OpeTresNumW {

	public static void main(String[] args) {
		/*Programa que recibe la cantidad de veces que quiero hacer un cálculo de 3 número
		y la operación a realizar (suma, resta, multiplicación, división y modulo).*/ 
		Scanner entrada = new Scanner(System.in);
		try {
			
			System.out.println("Digite la operacion que desea hacer: \n1. Suma \n2. Resta \n3. Multiplicacion \n4. Division "
					+ "\n5. Modulo");
			int operacion = entrada.nextInt();
			System.out.println("Digite la cantidad de veces que desea hacer la operacion");
			int cantVeces = entrada.nextInt();
			int i = 1;
			while(i <= cantVeces) {
				System.out.println("Ingrese un primer numero.");
				double numUno = entrada.nextInt();
				System.out.println("Ingrese un segundo numero.");
				double numDos = entrada.nextInt();
				System.out.println("Ingrese un tercer numero.");
				double numTres = entrada.nextInt();
				
				switch(operacion) {
				case 1:
					suma(numUno, numDos, numTres);
					break;
				case 2:
					resta(numUno, numDos, numTres);
					break;
				case 3:
					multiplicacion(numUno, numDos, numTres);
					break;
				case 4:
					division(numUno, numDos, numTres);
					break;
					
				case 5:
					modulo(numUno, numDos, numTres);

					break;
				default:
					System.out.println("opcion incorrecta");
				}
				i++;
			}
		}catch(Exception e) {
			System.out.println("Digito no valido");
		}
		entrada.close();
	}
		
	
	public static void suma(double n1, double n2, double n3) {
		double resultado = n1 + n2 + n3;
		System.out.println(resultado);
	}
	
	public static void resta(double n1, double n2, double n3) {
		double resultado = n1 - n2 - n3;
		System.out.println(resultado);
	}
	public static void multiplicacion(double n1, double n2, double n3) {
		double resultado = n1 * n2 * n3;
		System.out.println(resultado);
	}
	public static void division(double n1, double n2, double n3) {
		double resultado = n1 / n2 / n3;
		System.out.println(resultado);
	}
	public static void modulo(double n1, double n2, double n3) {
		double resultado = n1 % n2 % n3;
		System.out.println(resultado);
	}
}
