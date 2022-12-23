package oops;

public class b extends marks {
	int sub1;
	int sub2;
	int sub3;
	int sub4;
	int marks;
	b(int sub_1, int sub_2, int sub_3, int sub_4){
		this.sub1=sub_1;
		this.sub2=sub_2;
		this.sub3=sub_3;
		this.sub4=sub_4;
		
	}
	public double percentage_1() {
		marks = sub1+sub2+sub3+sub4; 
		
		System.out.println("percentage of b is : "+(marks/4));
		return marks/4; 
	}
	@Override
	public double percentage() {
		// TODO Auto-generated method stub
		return 0;
	}
}


