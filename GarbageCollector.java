package class2_assingments;

public class GarbageCollector {
	int objId;
	
	public GarbageCollector(int objId) {
		this.objId = objId;
		System.out.println("Created: " +this.objId);
	}

	public static void main(String[] args) {
		for(int i = 0 ;i<=10; i++) {
			new GarbageCollector(i);
		}
		

	}
	
	protected void finalize() throws Throwable{
		System.out.println("Finalized : " +objId);
	}

}
