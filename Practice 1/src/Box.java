
public class Box {
int height;
int width;
int depth;
public void setData(int height,int width,int depth)
{
	this.depth=depth;
	this.height=height;
	this.width=depth ;
}
	 public void printBox()
	 {
		 	 System.out.println("height="+ height +",width= "+width+",depth= "+depth+",volume="+volume());
	 }
	


public int volume()
{

	return height*width*depth;
	
}
}