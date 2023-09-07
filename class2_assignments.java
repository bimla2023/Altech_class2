package class2_assingments;
import java.util.Scanner;

public class class2_assignments {

	//program to accept five employee id , name and there salary
	
	public class question1_statement1 {
		
		
		//Method with parameters to call from main method to pass arguments.
			public static void display(int []id, String name[], double[] salary) {
				
			Scanner sc = new Scanner(System.in);
			id = new int[5];
			name = new String[5];
			salary = new double[5];
			 for(int i = 0; i<5 ; i++) {
				 id[i] = sc.nextInt();
				 name [i] = sc.next();
				 salary [i] = sc.nextInt();
				 
			}
			
			System.out.println("ID\tName\tSalary\t" );
			for (int j = 0; j<5 ; j++) {
				
				System.out.println(id[j]+"\t"  +name[j]+"\t" +salary[j]+"\t");
				
			}
			
			
			
		}


			//Method overloading with different parameters.
				public static void display(int []empl, String name[]) {
					
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter 5 Emplyoee Id and name ");
					
				empl = new int[5];
				name = new String[5];
				
				for(int i = 0; i<5 ; i++) {
					empl [i] = sc.nextInt();
					name [i] = sc.next();
					
					
					
			}
				System.out.println("ID\tName\t" );
				for (int j = 0; j<5 ; j++) {
					
					System.out.println(empl[j]+"\t"  +name[j]+"\t");
					
				}
				
			}
				
			public static boolean display (String name, int regno[], String[] Empname, double salary[]) {
				try (Scanner sc = new Scanner(System.in)) {
					
					regno = new int[5];
					Empname = new String [5];
					salary = new double [5];
					
				}
				boolean test = true;
			
				
				for (int i = 0; i < 5; i++) {
					System.out.println(Empname[i]);
					if (Empname[i] == name) {
						
						test = true;
					}
					else {
						System.out.println("Name not found");
						test = false;
					}
				}
				return test;
			}
	
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] id_main = new int[5];
		String name_main[] = new String[5];
		
		double[] salary_main = new double[5];
		
		System.out.println("Enter the 5 id , 5 name and thier salary:: ");
		
		
		 	display(id_main,name_main,salary_main);
		 	display(id_main,name_main);
		 	
		 
			
			System.out.println("Enter the name to find in the array");
			String Empname_search = sc.next();
			
			display (Empname_search,id_main ,name_main, salary_main);
		   
		

	}


	

	}
}
