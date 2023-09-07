package class2_assingments;


class TestInheritannce {
	int grandFatherage;
	
	//parametrized constructor 
	public TestInheritannce(int grandFatherage) {
		this.grandFatherage = grandFatherage;
	};
	
	//a method to show grandfather age
	public void showGrandFatherage() {
		System.out.println("GrandFatherage is : " +this.grandFatherage);
	}
	

}
//father class
class Father extends TestInheritannce{
	 int fatherage;

	public Father(int fatherage) {
		super(fatherage+30);
		this.fatherage = fatherage;
		
	}
	
	//a method to show 
	public void showFather() {
		showGrandFatherage();
		System.out.println("Father's age is:" +this.fatherage);
	}
	 
}

//son class
 class Son extends Father{
	 int sonage;
	 //son constructor
		public Son(int sonage) {
			super(sonage+30);
			this.sonage = sonage;
			
		}
		//method to show
		public void show() {
			showFather();
			System.out.println("Son's age is:" +this.sonage);
		}
		
	 
}

//test method
public class Parentclass{
	 public static void main(String[] args) {
		Son son = new Son(20);
		son.show();
	}
}


