package AbstractTraining;


 public  class child extends AbstractClass
	{
		  void print1()
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
			
	   void print5()
			 {
				 System.out.println("I am not a print5 method");
			 }
		 
		 public static void main(String[] args)
		 {
			 
			 child abst=new child();
			 
			 abst.print1();
			 
			 abst.print2();
			 
			 abst.print3();
			 
			 abst.print4();
			 
			abst.print5();
			 
		 }
		 
	}
