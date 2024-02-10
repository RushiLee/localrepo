package javaPackage;

public class MethodOrd2 extends MethodOrd1 {

	public void Opertn(int x,int y,int w) {
		int z=x*y*w;
		System.out.println("Multi of 3 is "+z);
	}
	public static void main(String[] args) {
		MethodOrd2 M2=new MethodOrd2();
		MethodOrd1 M1=new MethodOrd1();
		M2.Opertn(2, 6, 3);
		M2.Opertn(1, 2, 4);
		M1.Opertn(1, 1, 2);
		
	}

}
