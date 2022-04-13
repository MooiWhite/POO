import java.io.*;
import java.util.*;
/**
*Clase Customer que representa a un vendedor
*junto con los datos de sus negocios
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
    *Método contructor 
    *@param CustomerID
    *@param CompanyName
    *@param ContactName
    *@param ContactTitle
    *@param City
    *@param Country
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
    *Método Get
    *return CustomerID
    */
    public String getCustomerID(){
        return CustomerID;
    }
    /**
    *Método Get
    *return CompanyName
    */
    public String getCompanyName(){
        return CompanyName;
    }
    /**
    *Método Get
    *return ContactName
    */
    public String getContactName(){
        return ContactName;
    }
    /**
    *Método Get
    *return ContactTitle
    */   
    public String getContactTitle(){
        return ContactTitle;
    }
    /**
    *Método Get
    *return City
    */
    public String getCity(){
        return City;
    }
    /**
    *Método Get
    *return Country
    */
    public String getCountry(){
        return Country;
    }
                  
}
