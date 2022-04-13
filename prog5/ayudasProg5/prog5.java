import java.util.*;
import java.io.*;
public class prog5{
    public void Algoritmo(ArrayList apartado){
	try{
    File programa = new File("DATOSP5");
    FileReader lector = new FileReader(programa);
    BufferedReader Linea = new BufferedReader(lector);
    String linea;
    //ArrayList<String> Buffer = new ArrayList<>();
    ArrayList<String> ListaAOrdenar = new ArrayList<>();
    while((linea = Linea.readLine())!= null){
       if (linea.equals("[DATA]") || linea.equals("[GROUPS]")){
        System.out.println("Reading the data... waiting please");
            }
        else{
        ArrayList<String> Buffer = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(linea,"\\|:");
            while (st.hasMoreTokens()) {
                String cadena = st.nextToken();
                Buffer.add(cadena);
             }
	//System.out.println(Buffer);//este buffer contiene los datos de cada renglón
        if (Buffer.size() == 2){
        System.out.println(Buffer.get(1));
        }
        else{
        
        System.out.println(apartado);
// 	ListaAOrdenar.add(Buffer.get(a));

        }
        }
    }
    lector.close();
    //System.out.println(Buffer);
    System.out.println(ListaAOrdenar);

    }catch(IOException ioe){
        System.out.println("Estoy en la excepcion"+ioe);
    }
    }

    public ArrayList leeOrden(){
     try{
    File programa = new File("DATOSP5");
    FileReader lector = new FileReader(programa);
    BufferedReader Linea = new BufferedReader(lector);
    String linea;
    ArrayList<int> apartados = new ArrayList<>();
    while((linea = Linea.readLine())!= null){
       if (linea.equals("[DATA]") || linea.equals("[GROUPS]")){
        System.out.println("Reading the data... waiting please"); 
	    }
        else{
	ArrayList<String> Buffer = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(linea,"\\|:");
            while (st.hasMoreTokens()) {
		String cadena = st.nextToken();
		//ArrayList<String> Buffer = new ArrayList<>();
		Buffer.add(cadena);
                //System.out.println(Buffer.get(1));
             }
	//System.out.println(Buffer.get(4));
	if (Buffer.size() == 2){
	//System.out.println(Buffer.get(1));
	switch(Buffer.get(1)){
	  case "CustomerID":
	     System.out.println("Has solictitado que el archivo se ordene de acuerdo al ID");
         apartados.add(0);
	     break;
	     
	  case "CompanyName":
	     System.out.println("Has solicitado que el archivose ordene de acuerdo al CompanyName");
         apartados.add(1);
	     break;
	     
	  case "ContactName":
	     System.out.println("Has solicitado que el archivose ordene de acuerdo al ContactName");
         apartados.add(2);
	     break;
	     
	  case "ContactTitle":
	      System.out.println("Has solicitado que el archivose ordene de acuerdo al ContactTitle");
         apartados.add(3);
	     break;
	     
	  case "City":
	      System.out.println("Has solicitado que el archivose ordene de acuerdo al City");
          apartados.add(4);
	      break;
	     
	  case "Country":
	      System.out.println("Has solicitado que el archivose ordene de acuerdo al Country"+Buffer);
          apartados.add(5);
	      break;
             
	  default:
	     System.out.println("El apartado que solicitas no existe en la base de datos. Revisalo");
	}
	}
        
	else{
	//System.out.println(Buffer.get(4));
	}
	}
    }//fin de while
    lector.close();
	
    }catch(IOException ioe){
        System.out.println("Estoy en la excepcion"+ioe);
    }
    return apartados;
    }
    public static void main(String args[]){
        prog5 uno = new prog5();
        ArrayList<int> apartados = new ArrayList<>();
        apartados = uno.leeOrden();   
        System.out.println("Se ordenó ordenar el apartado: "+apartado);
	uno.Algoritmo(apartados);
    }
}
