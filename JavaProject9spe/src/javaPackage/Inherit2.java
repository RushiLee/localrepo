package javaPackage;

public class Inherit2 extends Inherit1 {

	String a="Rambo";
	static int x=5;
	String b="KGF";
	public static void main(String[] args) {
	
		Inherit1 I1=new Inherit1();
		Inherit2 I2=new Inherit2();
		System.out.println(I1.a);
		System.out.println(x);
		System.out.println(I2.a);
	}

}
