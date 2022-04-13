import java.util.*;

public class prueba{
    public static void main(String args[]){
        StringTokenizer st = new StringTokenizer("[DATA]\nCustomerID|CompanyName|ContactName|ContactTitle|City|Country\nBOTTM|Bottom.Dollar Markets|Elizabeth Lincoln|Accounting Manager|BC|Canada\n[GROUPS]\nGroup:Country\nGroup:City", "\\|:");
         while (st.hasMoreTokens()) {
         System.out.println(st.nextToken());
     }
    }
}
