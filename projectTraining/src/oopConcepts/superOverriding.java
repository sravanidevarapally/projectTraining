package oopConcepts;


class Car {
	   public void move() {
	      System.out.println("Cars are good means of transport\n");
	   }
	}

	class BMW extends Car {
	   public void move() {
	      System.out.println("BMW is really cool car\n");
	   }
	}
	
	class Power extends Car {
		public void move() {
			System.out.println("BMW has v8 engine power\n");
		}
	}
	
	class Model extends Car{
		public void move() {
			System.out.println("BMW 5 series is the new great model\n");
		}
	}

	public class superOverriding {

	   public static void main(String args[]) {
	      Car a = new Car();   // Car reference and object
	      Car b = new BMW();  // Car reference but BMW object
	      Car c = new Power(); // Car reference but Power object
	      Car d = new Model(); // Car reference but Model object

	      a.move();   // runs the method in Car class
	      b.move();   // runs the method in BMW class
	      c.move();   // runs the method in Power class
	      d.move();   // runs the method in Model class
	   }
	}

	