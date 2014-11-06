package lab3;

import common.Employee;
import java.util.ArrayList;
import java.util.List;

public class Startup {
    
    public static void printList(String listName, List<Employee> myList) {
	if (listName == null || myList == null) {
	    throw new IllegalArgumentException("Cannot be NULL!");
	}
	
	int i = 0;
	for (Employee emp2 : myList) {
	    System.out.println(listName + "[" + i + "] to String is \"" + emp2.toString() + "\".");
	    i++;
	}	
    }

    public static void main(String[] args) {
	List<Employee> myEmpList = new ArrayList<>();

	myEmpList.add(new Employee("MyLastName", "MyFirstName", "111-22-3333"));
	myEmpList.add(new Employee("SomebodyLastName", "SomebodyFirstName", "222-33-4444"));
	myEmpList.add(new Employee("Smith", "Joe", "111-22-3333"));
	myEmpList.add(new Employee("Valley", "Big", "444-55-6666"));

	System.out.println("myEmpList size is " + myEmpList.size());

	int i = 2;
	Employee emp1 = myEmpList.get(i);
	System.out.println("myEmpList[" + i + "] to String is \"" + emp1.toString() + "\".");

	i = 0;
	for (Employee emp2 : myEmpList) {
	    System.out.println("myEmpList[" + i + "] to String is \"" + emp2.toString() + "\".");
	    i++;
	}

	myEmpList.set(3, new Employee("Stream", "Little", "333-22-4444"));
	printList("myEmpList", myEmpList);

	myEmpList.remove(new Employee("Smith", "Joe", "111-22-3333"));
	printList("myEmpList", myEmpList);

    }
}
