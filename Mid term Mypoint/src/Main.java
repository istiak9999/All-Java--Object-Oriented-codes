
public class Main {

	public static void main(String[] args) {

		MyPoint obj1= new MyPoint();
		System.out.println(obj1.toString());
		MyPoint obj2=new MyPoint(5,8);

		obj2.setX(10);
		System.out.println("x"+obj2.getX()+"y"+obj2.getY());

		System.out.println(obj2.distance(12, 5)+obj2.toString());
	}

}
