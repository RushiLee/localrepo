package javaPackage;

public class ExceptionHan2 {
	
	public static void a(int age) {
		
		try {
			if (age<18)
			{
				throw new ArithmeticException (age+" Not Applicable , go back HOME"); 
			}else {
				System.out.println("Applicable for "+age);
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
	}

	public static void main (String[] args) throws Exception {
		
		a(15);
		a(19);
	
	}

}
