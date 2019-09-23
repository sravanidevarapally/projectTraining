package oopConcepts;

public class Encap {
	   private String name;
	   private String idNum;
	   private int age;
	   private String city;

	   public int getAge() {
	      return age;
	   }

	   public String getName() {
	      return name;
	   }

	   public String getIdNum() {
	      return idNum;
	   }
	   public String getCity() {
		      return city;
		   }

	   public void setAge( int newAge) {
	      age = newAge;
	   }

	   public void setName(String newName) {
	      name = newName;
	   }

	   public void setIdNum( String newId) {
	      idNum = newId;
	   }
	   public void setCity( String newCity) {
		      city = newCity;
		   }
	}
