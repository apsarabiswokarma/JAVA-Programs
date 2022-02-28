  class Shape 
 {
    int xcor;
    int ycor;
    int width;
    int height;

    public Shape(int xcor,int ycor,int w,int h)
	{
        this.xcor = xcor;
        this.ycor= ycor;
        this.width = w;
        this.height = h;
    }
    public Shape(int width,int height)
	{

        this(0,0,width,height);
    }
	public Shape()
	{
        this(0,0,1,1);
	}
    void show()
	{
        System.out.println("Xcoordinate:"+xcor);
        System.out.println("Ycoordinate:"+ycor);
        System.out.println("Width:"+width);
        System.out.println("Height:"+height);
    }

    public static void main(String[] args) 
	{
        Shape s = new Shape(5,7);
	Shape s2=new Shape(2,3,4,5);
        s.show();
	s2.show();
    }
} 