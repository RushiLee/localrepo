package javaPackage;

public class ArrayMethod {

	static int c[]={2,4,3,9,5,10};
	
	public void Arraywithmethod(int c[])
	{
		int b=c[4];
		for(int i=0;i<c.length;i++)
		{
			if(b<c[i]) {
				System.out.println(c[i]);
			}else {
				System.out.println("Mission Abort");
			}
		}
		
	}
	public static void main(String[] args) {
		int x[]= {4,16,8,64,6,36};
		ArrayMethod AM=new ArrayMethod();
		AM.Arraywithmethod(x);

	}

}
