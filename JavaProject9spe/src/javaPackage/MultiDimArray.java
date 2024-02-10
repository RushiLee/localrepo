package javaPackage;

public class MultiDimArray {

	public static void main(String[] args) {
		
		int M[][]= {{2,4,6},{5,10,15},{8,16,24}};
		/*System.out.println(M.length);
		System.out.println(M[1].length);*/
		System.out.println(M[1][2]);
		
		for(int i=0;i<M.length;i++)
		{
			for(int j=0;j<M[0].length;j++)
			{
				System.out.print(M[i][j]+ " ");
			}System.out.println(" ");
		}
	}

}
