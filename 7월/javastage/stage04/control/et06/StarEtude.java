package stage04.control.et06;

public class StarEtude {
	public static void main(String[] args) {
		int i=1;
		while(i<=5) {
			int j=1;
			while(j<=i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		System.out.println("-----------");

		i=1;
		while(i<=5) {
			int j=1;
			while(j<=6-i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		System.out.println("-----------");

		i=1;
		while(i<=5) {
			int j=1;
			while(j<=5) {
				if (j >= i)	System.out.print("*");
				else System.out.print(" ");
				j++;
			}
			System.out.println();
			i++;
		}

		System.out.println("-----------");

		i=1;
		while(i<=5) {
			int j=1;
			while(j<=5) {
				if (j >= 6-i)	System.out.print("*");
				else System.out.print(" ");
				j++;
			}
			System.out.println();
			i++;
		}
		System.out.println("au revoir!");
	}
}
