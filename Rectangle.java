package class2_assingments;

public class Rectangle extends Figure {
	public Rectangle(double a, double b) {
		//calling the constructor of Parent class
		super(a,b);
	}
	
	//need to implement abstract method of super class
	double area() {
		System.out.println("Inside area reactangle");
		return dim1*dim2;
		
	}
	

}
