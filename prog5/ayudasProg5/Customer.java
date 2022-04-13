import java.io.*;
import java.util.*;
/**
*Clase Customer, funge como empleado que 
*tiene ciertos atributos para su negocio
*y métodos getters principalmente con su respectivo
*construcor
*/
public class Customer{
    String CustomerID;
    String CompanyName;
    String ContactName;
    String ContactTitle;
    String City;
    String Country;
    String grupo;
    /**
    *Método constructor que recibe como parámetros
    *tipos de datos string y los inicializa
    */
    public Customer(String CustomerID, String CompanyName, String ContactName, String ContactTitle, String City, String Country){
        this.CustomerID = CustomerID;
        this.CompanyName = CompanyName;
        this.ContactName = ContactName;
        this.ContactTitle = ContactTitle;
        this.City = City;
        this.Country = Country;    
    }
    /**
    *Método get que devuelve el atributo CustomerID
    *de un objeto deseado
    */
    public String getCustomerID(){
        return CustomerID;
    }
    /**
    *Método get que devuelve el atributo CompanyName
    *de un objeto deseado
    */
    public String getCompanyName(){
        return CompanyName;
    }
    /**
    *Método get que devuelve el atributo ContactName
    *de un objeto deseado
    */
    public String getContactName(){
        return ContactName;
    }
    /**
    *Método get que devuelve el atributo ContactTitle
    *de un objeto deseado
    */   
    public String getContactTitle(){
        return ContactTitle;
    }
    /**
    *Método get que devuelve el atributo City
    *de un objeto deseado
    */
    public String getCity(){
        return City;
    }
    /**
    *Método get que devuelve el atributo Country
    *de un objeto deseado
    */
    public String getCountry(){
        return Country;
    }
                  
}
