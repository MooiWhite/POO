import java.math.*;
public class FactorialT extends Thread{
   int finf;
   int fsup;
   long it;
   BigInteger fact = BigInteger.ONE;
   static BigInteger resultado;

   public FactorialT(int finf, int fsup,long it){
	this.finf=finf;
	this.fsup=fsup;
	this.it=it;
        this.fact  = new BigInteger("1");
   }
	
    public void run(){
	BigInteger temp = new BigInteger("1");
	    for(int i=finf;i<=fsup;i++)
		temp=temp.multiply(BigInteger.valueOf(i));
	 System.out.println("El valor del factorial temporal es:"+temp); 
         System.out.println("EN EL TIEMPO:"+(System.currentTimeMillis()-it)/1000 + "seg ");
	fact=temp;
    }

    public static BigInteger getFactorial(){
	 return resultado;
    }

/*    public static void main( String args[] ) throws InterruptedException {
	long initialTime = System.currentTimeMillis();
	FactorialT f1 = new FactorialT(1,25,initialTime);	
	FactorialT f2 = new FactorialT(25,50,initialTime);
	f2.start();
	f1.start();
	f1.join();
	f2.join();
	resultado=f1.fact.multiply(f2.fact);
	System.out.println("El valor del FACTORIAL:"+getFactorial()); 
    }    
*/
}
