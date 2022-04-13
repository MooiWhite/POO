import java.math.*;
public class FactorialPrueba{

    public void getFactorial(BigInteger esup,long it){
	BigDecimal temp = new BigDecimal("1");
	for(BigInteger i = BigInteger.valueOf(1) ; i.compareTo(esup)<=0 ; i=i.add(BigInteger.ONE) ){
	    BigDecimal ii  = new BigDecimal(i);
	    temp=temp.multiply(ii);
	}
        System.out.println("El valor del factorial es:"+temp); 
        System.out.println("EN EL TIEMPO:"+(System.currentTimeMillis()-it)/1000 + "seg");
    }

    public static void main( String args[] ) {
	long initialTime = System.currentTimeMillis();
	FactorialPrueba f = new FactorialPrueba();
    BigInteger mucho = new BigInteger("10000");
	f.getFactorial(mucho,initialTime);
    }    
}
