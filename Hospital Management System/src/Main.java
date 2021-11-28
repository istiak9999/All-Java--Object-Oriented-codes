import java.util.Scanner;

public class Main extends Hospital {
Scanner sc =new Scanner(System.in);
	public static void main(String[] args) {
	
		Hospital hosptal1= new Hospital();
		hosptal1.IncreaseBed();

		Patient pat_1= new Patient();
			pat_1.setPatient_name();
			pat_1.setPatient_age();
			pat_1.setDoctor_name();
			pat_1.setNurse_name();
			hosptal1.DecreaseBed();
			System.out.println(pat_1.toString());
			Patient pat_2=new Patient();
			pat_2.setPatient_name();
			pat_2.setPatient_age();
	
			pat_2.setDoctor_name();
			pat_2.setNurse_name();
			hosptal1.DecreaseBed();
			System.out.println(pat_2.toString());
			
			System.out.println("Remaining beds:"+getTotal_bed());
			
		
		
	}

}
