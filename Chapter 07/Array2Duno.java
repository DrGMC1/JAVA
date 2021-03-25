package week7;

public class Array2Duno {

	public static void  main (String [] args) {
		int [] [] scores;
		scores = new int [3][3];

		scores [0][0] = 22;
		scores [2][1] = 95;
		scores [2][2] = 96;
		
		
		System.out.println(scores [0][0]);
		System.out.println(scores [2][1]);
		System.out.println(scores [1][2]);
		System.out.println(scores [1][1]);
		System.out.println(scores [2][2]);
	}
	
}
