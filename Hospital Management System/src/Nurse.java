import java.util.Scanner;

public class Nurse extends Doctor{
	
	public String nurse_name;
	public int assigned_patient;
Scanner sc = new Scanner(System.in);
	public String getNurse_name() {
		return nurse_name;
	}

	public void setNurse_name() {
		System.out.println("Enter The name of assigned Nurse:");
		nurse_name=sc.nextLine();
	}



	
}
