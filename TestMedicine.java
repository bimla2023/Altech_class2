package class2_assingments;

public class TestMedicine {

	public static void main(String[] args) {
		Medicine[] medicineArray = new Medicine[10];
		int randomNum = (int) ((Math.random() * 4) + 1);
		for (int i = 1; i<10;i++) {
			if(randomNum == 1) {
				medicineArray[i] = new Tablet();
				medicineArray[i].displayLabel("company1", "Address1");
				
			}
			if(randomNum == 2) {
				medicineArray[i] = new Syrup();
				medicineArray[i].displayLabel("company2", "Address2");
				
			}
			if(randomNum == 3) {
				medicineArray[i] = new Ointment();
				medicineArray[i].displayLabel("company3", "Address3");
				
			}
			
		}
		
		
	}

}
