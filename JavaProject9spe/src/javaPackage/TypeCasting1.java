package javaPackage;

public class TypeCasting1 {
	int a=50;
	String b="Gojo";
	String X="11";
	static double d=5.678d;
	static int f=9;
	public static void main(String[] args) {
		
		int z=(int) d;
		System.out.println(z);
		
		TypeCasting1 T1=new TypeCasting1();
		int i=Integer.parseInt(T1.X);
		System.out.println(i);
		
		String s=String.valueOf(T1.a);
		System.out.println(s);
		
		float p=f;
		System.out.println(p);
	}

}
