import java.util.Scanner;

public class bank {

	static int total;
	static String name;
	static String BOD;
	static String age;
	static String gender;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			int option;
			System.out.println("............select options..........");
			System.out.println("1. creat account");
			System.out.println("2. creadit ammount");
			System.out.println("3. deposit ammount");
			System.out.println("4. see your details");
			Scanner s = new Scanner(System.in);
			option = s.nextInt();
			
			switch(option) {
			
			case 1 : creat();
			case 2 : creadit();
			case 3 : deposit();
			case 4 : details();
			
			}
			
			if(option==1) {
				creat();
			}
			else if(option==2) {
				creadit();
			}
			else if (option==3) {
				deposit();
			}
			else {
				System.out.print("Errer.....choose valid option.....");
			}
			
		}

	}

	private static void details() {
		// TODO Auto-generated method stub
		System.out.println("your name is :"+ name);
		System.out.println("your age is:"+ age);
		System.out.println("your balance is:" + total);
		
	}

	public static void creat() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("enter your full name");
		name=s.nextLine();
		
		System.out.println("enter your BOD(like 08-04-2021");
		BOD=s.nextLine();
		
		System.out.println("enter your age(in number)");
		age=s.nextLine();
		
		System.out.println("enter your gender: male(m) or female(f)");
		gender=s.nextLine();
		
		System.out.println("hello.."+ name + ", your account was created");
	}

	private static void creadit() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter ammount");
		int c ;
		c=s.nextInt();
		total+=c;
		System.out.println("your total amount is" + total);
		
		
	}

	private static void deposit() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter ammout");
		int d;
		d=s.nextInt();
		if(total>=d) {
			total-=d;
			System.out.println("your left ammount is"+total);
		}
		else {
			System.out.println("you have not enough balance");
		}
	}

}
