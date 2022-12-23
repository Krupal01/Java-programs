package exc;

public class notvalid extends Exception {
	int i;
	public notvalid(int i) {
		this.i=i;
		System.out.println("hello");
	}
	public int notvalid() {
		// TODO Auto-generated method stub
		return i;
	}
}
