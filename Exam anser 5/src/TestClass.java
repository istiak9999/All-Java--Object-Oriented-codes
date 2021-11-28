public class Testing {
  public static void main(String[] args) {
    Testing tc = new Testing();
    tc.display(); //object create here because display is a non-static method
  }
  public  display(){
    System.out.println("Call from non-static method");
  }
}
