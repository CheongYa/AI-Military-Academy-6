package stage03.operator.etudes;

public class OpEtude05 {
	public static void main(String[] args) {
		
 		int n1 = 10, n2 = 5;
		//*	
		int temp = n1;
		n1 = n2;
		n2 = temp; 
		System.out.println(n1 + "," + n2);
		//*/

		/*
		n1 = n1 ^ n2;
		n2 = n2 ^ n1;
		n1 = n1 ^ n2;		
		System.out.println(n1 + "," + n2);
		//*/
		
		System.out.println("au revoir!");
	}
}
