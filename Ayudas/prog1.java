import java.lang.*;
import java.math.*;
public class prog1 extends Thread{
    double x;	
    int n;
    BigDecimal k = new BigDecimal(0);
    BigDecimal buffer;
    
    public prog1(double x, int n){
	this.x = x;
	this.n = n;	
    }
    
    public BigDecimal factorial(BigDecimal fac){
	BigDecimal temp = new BigDecimal("1.0");
    BigInteger factTemp = fac.toBigInteger();
    for(BigInteger i = BigInteger.valueOf(1) ; i.compareTo(factTemp)<=0 ; i=i.add(BigInteger.ONE) ){
       BigDecimal ii  = new BigDecimal(i);
	   temp = temp.multiply(ii);
	}
	return temp;
    }
    public void run(){
	
	BigDecimal temp = new BigDecimal("0.0");
	BigDecimal o;
    BigInteger kTemp;
    BigInteger oTemp;
	
	BigDecimal sin = new BigDecimal(Math.sin(x));
	System.out.println("Seno sin redondeo: "+sin);
	sin = sin.setScale(n, BigDecimal.ROUND_HALF_DOWN);
	BigDecimal dos = new BigDecimal("2");
	BigDecimal one = new BigDecimal("1");

	while(sin != temp){
	  o = (dos.multiply(k)).add(one);
	  
	  System.out.println("waiting...");
	 
	  BigDecimal mUno = new BigDecimal(-1);
      kTemp = k.toBigInteger();
	  for(BigInteger i = BigInteger.valueOf(1) ; i.compareTo(kTemp)<=0 ; i=i.add(BigInteger.ONE) )      {
	    mUno = mUno.multiply(mUno);
	   }

/*------------------------------------------------------*/
	
      oTemp = o.toBigInteger();
	  BigDecimal xNum = new BigDecimal(x);
	  for(BigInteger i = BigInteger.valueOf(1) ; i.compareTo(oTemp)<=0 ; i=i.add(BigInteger.ONE) ){
	    xNum = xNum.multiply(xNum);
	}
      System.out.println("EL 1 a la potencia es sin redondeo: "+mUno);
	  mUno = mUno.multiply(xNum);

	  BigDecimal fac = factorial(o);

	  /*System.out.println("El seno redondeado"+sin);
	  System.out.println("temp sin redondeo: "+temp);
	  System.out.println("temp redondeado: "+temp.setScale(n, BigDecimal.ROUND_HALF_DOWN));*/
      
	  BigDecimal buffer = new BigDecimal("0.0");
	  buffer = mUno.divide(fac, BigDecimal.ROUND_HALF_DOWN);
      System.out.println("temp sin redondeo: "+buffer);
	  k = k.add(one);
          temp = temp.add(buffer);
	  if (temp.setScale(n, BigDecimal.ROUND_HALF_DOWN).equals(sin)){
		System.out.println("round half up es: "+temp.setScale(n, BigDecimal.ROUND_HALF_UP));
		//System.out.println("setScale a temp es: "+temp.setScale(n, BigDecimal.ROUND_HALF_DOWN));
		System.out.println("Listo!, el número de ciclos es: "+k.subtract(one));
		System.exit(0);
	  }

	}
    }
	
    public static void main(String args[]) throws InterruptedException{
	try{
	Double x = Double.parseDouble(args[0]);
	Integer n = Integer.parseInt(args[1]);
	
	prog1 uno = new prog1(x,n);
	uno.start();
	uno.join();
	System.out.println(uno.k);
	}catch(ArrayIndexOutOfBoundsException aioobe){
		System.out.println("La forma de uso es java prog1 |numero| |numero|");
	}
    }
}

 
