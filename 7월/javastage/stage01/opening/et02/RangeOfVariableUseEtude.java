package stage01.opening.et02;

import java.util.Scanner;
import java.lang.String;

public class RangeOfVariableUseEtude {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "";
		
		int value1 = 3;
		{
			int value2 = 5;
			System.out.println(value1);
			System.out.println(value2);
		}
		System.out.println(value1);
		//System.out.println(value2);
		
		System.out.printf("%c\n", 65);
		char c = 66;
		System.out.println(c);
	}
}
