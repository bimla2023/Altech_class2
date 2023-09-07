package class2_assingments;
import java.util.Random;

public class TestCompartment {

	public static void main(String[] args) {
		Compartment[] compArray = new Compartment[10];
		
		for(int i = 0 ; i<10; i++) {
			int randnum = (int) ((Math.random() * 4) + 1);
			System.out.println(randnum);
			if(randnum == 1) {
				compArray[i] = new FirstClass();
				
			}
			if(randnum == 2) {
				compArray[i] = new Ladies();
				
			}
			if(randnum == 3) {
				compArray[i] = new General();
				
			}
			if(randnum == 4) {
				compArray[i] = new Luggage();
				
			}
			
		}
		
		for(int i= 0;i<10;i++) {
			compArray[i].notice();
		}
		
		  
	}

}
