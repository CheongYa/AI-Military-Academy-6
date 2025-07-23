package stage04.control.et02;

public class SwitchEtude03 {
	public static void main(String[] args) {
		int n=6;
		
		switch (n) {
		case 1,3,5->System.out.println("남자");
		case 2,4,6->System.out.println("여자"); 
		default   ->System.out.println("에러"); 
		}
		System.out.println("au revoir!");
	}
}
