package projectTraining;

class Operation{
	 int square(int n){
	  return n*n;
	 }
	}

	class Aggregation{
		Operation op;//aggregation
	 double pi=3.14;
	  
	 double area(int radius){
	   op=new Operation();
	   int rsquare=op.square(radius);//code reusability
	   return pi*rsquare;
	 }

	   
	  
	 public static void main(String args[]){
	   Aggregation c=new Aggregation();
	   double result=c.area(5);
	   System.out.println(result);
	 }
	}
