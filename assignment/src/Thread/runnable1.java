package Thread;

public class runnable1 implements Runnable {
	private Thread t;
	
	public runnable1() {
		t=new Thread(this);
	}
	public void start() {
		t.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<6;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
