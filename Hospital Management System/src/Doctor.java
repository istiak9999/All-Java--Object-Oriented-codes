import java.util.Scanner;

public class Doctor {
	public String doctor_name;
	public String doctor_degree;
	public int doctor_code_no;
Scanner sc = new Scanner(System.in);

	public String getDoctor_name() {
		return doctor_name;
	}
	public void setDoctor_name() {
		System.out.println("Enter The Name Of Assigned Doctor:");
		doctor_name=sc.nextLine();
	}
	public String getDoctor_degree() {
		return doctor_degree;
	}
	public void setDoctor_degree(String doctor_degree) {
		this.doctor_degree = doctor_degree;
	}


}
