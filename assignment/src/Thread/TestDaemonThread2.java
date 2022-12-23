package Thread;

public class TestDaemonThread2 extends Thread {
	public void run() {
		for(int i=0; i<6;i++) {
			System.out.println(i);
		}
	}

}
