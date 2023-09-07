package class2_assingments;
//interface A
interface A {
	default void foo() {
		System.out.println("A's foo");
	}
}

interface B extends A {
	default void foo() {
		System.out.println("B's foo");
	}
}

interface C extends A{
	default void foo () {
		System.out.println("C's foo");
	}
}

class D implements B,C{
	public void foo() {
		B.super.foo();
		C.super.foo();
	}
	
}

public class Test_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D d = new D();
		d.foo();

	}

}
