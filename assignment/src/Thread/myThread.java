package Thread;

public class myThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First fnew= new First();
		Second ss= new Second(fnew, "welcom");
		Second ss1= new Second (fnew,"new");
		Second ss2 = new Second(fnew, "programmer");
	}

}
