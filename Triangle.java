package class2_assingments;

public class Triangle extends Figure{
	public Triangle(double a,double b) {
		//calling the constructor of Parent class
		super(a,b);
		
	}
	
	
	double area() {
		System.out.println("Inside area trianle");
		return dim1*dim2/2;
	}

}
