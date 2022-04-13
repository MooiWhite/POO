import java.io.*;
import java.util.*;

public class Mimain{
    public static void main(String args[]){
    try{
    File programa = new File("DATOSP5");
    FileReader lector = new FileReader(programa);
    BufferedReader Linea = new BufferedReader(lector);
    String linea;
    
    ArrayList<Database> table = new ArrayList<>();
    ArrayList<String> groups = new ArrayList<>();
    while((linea = Linea.readLine())!= null){
           try{
           if (linea.equals("[DATA]") ){
            System.out.println("Reading the data... wait please");
            }
           else{
                if (linea.equals("[GROUPS]")){
                    System.out.println("Reading the groups... wait please");
                }
                else{
                    StringTokenizer st = new StringTokenizer(linea,"\\|:");
                    ArrayList<String> Buffer = new ArrayList<>();
                    while (st.hasMoreTokens()) {
                        String cadena = st.nextToken();
                        Buffer.add(cadena);
                    }
                    if (Buffer.size() == 2){
                        groups.add(Buffer.get(1));
                    }
                    else{
                        table.add(new Database(Buffer.get(0), Buffer.get(1), Buffer.get(2), Buffer.get(3), Buffer.get(4), Buffer.get(5)));	
                    }
                }

           }
           }/*try*/catch(IndexOutOfBoundsException ioobe){
        System.out.println("Estoy en la excepcion");
    }
            
    }
    lector.close();
    /*for (int i=0; i<=table.size()-1; i++){
        System.out.println((table.get(i)).CustomerID+"|"+(table.get(i)).CompanyName+"|"+(table.get(i)).ContactName);//table.get(i) es un objeto. Al imprimirlo así solo aparecerá su dirección en memoria
        
        //Hay que accesar a sus atributos con el operador .
    }
    for (int i=0; i<=groups.size()-1; i++){//imprime los grupos que requiere el usuario
        System.out.println(groups.get(i));
    }*/
        
        
    /*if((table.get(0)).Country.equals(groups.get(0))){
        //imprime en pantalla la tabla sin ordenar, en este caso el tit es Country
        for(int i=0; i<=table.size()-1; i++){
            System.out.println(groups.get(0)+" : "+table.get(i).Country);
            System.out.println("\t"+(table.get(i)).CustomerID+"|"+(table.get(i)).CompanyName+"|"+(table.get(i)).ContactName+"|"+(table.get(i)).ContactTitle+"|"+(table.get(i)).City+"|"+(table.get(i)).Country);
            
            //System.out.println(table.get(i).Country);
        }        
    }*/
    
    /*for (Database vendedor : table){
        System.out.println(vendedor.getCustomerID());
    }*/  

    Collections.sort(table, new Comparator<Database>(){
        public int compare(Database vendedor1, Database vendedor2){
            return vendedor1.getCustomerID().compareTo(vendedor2.getCustomerID());
        }
    });

    for (Database vendedor : table){
        System.out.println("CustomerID : "+vendedor.getCustomerID());
        System.out.println("\t"+vendedor.getCustomerID()+"|"+vendedor.getCompanyName()+"|"+vendedor.getContactName()+"|"+vendedor.getContactTitle()+"|"+vendedor.getCity()+"|"+vendedor.getCountry());
    }

    }catch(IOException ioe){
        System.out.println("Estoy en la excepcion"+ioe);}
    }
    





}
