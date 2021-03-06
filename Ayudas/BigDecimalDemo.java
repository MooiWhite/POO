
import java.math.*;

public class BigDecimalDemo {

   public static void main(String[] args) {

      // create 2 BigDecimal Objects
      BigDecimal bg1, bg2;

      bg1 = new BigDecimal("123.12678");

      // set scale of bg1 to 2 in bg2 using floor as rounding mode
      bg2 = bg1.setScale(2, RoundingMode.FLOOR);

      String str = bg1 + " after changing the scale to 2 and rounding is " +bg2;

      // print bg2 value
      System.out.println( str );
   }
}
