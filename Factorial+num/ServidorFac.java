import java.io.*;
import java.net.*;
import java.math.*;

public class ServidorFac{
	Socket s;
    public ServidorFac(int puerto){
        ServerSocket ss;
        try{
            ss = new ServerSocket(puerto);
            System.out.println("Servidor corriendo en el puerto..."+puerto);
            while(true){
                s = ss.accept();
                System.out.println("Accesaron desde .." + "[" + s.toString().substring(12) + "\n");
                ServidorEcoT c = new ServidorEcoT(s);
                c.start();
            }
        }catch(IOException ioe){
            System.out.println("Un error:"+ioe);
        }
    }

    public static void main(String args[]){
        ServidorFac se2 =new ServidorFac(1025);
    }

}
class ServidorEcoT extends Thread{
    Socket s;
    public ServidorEcoT(Socket socket){
        s=socket;
    }
  
    public void run(){
        try{
           PrintStream salidaSocket=null;
           InputStreamReader isr;
           BufferedReader entradaSocket=null;
           while(true){
                System.out.println(s);
                salidaSocket = new PrintStream(s.getOutputStream());
                isr = new InputStreamReader(s.getInputStream());
                entradaSocket = new BufferedReader(isr);
       		String cadena;

                while((cadena= entradaSocket.readLine()) != null){
		String[] cadenaNew = cadena.split(" ");
		    if(cadenaNew[0].equals("factorial")){
			try{	
			int fac =  Integer.parseInt(cadenaNew[1]);
			System.out.println(fac);
			long initialTime = System.currentTimeMillis();
			FactorialT f1 = new FactorialT(1,fac,initialTime);
			f1.start();
			f1.join();
			f1.resultado = f1.fact;
			System.out.println("aqui es: "+f1.getFactorial());
			salidaSocket.println("ECO: El resultado del factorial es:"+f1.getFactorial());
			}
			catch(ArrayIndexOutOfBoundsException aioobe){
				salidaSocket.println("ECO: Forma de uso correcta para factorial es: factorial |Numero|");
			}
		    }
		    else{
                    	if(cadena.equals("salir")){
                    	   salidaSocket.println("ECO:"+cadena);
                       	   s.close();
                   	 }
                   	 else
			 {
                   	     salidaSocket.println("ECO:"+cadena);
               		 }
		   }
		}
                System.out.println("Cerrando puertos del Servidor");
                salidaSocket.close();
                isr.close();
           
	}
        }catch(SocketException se){
           System.out.println("Cerando el socket:"+s);
           System.out.println("Error en el socket:"+se);
        }catch(IOException ioe){
           System.out.println("Un error:"+ioe);
        }catch(Exception e){
           System.out.println("Un error:"+e);
        }
    }
}
	

