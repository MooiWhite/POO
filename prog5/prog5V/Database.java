import java.io.*;
import java.util.*;

/**
*Clase Database, que maneja tipos de dato tipo Customer
*En sus atrubutos se encuentra un ArrayList del mencionado 
*y otro de tipo String. Representa una tabla de vendedores
*@author	Mariana Martínez Soto. Reyes Alonso Katherine
*@version	0.5
*@since  	1.0
*/
public class Database{

    ArrayList<Customer> table;
    ArrayList<String> groups;

    /**
    *Este método es un constructor que inicializa los parámetros
    *@param table. Un ArrayList que contiene objetos tipo Customer y otro 
    *ArrayList que contiene objetos de tipo String
    */
    public Database (ArrayList<Customer> table, ArrayList<String> gruops){
        this.table = table;
        this.groups = groups;
    }
	
    /**
    *Este método ordena, gracias a la librería java.util, los atributos CustomerID 
    *de los objetos de tipo Customer que se encuentran dentro del arrayList.
    *Usa el método sort (ordenamiento)  y compare que compara dos objetos
    *@param table Arreglo de objetos Customer
    */
    public void OrdenaCustomer(ArrayList<Customer> table){
	 Collections.sort(table, new Comparator<Customer>(){
        public int compare(Customer vendedor1, Customer vendedor2){
            return vendedor1.getCustomerID().compareTo(vendedor2.getCustomerID());
        }
        });

    }
    /**Este método
    *Este Método muestra en pantalla los atributos CustomerID 
    *de todos los objetos contenidos en el ArrayList
    *enviado por parámetros
    *@param table Un ArrayList de objetos Customer
    */
    public void MuestraCustomer(ArrayList<Customer> table){
        for (Customer vendedor : table){
        System.out.println("CustomerID : "+vendedor.getCustomerID());
        System.out.println("\t"+vendedor.getCustomerID()+"|"+vendedor.getCompanyName()+"|"+vendedor.getContactName()+"|"+vendedor.getContactTitle()+"|"+vendedor.getCity()+"|"+vendedor.getCountry());
    }
    }
    /**
    *Este método ordena, gracias a la librería java.util, los atributos CompanyName 
    *de los objetos de tipo Customer que se encuentran dentro del arrayList.
    *Usa el método sort (ordenamiento)  y compare que compara dos objetos
    *@param table UN ArrayList de objetos Customer
    */
    public void OrdenaCompany(ArrayList<Customer> table){
	 Collections.sort(table, new Comparator<Customer>(){
        public int compare(Customer vendedor1, Customer vendedor2){
            return vendedor1.getCompanyName().compareTo(vendedor2.getCompanyName());
        }
        });

    }
    /**Este método
    *Este Método muestra en pantalla los atributos CompanyName 
    *de todos los objetos contenidos en el ArrayList
    *enviado por parámetros
    *@param table Un ArrayList de objetos Customer
    */
    public void MuestraCompany(ArrayList<Customer> table){
    for (Customer vendedor : table){
        System.out.println("CompanyName : "+vendedor.getCompanyName());
        System.out.println("\t"+vendedor.getCustomerID()+"|"+vendedor.getCompanyName()+"|"+vendedor.getContactName()+"|"+vendedor.getContactTitle()+"|"+vendedor.getCity()+"|"+vendedor.getCountry());
    }
    }
    /**
    *Este método ordena, gracias a la librería java.util, los atributos ContactTitle 
    *de los objetos de tipo Customer que se encuentran dentro del arrayList.
    *Usa el método sort (ordenamiento)  y compare que compara dos objetos
    *@param table Un ArrayList de objetos Customer
    */
    public void OrdenaContact(ArrayList<Customer> table){
	 Collections.sort(table, new Comparator<Customer>(){
        public int compare(Customer vendedor1, Customer vendedor2){
            return vendedor1.getContactTitle().compareTo(vendedor2.getContactTitle());
        }
        });

    }

    /**Este método
    *Este Método muestra en pantalla los atributos Contact
    *de todos los objetos contenidos en el ArrayList
    *enviado por parámetros
    *@param table Un ArrayList de objetos Customer
    */
    public void MuestraContact(ArrayList<Customer> table){
    for (Customer vendedor : table){
        System.out.println("Contact : "+vendedor.getContactName());
        System.out.println("\t"+vendedor.getCustomerID()+"|"+vendedor.getCompanyName()+"|"+vendedor.getContactName()+"|"+vendedor.getContactTitle()+"|"+vendedor.getCity()+"|"+vendedor.getCountry());
    }
    }
    /**
    *Este método ordena, gracias a la librería java.util, los atributos City 
    *de los objetos de tipo Customer que se encuentran dentro del arrayList.
    *Usa el método sort (ordenamiento)  y compare que compara dos objetos
    *@param table Un ArrayList de objetos Customer
    */
    public void OrdenaCity(ArrayList<Customer> table){
	 Collections.sort(table, new Comparator<Customer>(){
        public int compare(Customer vendedor1, Customer vendedor2){
            return vendedor1.getCity().compareTo(vendedor2.getCity());
        }
        });

    }
    /**Este método
    *Este Método muestra en pantalla los atributos City 
    *de todos los objetos contenidos en el ArrayList
    *enviado por parámetros
    *@param table Un ArrayList de objetos Customer
    */
    public void MuestraCity(ArrayList<Customer> table){
    for (Customer vendedor : table){
        System.out.println("City : "+vendedor.getCity());
        System.out.println("\t"+vendedor.getCustomerID()+"|"+vendedor.getCompanyName()+"|"+vendedor.getContactName()+"|"+vendedor.getContactTitle()+"|"+vendedor.getCity()+"|"+vendedor.getCountry());
    }
    }
    /**
    *Este método ordena, gracias a la librería java.util, los atributos Country 
    *de los objetos de tipo Customer que se encuentran dentro del arrayList.
    *Usa el método sort (ordenamiento)  y compare que compara dos objetos
    *@param table Un ArrayList de objetos Customer
    */
    public void OrdenaCountry(ArrayList<Customer> table){
	 Collections.sort(table, new Comparator<Customer>(){
        public int compare(Customer vendedor1, Customer vendedor2){
            return vendedor1.getCountry().compareTo(vendedor2.getCountry());
        }
        });

    }
    /**Este método
    *Este Método muestra en pantalla los atributos Country 
    *de todos los objetos contenidos en el ArrayList
    *enviado por parámetros
    *@param table Un ArrayList de objetos Customer
    */
    public void MuestraCountry(ArrayList<Customer> table){
    for (Customer vendedor : table){
        System.out.println("Country : "+vendedor.getCountry());
        System.out.println("\t"+vendedor.getCustomerID()+"|"+vendedor.getCompanyName()+"|"+vendedor.getContactName()+"|"+vendedor.getContactTitle()+"|"+vendedor.getCity()+"|"+vendedor.getCountry());
    }
    }
    /**
    *Leerá uno por uno los elementos del ArrayList grupos, dependiendo de esto para ordenar los
    *atributos de cada uno de los objetos de tipo Customer del ArrayList tabla
    *@param tabla Un ArrayList de objetos Customer
    *@grupos Un ArrayList de Strings
    */
    public void LeeGrupos(ArrayList<Customer> tabla, ArrayList<String> grupos){
	for (int i=0; i<=grupos.size()-1; i++){
		switch(grupos.get(i)){
		case "CustomerID":
            System.out.println("\n");
			OrdenaCustomer(tabla);		
			MuestraCustomer(tabla);
		break;
		case "CompanyName":
            System.out.println("\n");
	        OrdenaCompany(tabla);		
			MuestraCompany(tabla);
		break;
		case "ContactTitle":
            System.out.println("\n");
	        OrdenaContact(tabla);		
			MuestraContact(tabla);
		break;
		case "City":
            System.out.println("\n");
	        OrdenaCity(tabla);		
			MuestraCity(tabla);
		break;
		case "Country":
            System.out.println("\n");
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
    *Método estático que lee un archivo linea por linea
    *Y cada vez que encuentre un pipe lo adjuntará en un ArrayList Buffer
    *para posteriormente unirlos como atributos de un solo objeto y a su vez estos últimos 
    *agregarlos en otro ArrayList de objetos
    *Cuando encuentre dos puntos ajuntará las cadenas en un ArrayList de Strings
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
