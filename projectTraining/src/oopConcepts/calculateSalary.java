package oopConcepts; 
//Java program to demonstrate Polymorphism 
 
public class calculateSalary { 

	public int sum(int x, int y) 
	{ 
		return (x + y); 
	} 


	public int sum(int x, int y, int z) 
	{ 
		return (x + y + z); 
	} 

	public double sum(double x, double y) 
	{ 
		return (x + y); 
	} 


	public static void main(String args[]) 
	{ 
		calculateSalary s = new calculateSalary(); 
		System.out.printf("Sum of x+y in first method sum \t" + s.sum(10, 20) + "\n\n"); 
		System.out.printf("Sum of x+y+z in second method sum \t" + s.sum(10, 20, 30) + "\n\n"); 
		System.out.printf("Sum of x+y double in second method sum \t"+  s.sum(10.5, 20.5) + "\n\n"); 
	} 
} 
