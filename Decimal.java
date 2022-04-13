import java.math.*;
public class Decimal{
	public static BigDecimal sqrt(BigDecimal A, final int SCALE) {
 	   BigDecimal x0 = new BigDecimal("0");
	   System.out.println(A);
 	   System.out.println("El valor doble es :" + A.doubleValue());
	   System.out.println("El valor Integer es: " +A.toBigInteger());
	    BigDecimal x1 = new BigDecimal(Math.sqrt(A.doubleValue()));
	    BigDecimal TWO = new BigDecimal("2");
	    while (!x0.equals(x1)) {
        	x0 = x1;
		System.out.println(x0);
	        x1 = A.divide(x0, SCALE, BigDecimal.ROUND_HALF_UP);
		System.out.println("Aqui se está dividiendo "+A+" entre "+ x0);
	        x1 = x1.add(x0);
	        x1 = x1.divide(TWO, SCALE, BigDecimal.ROUND_HALF_UP);
		System.out.println("Aquí se está dividiendo "+x1+" entre "+TWO);
		System.out.println(x1);

   		 }	
  	  return(x1);
        }


	public static void main(String args[]){
		System.out.println("Ciao");
		BigDecimal uno;
		uno = new BigDecimal("1.234567892345678923456789987654322345678998765432345678998765432234567899876543234354536548786764098989767675656465093254114908645678342657878787090906352672845996960627278394944765242425237474859607079686756455345262181891717238961524232452535446647474473618666666666666666666666666666666666666666666666666666666666666666666666666666666666666666344252626615252555344425510999828827277635463782633333333333333333333333333366666666666666666222222222222222222222222222222228881910108333333333333333333333333333333333333333777777777777777777777777777777777777777777777777777777777777777777733333333333333333333333333333333333");
		System.out.println(uno);
		BigDecimal res;
		res =  sqrt(uno,2);
		System.out.println(res);

	}
   
}
