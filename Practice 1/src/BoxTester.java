
public class BoxTester {

	public static void main(String[] args) {
//int [] width= {10,7,2,4,5};
//int[] height = {5,7,2,4,9};
//int[] depth =  {2,4,1,3,5};
//for(int i=0;i<width.length;i++)
//{
//	System.out.println("Box-"+(i+1)+" Height="+height[i]+" Width="+width[i]+" Depth= "+depth[i]);
//}
  Box box= new Box();
box.setData(10, 22, 24);
box.printBox();
    Box box2=new Box();
box2.setData(21,45,33);
box2.printBox();
 //System.out.println(box.depth +","+box.height+","+box.width+".");
 //System.out.println(box2.depth +","+box2.height+","+box2.width+".");

    Box[]boxes= new Box[2];
    boxes[0]=box;
    boxes[1]=box2;
	}

//	private static int volume(int width, int height, int depth) {

	//	return width*height*depth;
	//}



}
