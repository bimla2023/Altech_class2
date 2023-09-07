package class2_assingments;
//method overriding
class Parent{
	public void buildingConstruction() {
		System.out.println("With the help of labour!!!");
	}
	
}

class Child extends Parent{
	//method overriding
	public void buildingConstruction() {
		System.out.println("With the help of Machines!!!");
	}
	
}
public class OverridingDemo {

	public static void main(String[] args) {
		Parent p = new Child(); //casting 
		p.buildingConstruction();

	}

}
