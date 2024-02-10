package javaPackage;

public class RelationOp {

	public static void main(String[] args) {
		int a=10;
		int b=15;
		String p="Tango";
		String q="tango";
		String r="tango";
		
		if(p.equals(q)) {
			System.out.println("p and q are equals");
		}else {
			System.out.println("p and q are not equal");
		}
		if(p.equalsIgnoreCase(r)) {
			System.out.println("p and r are equals by igonring case");
		}
	}

}
