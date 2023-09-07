package class2_assingments;

abstract public class Figure {
	double dim1;
	double dim2;
	
	//parametriezid constructor
	Figure(double a ,double b){
		dim1 = a;
		dim2 = b;
	}
	
	//abstract method must implement by child class
	abstract double area();

}
