import java.io.*;
public class Lecesc{
    public static void main(String args[]){
	try{
	    File miArchivo = new File("meraprueba");
	    FileInputStream fis = new FileInputStream(miArchivo);	
	    BufferedReader br = new BufferedReader(new InputStreamReader(fis));  
	    String linea;
        File miOtroArchivo = new File("merasalida");
        FileOutputStream dis=new FileOutputStream(miOtroArchivo, true);
        PrintStream escribe=new PrintStream(dis);
	    while((linea=br.readLine())!=null){
		    System.out.println("El usuario es:"+linea);
           
            escribe.println(linea); 
            
        }
        dis.close();
        escribe.close();

        br.close();
	    fis.close();

        
	}catch(IOException ioe){
	    System.out.println("Estoy en la excepcion"+ioe);
	}
    }
}
