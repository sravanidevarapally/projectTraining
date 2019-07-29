package classAndObjects;

public class calculateSalary {
	public static void  main(String args[]) {
    
	employeeInfo emp1 = new employeeInfo();
	employeeInfo emp2 = new employeeInfo();
	employeeInfo emp3 = new employeeInfo();
	emp1.firstName = "John";
	emp1.lastName = "Wick";
	emp1.age = 25;
	emp1.hoursWorked = 168;
	emp1.taxes = 16 ;
	emp1.salary = 55;
	
	emp1.totalSalary = (emp1.salary*emp1.hoursWorked)-((emp1.salary*emp1.hoursWorked*emp1.taxes)/100);
	
	System.out.println("Total Salary of " +emp1.firstName +" is : " +emp1.totalSalary );
	
	
	emp2.firstName = "Andy";
	emp2.lastName = "Trutna";
	emp2.age = 35;
	emp2.hoursWorked = 150;
	emp2.taxes = 16 ;
	emp2.salary = 65;
	
	emp2.totalSalary = (emp2.salary*emp2.hoursWorked)-((emp2.salary*emp1.hoursWorked*emp2.taxes)/100);
	
	System.out.println("Total Salary of " +emp2.firstName +" is : " +emp2.totalSalary );
	
	emp3.firstName = "Sunny";
	emp3.lastName = "Singh";
	emp3.age = 40;
	emp3.hoursWorked = 152;
	emp3.taxes = 16 ;
	emp3.salary = 65;
	
	emp3.totalSalary = (emp3.salary*emp3.hoursWorked)-((emp3.salary*emp1.hoursWorked*emp3.taxes)/100);
	
	System.out.println("Total Salary of " +emp3.firstName +" is : " +emp3.totalSalary );
	}

}

