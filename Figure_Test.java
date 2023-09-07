package class2_assingments;

public class Figure_Test {

	public static void main(String[] args) {
		Figure f;
		f = new Rectangle(5,6);
		System.out.println("Rectangle area: " +f.area());
		f = new Triangle(36,12);
		System.out.println("Triangle area: " +f.area());

	}

}
