import java.io.*;
import java.lang.*;
import java.math.*;

/**
 *Esta clase es heredada de Thread (hilo), tiene la capacidad de leer un número
 *y obtener un resultado que asemejaa la función sin(), además de comparar
 *su resultado con la función sin() original.
 *El usuario ingresa la cantidad de decimales a reodndear, y por ende a comparar.
 *@author	Mariana Martínez Soto. Reyes Alonso Katherine
 *@version	0.4
 *@since  	1.0
*/
public class progV1 extends Thread{
    double x;	
    int n;
    int k = 0;
    BigDecimal buffer;
    /**
     *Inicializa los parámetros recibidos. Método ctor
     *@param x	Valor a obtener el sin()
     *@param n	Valor a redondear los decimales
    */
    public progV1(double x, int n){
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
     *
     *
     *
    */
    public void run(){
    try{
	BigDecimal temp = new BigDecimal("0.0");
    double o;
	
	BigDecimal sin = new BigDecimal(Math.sin(x));
	System.out.println("Seno sin redondeo: "+sin);
	sin = sin.setScale(n, BigDecimal.ROUND_HALF_UP);
    
   	File fichero = new File("salida.txt");
	FileOutputStream fos = new FileOutputStream(fichero);
    PrintStream escribe=new PrintStream(fos);

	while(sin != temp){
	  o = (2*k)+1;
	 // System.out.println("waiting...");
	 double num = Math.pow(-1,k) * Math.pow(x,o);
	 double fac = factorial(o);
	  //System.out.println(new BigDecimal(1));
	 
	  BigDecimal buffer = new BigDecimal(num/fac);
	  temp = temp.add(buffer);
	 
	  /*System.out.println("El seno redondeado"+sin);
	  System.out.println("temp sin redondeo: "+temp);
	  System.out.println("temp redondeado: "+temp.setScale(n, BigDecimal.ROUND_HALF_UP));*/
	  
	  if (temp.setScale(n, BigDecimal.ROUND_HALF_UP).equals(sin)){
		
		String Title = Double.toString(x);
		String MensajeEnTexto = Integer.toString(k);
		
		String UP = (temp.setScale(n, BigDecimal.ROUND_HALF_UP)).toString();
		
		
        	//PrintStream escribe=new PrintStream(fos);
	        escribe.println(k); 
	       //fos.close();
        	//escribe.close();

		/*BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
		//bw.write("--> UP a temp: "+UP+"\n");
		bw.write("Listo! el número de ciclos fue:\n"+MensajeEnTexto+"\n");
		bw.newLine();
		bw.close();*/
		System.out.println("Revisa por favor tu directorio");
		System.out.println(MensajeEnTexto);
		//System.out.println("--> UP a temp: "+temp.setScale(n, BigDecimal.ROUND_HALF_UP));
		//System.out.println("DOOWN  a temp es: "+temp.setScale(n, BigDecimal.ROUND_HALF_DOWN));
		//System.out.println("Listo!, el número de ciclos es: "+k);
		break;
		}
	  
	k = k+1;	 
	}
	fos.close();
    escribe.close();
   
    }catch(IOException ioe){
    System.out.println("LO sentimos, se generó hubo algún fallo\n,IOE"); }	
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
       
       

       while((linea=Linea.readLine())!=null){
            System.out.println("La cadena es:"+linea);
            String[] arreglo = linea.split(" ");
            System.out.println("pasó");
            //System.out.println(arreglo[0]);
            Double x = Double.parseDouble(arreglo[0]);
	        //BigDecimal n = new BigDecimal(args[1]);
	        Integer n = Integer.parseInt(arreglo[1]);
	        progV1 uno = new progV1(x,n);
	        uno.start();
	        uno.join();
       }
       lector.close();
       

       }catch(IOException ioe){
            System.out.println("Estoy en la excepcion"+ioe);
       }catch(ArrayIndexOutOfBoundsException aioobe){
           System.out.println("La forma de uso es: java progV1 |nombre del archivo a leer|");
       }
	

    }
}

 
