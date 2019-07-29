
public class forLoop {
 public static void main(String args[]) {
	 int x=0,y=1,z,i,count=10; 
	 System.out.print("Fibonacci Series: ");
	 System.out.print(x+" "+y);//printing 0 and 1    
	   
	 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
	 {    
	  z=x+y;    
	  System.out.print(" "+z);    
	  x=y;    
	  y=z;    
	 }   
	  
 }
}
