package oops;
/*B39. Create a class named ‘Member’ having the following members:
Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 - Salary
It also has a method named ‘printSalary’ which prints the salary of the members.
Two classes ‘Employee’ and ‘Manager’ inherits the ‘Member’ class. The ‘Employee’ and ‘Manager’ 
classes have data members ‘specialization’ and ‘department’ respectively. Now, assign name, age,
 phone number, address and salary to an employee and a manager by making an object of both of these
  classes and print the same.*/

public class member {
	String name = new String();
	int age ;
	long phone_number;
	String add = new String();
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public static long getSalary() {
		return salary;
	}

	public static void setSalary(long salary) {
		member.salary = salary;
	}

	static long salary;
	
	public static void printSalary() {
		System.out.println("salary is : "+salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee e = new employee();
		manager m = new manager();
		
		e.setName("krupal");
		e.setAge(20);
		e.setPhone_number(8530559043L);
		e.setAdd("rajkot");
		e.setSalary(20000);
		e.printn();
		
		m.setName("krupal");
		m.setAge(20);
		m.setPhone_number(8530559043L);
		m.setAdd("rajkot");
		m.setSalary(20000);
		m.printn();

	}

}
