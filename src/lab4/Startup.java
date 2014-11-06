package lab4;

import common.Employee;
import java.util.ArrayList;
import java.util.LinkedHashSet;
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

	System.out.println("Before Remove Dups: myEmpList size is " + myEmpList.size());
	printList("myEmpList", myEmpList);
	
	myEmpList = new ArrayList<>(new LinkedHashSet<Employee>(myEmpList));
	printList("myEmpList", myEmpList);
    }
}
