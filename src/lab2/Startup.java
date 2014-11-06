package lab2;

import common.Employee;
import java.util.ArrayList;
import java.util.List;

public class Startup {

    public static void main(String[] args) {
	List myList = new ArrayList();

	myList.add(new Employee("MyLastName", "MyFirstName", "111-22-3333"));
	myList.add(new Employee("SomebodyLastName", "SomebodyFirstName", "222-33-4444"));
	myList.add(new Employee("Smith", "Joe", "111-22-3333"));
	myList.add(new Employee("Valley", "Big", "444-55-6666"));
	//myList.add(new Employee("Stream", "Little", "555-66-7777"));

	System.out.println("MyList Size is " + myList.size());

	Employee emp1 = (Employee) myList.get(2);
	System.out.println("emp1 to String is \"" + emp1.toString() + "\".");

	for (int i = 0; i < myList.size(); i++) {
	    emp1 = (Employee) myList.get(i);
	    System.out.println("myList[" + i + "] to String is \"" + emp1.toString() + "\".");
	}

	emp1 = new Employee("Valley", "Big", "444-55-6666");
	if (myList.contains(emp1)) {
	    System.out.println("myList contains employee \"" + emp1.toString() + "\".");
	}
	
	List mySubList = myList.subList(0, 3);
	int i = 0;
	for (Object obj : mySubList) {
	    emp1 = (Employee)obj;
	    System.out.println("myList[" + i + "] to String is \"" + emp1.toString() + "\".");
	    i++;
	}
    }
}
