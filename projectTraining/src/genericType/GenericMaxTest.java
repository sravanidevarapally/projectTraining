package genericType;

public class GenericMaxTest {
	   // determines the largest of three Comparable objects
	   
	   public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
	      T max = x;   // assume x is initially the largest
	      
	      if(y.compareTo(max) > 0) {
	         max = y;   // y is the largest so far
	      }
	      
	      if(z.compareTo(max) > 0) {
	         max = z;   // z is the largest now                 
	      }
	      return max;   // returns the largest object   
	   }
	   
	   public static void main(String args[]) {
	      System.out.printf("Max of %d, %d and %d is %d\n\n", 
	         10, 8090, 9874, maximum( 10, 8090, 9874 ));

	      System.out.printf("Max of %.1f,%.1f and %.1f is %.1f\n\n",
	         6.68904097, 800.8986, 78.71, maximum( 6.68904097, 800.8986, 78.71 ));

	      System.out.printf("Max of %s, %s and %s is %s\n","avocado",
	         "apple", "orange", maximum("avocado", "apple", "orange"));
	   }
	}
	