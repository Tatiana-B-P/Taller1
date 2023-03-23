package While;

import java.util.Scanner;

public class FactorialW {

    public static void main(String[] args) {
    	//Programa que calcula y visualiza por pantalla el factorial de los números enteros entre 1 y 10.
    	Scanner entrada = new Scanner(System.in);
    	try {
    		System.out.println("Ingrese un numero del 1 al 10");
            
            int numIngresado = entrada.nextInt();
            if(numIngresado < 1 || numIngresado > 10) {
            	entrada.close();
            	throw new Exception("Numero no valido");
            }
            int resultado = 1;
            int i = 1;
            while( i <= numIngresado){
                resultado = resultado * i;
                i++;
            }
        
            System.out.println("El resultado del factorial es: " + resultado);
    	}catch(Exception e) {
    		if(e.getMessage() != null) {
				System.out.println(e.getMessage());
			}else {
				System.out.println("Digito no valido");
			}
    	}
    }
}