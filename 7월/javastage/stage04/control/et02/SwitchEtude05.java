package stage04.control.et02;

import java.util.Scanner;

public class SwitchEtude05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("score : ");
		int score = sc.nextInt();
		
		switch (score/10) {
		case 9,10->System.out.println("A");
		case    8->System.out.println("B");	
		case    7->System.out.println("C");	
		case    6->System.out.println("D");	
		default  ->System.out.println("F");		
		}
		System.out.println("au revoir!");
	}
}
