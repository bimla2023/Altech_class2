package class2_assingments;

public class EngineeringBook_Test {

	public static void main(String[] args) {
		EngineeringBook engbook = new EngineeringBook();
		engbook.setBookNo(1);
		engbook.setAuthor("ABC");
		engbook.setCategory("Java training");
		engbook.setPrice(200);
		engbook.setTitle("Java");
		
		System.out.println("BookNo" +engbook.getBookNo());
		System.out.println("Author" +engbook.getAuthor());
		System.out.println("Category" +engbook.getCategory());
		System.out.println("Price" +engbook.getBookNo());
		System.out.println("Title" +engbook.getBookNo());
		

	}

}
