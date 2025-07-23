package stage08.oop.et07;
class Important {
	public void workImportant() {
		System.out.println("너무 중요한 메서드 실행");
	}
}
public class ThreadEtude extends Important implements Runnable {
	public static void main(String[] args) {
		Runnable t = new ThreadEtude();
		Thread t2 = new Thread(t);
		t2.start();
		Important imp = new ThreadEtude();
		
		for(int i=1; i<= 5; i++) {
			imp.workImportant();
			System.out.println("main : " + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("main : au revoir!");
	}

	public void run() {
		for(int i=1; i<= 5; i++) {
			System.out.println("run : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("run : au revoir!");
	}
}
