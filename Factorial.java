import java.util.Scanner;

public class Factorial {

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
            for(int i = 1; i <= numIngresado; i++){
                resultado = resultado * i;
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