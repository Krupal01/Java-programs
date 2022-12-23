package Thread;

public class deamon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDaemonThread2 t1=new TestDaemonThread2();
		TestDaemonThread2 t2=new TestDaemonThread2();
		t1.start();
		t1.setDaemon(true);//will throw exception here
		t2.start();

	}

}
