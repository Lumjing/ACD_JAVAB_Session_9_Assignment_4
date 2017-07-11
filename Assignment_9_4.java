package assignment_9_4;
import java.util.*;       
 
//This Assignment helped me to master the concepts of Comparator class and treeset.
 

public class Assignment_9_4    //Class declaration containing main function.  
{
	public static void main(String[] args)     //main function declaration. and because it is static, program execution starts from main function. 
	{
		//Creating the object of TreeSet and in the constructor, we are passing the object of the SortEmployees class.
		TreeSet<Employee> treeSetObject = new TreeSet<Employee>(new SortEmployees());
		
		//Now we will add the objects of Employee class into treeSetObject.
		treeSetObject.add(new Employee("Lumjing", 3, 200000));
		treeSetObject.add(new Employee("Santosh", 1, 400000));
		treeSetObject.add(new Employee("Madhav", 2, 120000));
		treeSetObject.add(new Employee("Shyam", 2, 400000));
		treeSetObject.add(new Employee("Mandar", 1, 100000));
		treeSetObject.add(new Employee("Mandar", 2, 200000));
		
		
		//We will use for each loop for that.
		for(Employee tempObject : treeSetObject)
			System.out.println(tempObject);     //Printing the information about Employee.
	}   //End of main function.

}    //End of class.
