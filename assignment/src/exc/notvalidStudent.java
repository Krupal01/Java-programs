package exc;

public class notvalidStudent extends Exception {

	public notvalidStudent(int age) {
		// TODO Auto-generated constructor stub
		System.out.println("age of student is not valid");
	}

	public notvalidStudent(String name) {
		// TODO Auto-generated constructor stub
		System.out.println("name of student is not valid");
	}

}
