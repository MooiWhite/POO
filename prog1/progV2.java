import java.io.*;
import java.lang.*;
import java.math.*;

/**
 *Esta clase  tiene la capacidad de leer un número
 *y obtener un resultado que asemejaa la función sin(), además de comparar
 *su resultado con la función sin() original.
 *El usuario ingresa la cantidad de decimales a reodndear, y por ende a comparar.
 *@author	Mariana Martínez Soto. Reyes Alonso Katherine
 *@version	0.4
 *@since  	1.0
*/
public class progV2 {
    double x;	
    int n;
    int k = 0;
    BigDecimal buffer;
    /**
     *Inicializa los parámetros recibidos. Método ctor
     *@param x	Valor a obtener el sin()
     *@param n	Valor a redondear los decimales
    */
    public progV2(double x, int n){
	this.x = x;
	this.n = n;	
    }
    /**
     *Obtiene el factorial de un tipo de dato double
     *@param fac Valor del que se desea obtener el factorial
     *@return temp El factorial de tipo BigDecimal de fac
     *@throws No lanza excepciones
    */
    public double factorial(double fac){
	double temp = 1;
	for (int i= 1 ; i<=fac ; i++){
	   temp = temp * i;
	  
	}
	return temp;
    }

    /**
     *Calcula las operaciones referentes a la sumatoria que simula ser la 
     *función sin(). Y mediante un ciclo los compara con la función
     *sin() original. Mientras ambos valores sean diferentes
     *el números de ciclos contiuará incrementadose    
    */
    public String run(){
    //try{
	BigDecimal temp = new BigDecimal("0.0");
    	double o;
	
	BigDecimal sin = new BigDecimal(Math.sin(x));
	System.out.println("Seno sin redondeo: "+sin);
	sin = sin.setScale(n, BigDecimal.ROUND_HALF_UP);
    
	while(sin != temp){
	o = (2*k)+1;

	 double num = Math.pow(-1,k) * Math.pow(x,o);
	 double fac = factorial(o);
     System.out.println(fac);

	 BigDecimal buffer = new BigDecimal(num/fac);
	 temp = temp.add(buffer);
	  if (temp.setScale(n, BigDecimal.ROUND_HALF_UP).equals(sin)){
		String Title = Double.toString(x);
		String MensajeEnTexto = Integer.toString(k);
		String UP = (temp.setScale(n, BigDecimal.ROUND_HALF_UP)).toString();
		System.out.println("Revisa por favor tu directorio");
		System.out.println(MensajeEnTexto);
		return MensajeEnTexto;
		}
	k = k+1;	 
	}
    return ("Hubo un errro. Lo senitmos");
    }
   
    
    /**
     *Método estático main que recibe argumentos por línea de comandos, para 
     *posteriormente transformarlos a tipos de dato Double e Integer.
     *Crea un hilo de la clase progV1 y lo ejecuta
     *@param args[] Por línea de comandos 
     *@throws ArrayIndexOutOfBoundsException 
    */	
    public static void main(String args[]) throws InterruptedException{
    try{
       File programa = new File(args[0]);
       FileReader lector = new FileReader(programa);
       BufferedReader Linea = new BufferedReader(lector);      
       String linea ;
       
       File fichero = new File("salida.txt");
       FileOutputStream fos = new FileOutputStream(fichero);
       PrintStream escribe=new PrintStream(fos);

       while((linea=Linea.readLine())!=null){
            System.out.println("La cadena es:"+linea);
            String[] arreglo = linea.split(" ");
            System.out.println("pasó");

            Double x = Double.parseDouble(arreglo[0]);

	        Integer n = Integer.parseInt(arreglo[1]);
	        progV2 uno = new progV2(x,n);
            String k = uno.run();
            escribe.println(k);
       }
       lector.close();
       fos.close();
       escribe.close();

       }catch(IOException ioe){
            System.out.println("Hubo un problema al abrir el archivo"+ioe);
       }catch(ArrayIndexOutOfBoundsException aioobe){
            System.out.println("La forma de uso es: java progV1 |nombre del archivo a leer|");
       }
	

    }
}

 
