class Student
{
	 string name;
	 int age;
	 float marks;
 
public void getInfo( string n,int a,float m)
	{
	this.name=n;
	this.age=a;
	this.marks=m;
	}
public void showinfo()
	{
	system.out.println("name:"+name+"age:"+age+"marks:"+marks);
	}


public static void main(String[]args)
	{
	Student s= new Student("apsara",19,50);
	s.getInfo();
	s.showinfo();
}
}




