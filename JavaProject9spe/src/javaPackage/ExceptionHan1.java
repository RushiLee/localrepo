package javaPackage;

public class ExceptionHan1 {

	public static void main(String[] args) {
		
		int a=5;
		int b=0;
		
		try {
			System.out.println(a/b);
		} catch (ArithmeticException e) {
			e.getStackTrace();
			System.out.println("ArithmeticException Handled");
		}
		
		String S= null;
		
		try {
			System.out.println(S.length());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception Handled");
		}
		
		String x="Gojo";
		int y = 0 ;
		
		try {
			 y = Integer.parseInt(x);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println(y);
		}finally
		{
			System.out.println(S+y);
		}
		System.out.println("Program ran till end");
	}

}
