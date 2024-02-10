package javaPackage;

public class WhileLoop {

	public static void main(String[] args) {
		
		int i=1;
		while(i<5) {
			int b=i*10;
			i++;
			if(b==40) {
				break;
			}
			System.out.println(b);
		}

	}

}
