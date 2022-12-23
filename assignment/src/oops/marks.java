package oops;
/*B45. We have to calculate the percentage of marks obtained
 *  in three subjects (each out of 100) by student A and in
 *   four subjects (each out of 100) by student B. Create an 
 *   abstract class ‘Marks’ with an abstract method ‘getPercentage’. 
 *   It is inherited by two other classes ‘A’ and ‘B’ each having a 
 *   method with the same name which returns the percentage of the students. 
 *   The constructor of student A takes the marks in three subjects as its parameters
 *    and the marks in four subjects as its parameters for student B. Create an object
 *     for each of the two classes and print the percentage of marks for both the students.*/
public abstract class marks {
	
	 
	public abstract double percentage() ;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		a A = new a(95,90,93);
		b B = new b(95,96,98,91);
		A.percentage_1();
		B.percentage_1();
		
	}

}
