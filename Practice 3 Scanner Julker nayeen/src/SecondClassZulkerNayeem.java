import java.util.Scanner;



public class SecondClassZulkerNayeem {
	static Scanner myScanner =new Scanner (System.in);
	public static void main(String[] args) {

		int  first,second;
		first=10;
		second=20;
		second=second+2;
		int result=first%3;
		float ek=15 ;
		double dui=3.5;
		char lekha='A';
		boolean statement=4<3;
		boolean stateMent=4!=3; //boolean statement
		second/=2;
	second++;
		second--;
		char[] bomb= {'s','w'};
		System.out.println(bomb[1]);
		/* shakalakboomboom */
		int[] array=new int[10];
		int[] arraytwo= {1,2,3,7};
		System.out.println(array);
		System.out.println(arraytwo[3]);


		System.out.println("first= "+first+" Second = "+second+"Result=  "+result+lekha +statement+stateMent);
	System.out.println("please enter a number:");
	first=myScanner.nextInt();
	
		int resultnew=pokriya(first);
		System.out.println(resultnew);
	}
public static int pokriya(int firstValue) {
	firstValue*=25;
	return firstValue;
	
	
}
	
	
	

}
