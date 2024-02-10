package javaPackage;

public class Inherit8 extends Inherit7 {

	static int m;
	int d;
	public static void mul(int p,int q) {
		m=p*q;
		System.out.println(m);
	}
	public void div(int p,int q) {
		Inherit8 I8=new Inherit8();
		I8.d=p/q;
		System.out.println(I8.d);
	}
	
	
	public static void main(String[] args) {
		int p=16;
		int q=8;
		Inherit7 I7=new Inherit7();
		Inherit8 I8=new Inherit8();
		I7.add(50, 10);
		I7.sub(40, 20);
		mul(5,15);
		I8.div(12,2);
		I8.div(p,q);
		
	}

}
