import java.util.Scanner;

public class Palindromo {
	String palabra1;
	String comparativo;

	public void dice(){
		System.out.println("Soy un palindromo!");
	}

	public static void main(String args[]) {
		Palindromo MiPalindromo = new Palindromo();
		MiPalindromo.palabra1=args[0];
		MiPalindromo.comparativo=args[1];
		String una = MiPalindromo.palabra1;
		char[] nueva = una.toCharArray();
		MiPalindromo.dice();
		int tam = una.length();
		System.out.println(tam);
		char[] buffer={};
		int j = 0;
		String CADENA;
		Scanner teclado = new Scanner(System.in);
		System.out.println("INgresa una frase: ");
		CADENA = teclado.nextLine();
		System.out.println("Tu cadena es:" +CADENA);

		for (int i=tam-1; i>-1 ; i--){
			System.out.println("Esta es la cadena una: "+nueva[i]); 
			System.out.println("Esta es j"+j+"i:"+i); 
			
			j = j+1;
		}
		
		
	}

	}
