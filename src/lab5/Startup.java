package lab5;

import common.Employee;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public class Startup {
    
    public static void printMap(String mapName, Map<String,Employee> myMap) {
	if (mapName == null || myMap == null) {
	    throw new IllegalArgumentException("Cannot be NULL!");
	}
	
	int i = 0;
	for (Employee emp : myMap.values()) {
	    System.out.println(mapName + "[" + i + "] to String is \"" + emp.toString() + "\".");
	    i++;
	}	
	i = 0;
	for (String key : myMap.keySet()) {
	    System.out.println(mapName + "[" + i + "] key String is \"" + key + "\".");
	    i++;
	}	
    }

    public static void main(String[] args) {
	Map<String,Employee> myEmpMap = new HashMap<>();

	// In the initial map I chose to use SSN because for an employee that
	// is likely to be the most unique identifier available.
	Employee emp1 = new Employee("MyLastName", "MyFirstName", "111-22-3333");
	myEmpMap.put(emp1.getSsn(), emp1);
	emp1 = new Employee("SomebodyLastName", "SomebodyFirstName", "222-33-4444");
	myEmpMap.put(emp1.getSsn(), emp1);
	emp1 = new Employee("Smith", "Joe", "111-22-3333");
	myEmpMap.put(emp1.getSsn(), emp1);
	emp1 = new Employee("Valley", "Big", "444-55-6666");
	myEmpMap.put(emp1.getSsn(), emp1);

	System.out.println("myEmpMap size is " + myEmpMap.size());
	printMap("myEmpMap", myEmpMap);
	
	System.out.println("myEmpMap[444-55-6666] is \"" + myEmpMap.get("444-55-6666"));
	
	emp1 = new Employee("River", "Little", "555-66-7777");
	myEmpMap.put("222-33-4444", emp1);
	printMap("myEmpMap", myEmpMap);
	// The object at Key "222-33-4444" is replaced.  But the key stays the same.
	// Now of course, my employee SSN no longer matches the key in the map...
	
    }
}
