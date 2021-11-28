
public class main {

	public static void main(String[] args) {
System.out.println("Hello neo");

Circle c1=new Circle();
Circle c2= new Circle(3.0);
Circle c3 =new Circle();
c3.setRadious(5);
System.out.println("The circle has radious "+c1.getRadious()+"and area "+c1.getArea()+"and color "+c1.getColor());

System.out.println("The circle has radious "+c2.getRadious()+"and area "+c2.getArea()+"and color "+c2.getColor());
System.out.println("The circle has radious "+c3.getRadious()+"and area "+c3.getArea()+"and color "+c3.getColor());
System.out.println(c3.toString());
	
	
	}

}
