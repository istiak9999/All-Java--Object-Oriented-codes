import java.security.PublicKey;
import java.util.Scanner;



public class TsetClass3 extends TestClass2{
	public  void cola1()
	{
		System.out.println("TestClass3 function 1");
	}
	 public void cola2()
	 {
			System.out.println("TestClass3 function 2");
	 }
	 public  void cola3()
	 {
	 	System.out.println("TestClass3 function 3");
	 }
	  public  void cola4()
	  {
	 		System.out.println("TestClass3 function 4");
	  }
	  public    void  cola5()
	  {
	  	System.out.println("TestClass3 function 5");
	  }
	    public static void  add (int d,int e)
	    {
	    	System.out.println("Total=" +(d+e));
	    }
	    public static void  minus (int d,int e)
	    {
	    	System.out.println("Total=" +(d-e));
	    }

	public static void main(String[] args) {
		TestClass1 OT1= new TestClass1();
		OT1.fanta1();
		OT1.fanta2();
		OT1.fanta3();
		TestClass2 OT2= new TestClass2();
		OT2.fanta4();
		OT2.malta2();
       TsetClass3 OT3 = new TsetClass3();
       OT3.cola1();
       OT3.malta5();
       OT3.fanta5();
       OT3.fanta4();
       int a,c;
       
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a string line :");
       String line=sc.nextLine();
       System.out.println("Enter Two variables:");
       a=sc.nextInt();
    c= sc.nextInt();
 add(a,c);
 minus(a,c);

  
	}
   
      
	

}
