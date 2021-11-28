import java.util.Scanner;

public abstract class Player implements InterfaceDemo {
private String name;
private String contact;
private String telephone;
private int runs,matches;


private String status ;

Scanner sc =new Scanner(System.in);
public void getinfo()
{
runs =sc.nextInt() ;
matches=sc.nextInt();


}


		

 public void calculate()
 {
	 System.out.println(runs/matches+"/n");
	 
	 
 }

}
