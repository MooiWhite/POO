
/**
 * @file Palindromo1.java
 * @author Martínez Soto Mariana
 * @version 0.3
 * @date 2018-10-18
 */

import java.util.Scanner;
/**
*Es la clase que tiene como único atributo un arreglo 
*de caracteres llamado frase y un único método (estático) que 
*Desarrolla a la cadena que ingresa el usuario, de tal manera que lanza si 
*tiene caracteristicas de palindromo o no.
*Se importa la clase Scanner para poder leer desde teclado
**/
public class Palindromo1{
	char[] frase;

/**
*Este método estático lee una frase por teclado y utilizando el método replaceAll
*remplaza los caracteres "_" por un "sin espacio", resultando una frase sin espacios
**/
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		String unaFrase;
		System.out.println("Ingresa una frase: ");
		unaFrase = teclado.nextLine();
        //Remplaza los "_" por "", es decir comprime los espacios
		unaFrase = unaFrase.replaceAll(" ","");
        //cuenta la longitud de la cadena que ingresó el usuario, pero sin espacios
		int tam = unaFrase.length();
        //Utiliza el método toCharArray para convertir una cadena a un arreglo de
        //caracteres
		char[] Frase = unaFrase.toCharArray();
        //Crea un arreglo de caracteres llamado dos con la longitud de la cadena 
        //que ingresó el usuario sin espacios
		char[] dos = new char[Frase.length];
	    //se inicializa el contador j para que no acumule basura al momento de usarla
		int j = 0;
	    
        //Recorre el arreglo Frase del ultimo elemento hasta el primero y lo
        //guarda en otro llamado 'dos'
		for (int i=(tam-1) ; i>-1 ; i--){
		 	dos[j] = Frase[i];
			j++;
		}
		
        //Se utiliza una estructura de control if-else para comparar si la frase leída al revés 
        //el la misma que leída al derecho
		boolean A = true;
		for (int i=0; i<tam ; i++){
		
			if (dos[i] == Frase[i]){
				A = true;
			}
			else{
				A = false;
				break;
			}

		}
		if (A == true){
			System.out.println("Si es un palindromo");
		
		}
		else{
		System.out.println("No es un palidnromo");
		}



	}
	
}
