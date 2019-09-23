package oopConcepts;

class Calculation {
   int z;
	
   public void addition(int x, int y) {
      z = x + y;
      System.out.println("The sum of the numbers from class Calculation:   "+z +"\n");
   }
	
   public void Subtraction(int x, int y) {
      z = x - y;
      System.out.println("The difference between the numbers from class calculation:   "+z+"\n");
   }
}

public class Mycalculation extends Calculation {
   public void multiplication(int x, int y) {
      z = x * y;
      System.out.println("The product of the numbers from class Mycalculation:   "+z+"\n");
   }
	
   public void division(int x, int y) {
	      z = x / y;
	      System.out.println("The division of the numbers from class Mycalculation:   "+z+"\n");
	   }
   
   public static void main(String args[]) {
      int a = 20, b = 10;
      Mycalculation mycal = new Mycalculation();
      mycal.addition(a, b);
      mycal.Subtraction(a, b);
      mycal.multiplication(a, b);
      mycal.division(a,b);
   }
}