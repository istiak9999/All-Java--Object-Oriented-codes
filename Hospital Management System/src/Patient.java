import java.util.Scanner;

public class Patient extends Nurse {

Scanner sc=new Scanner(System.in);
	private String patient_name;
	private int patient_age;
	private int patient_bed_no;
void Patinet(int patient_bed_no)
{
	
}
	public String getPatient_name() {
		return patient_name;
	}
	public void setPatient_name() {
		System.out.println("Enter The name of the patient:");
	patient_name=	sc.nextLine();
	
	}
	public int getPatient_age() {
		return patient_age;
	}
	public void setPatient_age() {
		System.out.println("Enter Patient Age:");
		patient_age=sc.nextInt();
	}
	public int getPatient_bed_no() {
		return patient_bed_no;
	}
	public void setPatient_bed_no(int patient_bed_no) {
		this.patient_bed_no = patient_bed_no;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "The patient "+getPatient_name()+" whos age is "+getPatient_age()+" and assigned to Doctor "+getDoctor_name()+" and Nurse "+getNurse_name()+".";
	}


}
