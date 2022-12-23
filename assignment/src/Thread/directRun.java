package Thread;

public class directRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thread1 t1 =new thread1();
		thread1 t2 = new thread1();
		t2.setName("t2 ");
		t1.setName("t1 ");
		t2.run();
		t1.run();

	}

}
