package Thread;

public class sleep extends Thread {
	public void run() {
	for(int i=0;i<6;i++) {
		System.out.println(getName()+i);
		try {
			Thread.sleep(2000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	}
}
