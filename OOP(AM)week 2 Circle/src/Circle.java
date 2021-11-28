
public class Circle {
	private double radious;
	private String color;
	public Circle(){
		radious = 1.0;
		color = "red";
		
	}
	public Circle(double radious) {
		this.radious=radious;
		
	}
	public double getRadious() {
		return radious;
	}
	public double getArea() {
		return radious*radious*Math.PI;
	}
	public String getColor() {
		
		return color;
	}

public void setRadious(double radious){
	
	this.radious=radious;
}
public String toString()
{
	double area=getArea();
return "The circle has radious "+radious+"and color "+color+"and area"+area;
	

}


}