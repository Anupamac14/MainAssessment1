

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorEx{
public static void main(String args[])
{
	ArrayList<Employee> list=new ArrayList<Employee>();
	list.add(new Employee(3,"Anu",24));
	list.add(new Employee(2,"Racchu",26));
	list.add(new Employee(1,"Buff",25));
	list.add(new Employee(4,"Netty",23));
	
	Comparator<Employee> C=(E1,E2) -> {
		return (E1.empAge==E2.empAge)?0:(E1.empAge>E2.empAge)?1:-1;		 
	};
	System.out.println("Sorted for Employee Age:");
	Collections.sort(list,C);
	for(Employee e:list)
	{
		System.out.println(e.empId+" "+e.empName+" "+e.empAge);
	}
}
}
 
class Employee
{
	int empId;
	String empName;
	int empAge;
	public Employee(int empId, String empName, int empAge) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
	}
	
}
