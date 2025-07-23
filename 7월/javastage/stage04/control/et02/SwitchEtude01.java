package stage04.control.et02;

public class SwitchEtude01 {
	public static void main(String[] args) {
		int n=6;
		
		switch (n) {
		case 1:
		case 3:
		case 5:
			System.out.println("남자"); 
			break;
		case 2:
		case 4:
		case 6: 
			System.out.println("여자"); 
			break;
		default: 
			System.out.println("에러"); 
			break;
		}
		System.out.println("au revoir!");
	}
}
