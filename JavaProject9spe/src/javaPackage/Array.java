package javaPackage;

public class Array {

	public static void main(String[] args) {
		int a[]=new int[5];
		System.out.println(a.length);
		System.out.println(a[2]);
		
		Object o[]= {1,1.55,'c',"Lee",9.9999};
		for(int i=0;i<o.length;i++)
		{
			System.out.println(o[i]);
		}
	}

}
