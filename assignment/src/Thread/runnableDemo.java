package Thread;

public class runnableDemo {
/*W.A.J. P to create one thread by implementing Runnable interface in Class.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		runnable1 r = new runnable1();
		runnable1 r1 = new runnable1();
		r.start();
		r1.start();

	}

}
