package class2_assingments;


class ShoppingPortal{
	//1st method
	public void makePayement(String userName, String password) {
		System.out.println("Making payement through inetrnet banking");
	}
	public void makePayement(long mobileNumber, int password) {
		System.out.println("Making payement through mobile app");
			
		}
	public void makePayement(long creditCard,int cvv, String name,String ExpiryDate) {
		System.out.println("Making payement through credit or debit card");
		
	}
}
public class MethodOverloading_test {

	public static void main(String[] args) {
		ShoppingPortal sp = new ShoppingPortal();
		sp.makePayement("ABC", "123");
		sp.makePayement(8675, 123);
		sp.makePayement(3456,345,"bank","123");

	}

}
