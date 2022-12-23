package oops;

public class a extends marks{
	
	 int sub1;
	 int sub2;
	 int sub3;
	 int marks;
	a(int sub_1, int sub_2, int sub_3){
		this.sub1=sub_1;
		this.sub2=sub_2;
		this.sub3=sub_3;
		
	}
	public  double percentage_1() {
		marks = sub1+sub2+sub3; 
		
		System.out.println("percentage of a is : "+(marks/3));
	
		return marks/3; 
	}
	@Override
	public double percentage() {
		// TODO Auto-generated method stub
		return 0;
	}



}
