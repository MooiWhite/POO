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
        ServidorFac se2 =new ServidorFac(1036);
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
		
		    if(cadena.equals("factorial")){
			try{	
			long initialTime = System.currentTimeMillis();
			FactorialT f1 = new FactorialT(1,25,initialTime);
			f1.start();
			f1.join();
			f1.resultado = f1.fact;
			System.out.println("aqui es: "+f1.getFactorial());
			salidaSocket.println("ECO: El resultado del factorial temportal es:"+f1.getFactorial());
			}
			catch(ArrayIndexOutOfBoundsException aioobe){
				System.out.println("Forma de uso correcta para factorial es: factorial |Numero|");
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
	

