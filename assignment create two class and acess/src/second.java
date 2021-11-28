import com.sun.org.apache.xpath.internal.operations.Minus;
import com.sun.org.apache.xpath.internal.operations.Plus;

import jdk.jfr.internal.PrivateAccess;

public class second {
	public static void main(String[] args) {
		int x=10,y=20;
		Plus();
		Minus();
	}

	public void plus() {
		System.out.println("Plus= "+(x+y));
	}
	public void minus( ) {
		System.out.println("Minus "+(x-y));
		
	}

	}
public class Student {
	int roll ;
	int marks ;
	Student(int roll,int marks)
	{
		roll= r ;
		marks =m ;
	}
	
	void displayinformation()
	{
		System.out.println("Roll"+roll+"\n"+"Marks"+marks);
		
	}
	
}
public class Test
{
public static void main(String[] args) {
	Student student1=new Student(5,10);
	student1.displayinformation();
	
}
	
}