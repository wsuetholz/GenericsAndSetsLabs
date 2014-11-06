package lab1;

import common.Employee;

public class Startup {

    public static void main(String[] args) {
	Employee emp1 = new Employee("MyLastName", "MyFirstName", "111-22-3333");
	Employee emp2 = new Employee("MyLastName", "MyFirstName", "111-22-3333");
	
	System.out.println("emp1 to String is \"" + emp1.toString() + "\".");
	System.out.println("emp2 to String is \"" + emp2.toString() + "\".");
	System.out.println("emp1 == emp2 ? " + emp1.equals(emp2));
    }
}
