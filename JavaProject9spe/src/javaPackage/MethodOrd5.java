package javaPackage;

public class MethodOrd5 {

	public static void main(String[] args) {
		MethodOrd3 M3=new MethodOrd4();
		/* here Reference created of MethodOrd3 which parent and object created from Chile MEthodOrd4.
		 * so object is MethodOrd4 then Common between reference MEthodOrd3 and Object MethodOrd4 will call
		 * without any issue
		 */
		M3.Cook();
		M3.Beating();
		// M3.Driving();///Error
		
		MethodOrd4 M4=new MethodOrd4();
		M4.Driving();
		M4.Beating();
	}
}
