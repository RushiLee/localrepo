package javaPackage;

public class MethodOrl1 {

	String Ex1="M1 extension online";
	String Ex2="M2 extension online";
	public void Sum(int x,int y) {
		int z=x+y;
		System.out.println("Sum of 2 is "+z);
	}
	public void Sum(int x,int y,int w) {
		int z=x+y+w;
		System.out.println("Sum of 3 is "+z);
	}
	public int Multi(int x,int y,int w) {
		int z=x*y*w;
		return z;
	}
	
}
