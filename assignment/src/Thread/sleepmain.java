package Thread;

public class sleepmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sleep t1 = new sleep();
		sleep t2 = new sleep();
		t2.setName("t2 ");
		t1.setName("t1 ");
		t1.start();
		t2.start();

	}

}
