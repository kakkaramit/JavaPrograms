package collections;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo3 {

	public static void main(String[] args) {
		Employee e1=new Employee(10);
		Employee e2=new Employee(30);
		Employee e3=new Employee(9);
		Employee e4=new Employee(10);
		Employee e5=new Employee(11);

		TreeSet<Employee> ts=new TreeSet<Employee>(new MyCoparator4());
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);

		System.out.println(ts);


	}

}


class Employee implements Comparable<Employee>{

	int eid;

	public Employee(int eid)
	{
		this.eid=eid;
	}


	public String toString()
	{
		return "EID -->"+eid;
	}


	@Override
	public int compareTo(Employee o) {
		int eid=this.eid;
		Employee e2=o;
		int eid2=e2.eid;
		if(eid < eid2)
		{
			return -1;
		}else if(eid > eid2)
		{
			return 1;
		}else 

			return 0;
	}

}

class MyCoparator4 implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {

		return o1.compareTo(o2);
	}

}
