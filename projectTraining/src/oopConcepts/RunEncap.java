package oopConcepts;


public class RunEncap {

	   public static void main(String args[]) {
	      Encap encap = new Encap();
	      encap.setName("James");
	      encap.setAge(20);
	      encap.setIdNum("12343");
	      encap.setCity("Florida");

	      System.out.print("Name : " + encap.getName() + "\nAge : " + encap.getAge()  + "\nId Number: " + encap.getIdNum() +  "\nAddress: " +encap.getCity());
	   }
	}