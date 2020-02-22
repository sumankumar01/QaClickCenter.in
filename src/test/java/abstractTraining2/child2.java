package abstractTraining2;

public class child2 extends AbstractClass2{


	void m1() {
		System.out.println("i am from AbstractClass2 to m1");
		
	}
	void m2() {
	System.out.println("i am from AbstractClass2 to m2");
		
	}
	String m3() {
		System.out.println("i am from child class method...........");
		return null;
		
	}
	
	public static void main(String args[]) {
		child2 c=new child2();
		c.m1();
		c.m2();
		c.m3();
		
	}

}
