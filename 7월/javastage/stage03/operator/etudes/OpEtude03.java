package stage03.operator.etudes;

public class OpEtude03 {
	public static void main(String[] args) {
        boolean b1, b2;

        b1 = true; b2 = true;
        System.out.println("b1 = " + b1 + ", b2 = " + b2);
        System.out.println("b1 && b2 = " + (b1 && b2));
        System.out.println("b1 || b2 = " + (b1 || b2));
        System.out.println("!b1 = " + (!b1));
        System.out.println("!b2 = " + (!b2));
        System.out.println("------------------------");

        b1 = true; b2 = false;
        System.out.println("b1 = " + b1 + ", b2 = " + b2);
        System.out.println("b1 && b2 = " + (b1 && b2));
        System.out.println("b1 || b2 = " + (b1 || b2));
        System.out.println("!b1 = " + (!b1));
        System.out.println("!b2 = " + (!b2));
        System.out.println("------------------------");

        b1 = false; b2 = true;
        System.out.println("b1 = " + b1 + ", b2 = " + b2);
        System.out.println("b1 && b2 = " + (b1 && b2));
        System.out.println("b1 || b2 = " + (b1 || b2));
        System.out.println("!b1 = " + (!b1));
        System.out.println("!b2 = " + (!b2));
        System.out.println("------------------------");

        b1 = false; b2 = false;
        System.out.println("b1 = " + b1 + ", b2 = " + b2);
        System.out.println("b1 && b2 = " + (b1 && b2));
        System.out.println("b1 || b2 = " + (b1 || b2));
        System.out.println("!b1 = " + (!b1));
        System.out.println("!b2 = " + (!b2));
		
		System.out.println("au revoir!");
	}
}
