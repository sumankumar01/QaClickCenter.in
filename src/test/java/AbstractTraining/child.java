package AbstractTraining;


 public  class child extends AbstractClass   /// Normal class extending abstract class
	{
		  void print1()  /// body of abstract method
		  { 
			  System.out.println("I am not a print1 method");  
		  }
		 void print2()
			 {
				 
				 System.out.println("I am not a print2 method");
			 }
		void print3()
			 {
				 System.out.println("I am not a print3 method");
			 }
			
	   void print5() /// child own's method
			 {
				 System.out.println("I am not a print5 method");
			 }
		 
		 public static void main(String[] args)
		 {
			 
			 AbstractClass abst=new child();   /// Assigning the child object to parent reference variable
			 
			 abst.print1();
			 
			 abst.print2();
			 
			 abst.print3();
			 
			 abst.print4();
			 
			//abst.print5();
			
			
			child ch=new child(); /// Abstract method accessing using child class objects
			
			ch.print1();
			 
			ch.print2();
			 
			ch.print3();
			 
			ch.print4();
			 
			ch.print5();
			
			 
		 }
		 
	}
