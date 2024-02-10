package javaPackage;

public class MethodOrl2 extends MethodOrl1{

	public static void main(String[] args) {
		MethodOrl2 M2=new MethodOrl2();
		
		System.out.println(M2.Ex1);
		M2.Sum(5,8);
		M2.Sum(2, 20, 200);
		
		/*Now even if we remove extends MethodOrl1 and create object of Method1,M1
		and call Class MEthodOrl1 variable then still we wont get any error*/
		MethodOrl1 M1=new MethodOrl1();
		System.out.println(M1.Ex2);
		System.out.println("Multi is "+M1.Multi(2, 10, 5));
	}
}

