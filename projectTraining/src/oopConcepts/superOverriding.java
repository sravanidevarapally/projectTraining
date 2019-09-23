package oopConcepts;


class Car {
	   public void move() {
	      System.out.println("Cars are good means of transport");
	   }
	}

	class BMW extends Car {
	   public void move() {
	      System.out.println("BMW is really cool car");
	   }
	}

	public class superOverriding {

	   public static void main(String args[]) {
	      Car a = new Car();   // Animal reference and object
	      Car b = new BMW();   // Animal reference but Dog object

	      a.move();   // runs the method in Animal class
	      b.move();   // runs the method in Dog class
	   }
	}

	