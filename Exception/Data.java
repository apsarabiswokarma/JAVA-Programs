class DataEx
	{
	String name;
	float gpa;
	public DataEx(String name,float gpa)throws InvalidgpaException
	{
	if(gpa>4.0||gpa<0.0)
	{
	throw new InvalidgpaException("INVALID!!!");
	}
	else
	{
	this.name=name;
	this.gpa=gpa;
	}
}
class InvalidgpaException extends Exception
	{
	public InvalidgpaException(String msg)
	{
 super(msg);
	}
}


	/*public String toString()
	{
	String info="name:"+name+"gpa:"+gpa;
	 return info;
	}*/
}
class Data
{
	public static void main(String[]args)
	{
try{

	DataEx D = new DataEx("apsara",-2.2);
}
catch(InvalidgpaException e)
{
System.out.println(e.getMessage());
}
}
        
																																						}



