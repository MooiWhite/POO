import java.io.*;
import java.util.*;

/**
*Clase Database, que maneja tipos de dato tipo Customer
*En sus atrubutos se encuentra un ArrayList del mencionado 
*y otro de tipo String
*@author	Mariana Martínez Soto. Reyes Alonso Katherine
*@version	0.4
*@since  	1.0
*/
public class Database{

    ArrayList<Customer> table;
    ArrayList<String> groups;

    /**
    *Este método es un constructor que recibe como parámetros un ArrayList de objetos Customer
    *y otro de Strings. Eventualmente los inicaliza
    */
    public Database (ArrayList<Customer> table, ArrayList<String> gruops){
        this.table = table;
        this.groups = groups;
    }
	
    /**
    *Este método ordena, gracias a la librería java.util, los atributos CustomerID 
    *de los objetos de tipo Customer que se encuentran dentro del arrayList.
    *Usa el método sort (ordenamiento)  y compare que compara dos objetos
    */
    public void OrdenaCustomer(ArrayList<Customer> table){
	 Collections.sort(table, new Comparator<Customer>(){
        public int compare(Customer vendedor1, Customer vendedor2){
            return vendedor1.getCustomerID().compareTo(vendedor2.getCustomerID());
        }
        });

    }
    /**
    *
    *
    */
    public void MuestraCustomer(ArrayList<Customer> table){
    File fichero = new File("salida.txt");
	FileOutputStream fos = new FileOutputStream(fichero);
    PrintStream escribe=new PrintStream(fos);
	for (Customer vendedor : table){
            escribe.println("CustomerID : "+vendedor.getCustomerID());
            escribe.println("\t"+vendedor.getCustomerID()+"|"+vendedor.getCompanyName()+"|"+vendedor.getContactName()+"|"+vendedor.getContactTitle()+"|"+vendedor.getCity()+"|"+vendedor.getCountry());

    }
    fos.close();
    escribe.close();
    }
    /**
    *Este método ordena, gracias a la librería java.util, los atributos CompanyName 
    *de los objetos de tipo Customer que se encuentran dentro del arrayList.
    *Usa el método sort (ordenamiento)  y compare que compara dos objetos
    */
    public void OrdenaCompany(ArrayList<Customer> table){
	 Collections.sort(table, new Comparator<Customer>(){
        public int compare(Customer vendedor1, Customer vendedor2){
            return vendedor1.getCompanyName().compareTo(vendedor2.getCompanyName());
        }
        });

    }
    
    public void MuestraCompany(ArrayList<Customer> table){
    File fichero = new File("salida.txt");
	FileOutputStream fos = new FileOutputStream(fichero);
    PrintStream escribe=new PrintStream(fos);
	for (Customer vendedor : table){
            escribe.println("CompanyName : "+vendedor.getCompanyName());
            escribe.println("\t"+vendedor.getCustomerID()+"|"+vendedor.getCompanyName()+"|"+vendedor.getContactName()+"|"+vendedor.getContactTitle()+"|"+vendedor.getCity()+"|"+vendedor.getCountry());
    }
    fos.close();
    escribe.close();

    }
    /**
    *Este método ordena, gracias a la librería java.util, los atributos ContactTitle 
    *de los objetos de tipo Customer que se encuentran dentro del arrayList.
    *Usa el método sort (ordenamiento)  y compare que compara dos objetos
    */
    public void OrdenaContact(ArrayList<Customer> table){
	 Collections.sort(table, new Comparator<Customer>(){
        public int compare(Customer vendedor1, Customer vendedor2){
            return vendedor1.getContactTitle().compareTo(vendedor2.getContactTitle());
        }
        });

    }
    
    public void MuestraContact(ArrayList<Customer> table){
    File fichero = new File("salida.txt");
	FileOutputStream fos = new FileOutputStream(fichero);
    PrintStream escribe=new PrintStream(fos);
	for (Customer vendedor : table){
            escribe.println("Contact : "+vendedor.getContactTitle());
            escribe.println("\t"+vendedor.getCustomerID()+"|"+vendedor.getCompanyName()+"|"+vendedor.getContactName()+"|"+vendedor.getContactTitle()+"|"+vendedor.getCity()+"|"+vendedor.getCountry());

    }
    fos.close();
    escribe.close();
    }
    /**
    *Este método ordena, gracias a la librería java.util, los atributos City 
    *de los objetos de tipo Customer que se encuentran dentro del arrayList.
    *Usa el método sort (ordenamiento)  y compare que compara dos objetos
    */
    public void OrdenaCity(ArrayList<Customer> table){
	 Collections.sort(table, new Comparator<Customer>(){
        public int compare(Customer vendedor1, Customer vendedor2){
            return vendedor1.getCity().compareTo(vendedor2.getCity());
        }
        });

    }
    
    public void MuestraCity(ArrayList<Customer> table){
    File fichero = new File("salida.txt");
	FileOutputStream fos = new FileOutputStream(fichero);
    PrintStream escribe=new PrintStream(fos);
	for (Customer vendedor : table){
            escribe.println("City : "+vendedor.getCity());
            escribe.println("\t"+vendedor.getCustomerID()+"|"+vendedor.getCompanyName()+"|"+vendedor.getContactName()+"|"+vendedor.getContactTitle()+"|"+vendedor.getCity()+"|"+vendedor.getCountry());

    }
    fos.close();
    escribe.close();
    }
    /**
    *Este método ordena, gracias a la librería java.util, los atributos Country 
    *de los objetos de tipo Customer que se encuentran dentro del arrayList.
    *Usa el método sort (ordenamiento)  y compare que compara dos objetos
    */
    public void OrdenaCountry(ArrayList<Customer> table){
	 Collections.sort(table, new Comparator<Customer>(){
        public int compare(Customer vendedor1, Customer vendedor2){
            return vendedor1.getCountry().compareTo(vendedor2.getCountry());
        }
        });

    }
    
    public void MuestraCountry(ArrayList<Customer> table){
    File fichero = new File("salida.txt");
	FileOutputStream fos = new FileOutputStream(fichero);
    PrintStream escribe=new PrintStream(fos);
	for (Customer vendedor : table){
            escribe.println("Country : "+vendedor.getCountry());
            escribe.println("\t"+vendedor.getCustomerID()+"|"+vendedor.getCompanyName()+"|"+vendedor.getContactName()+"|"+vendedor.getContactTitle()+"|"+vendedor.getCity()+"|"+vendedor.getCountry());

    }
    fos.close();
    escribe.close();

    }

    public void LeeGrupos(ArrayList<Customer> tabla, ArrayList<String> grupos){
	for (int i=0; i<=grupos.size()-1; i++){
		switch(grupos.get(i)){
		case "CustomerID":
			OrdenaCustomer(tabla);		
			MuestraCustomer(tabla);
		break;
		case "CompanyName":
	        OrdenaCompany(tabla);		
			MuestraCompany(tabla);
		break;
		case "ContactTitle":
	        OrdenaContact(tabla);		
			MuestraContact(tabla);
		break;
		case "City":
	        OrdenaCity(tabla);		
			MuestraCity(tabla);
		break;
		case "Country":
	        OrdenaCountry(tabla);		
			MuestraCountry(tabla);
		break;
		default:
			System.out.println("I'm sorry, failed option");
		break;

		}
	}
    }
    /**
    *Método estático 
    *
    */
    public static void main(String args[]){
     try{
    File programa = new File("DATOSP5");
    FileReader lector = new FileReader(programa);
    BufferedReader Linea = new BufferedReader(lector);
    String linea;
     ArrayList<Customer> tabla = new ArrayList<>();
     ArrayList<String> grupo = new ArrayList<>(); 

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
                        grupo.add(Buffer.get(1));
                    }
                    else{
                        tabla.add(new Customer(Buffer.get(0), Buffer.get(1), Buffer.get(2), Buffer.get(3), Buffer.get(4), Buffer.get(5)));

                    }
                }

           }
           }/*try*/catch(IndexOutOfBoundsException ioobe){
        System.out.println("Estoy en la excepcion");}
            
    }//while
    lector.close();

     Database base = new Database(tabla, grupo);
     base.LeeGrupos(tabla, grupo);

    }catch(IOException ioe){
        System.out.println("Estoy en la excepcion"+ioe);}

    
    }
}
