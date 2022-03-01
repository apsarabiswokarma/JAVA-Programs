class Employee
{
	string name;
	int id;
	float monSal;
	
	public Employee(string name,int id,float monSal)
	{
	this.name=name;
	this.id=id;
	this.monSal=monSal;	
	}
	public float getYearly()
	{
		return this.monSal*12;
		
	}
	public String toString()
	 {
    String info= "name = " + this.name + " id = " + this.id + " monthsalary = " + monSal + " yearlySalary = " + yearlySalary();
    return info;
  }
}

class Manager extends Employee {
  String depar;
 float all;

  public Manager(String name, int id, float monSal, String depar,float all) {
    super(name, id, monSal);
    this.depar=depar;
    this.all= all;
  }

  public float yearlySalary() {
  	all=10000;
   int withall=super.yearlySalary() + all;
  }
  public String toString() 
  {
  String info= " Department = " + this.depar+ "withallowence="+withall;
  return info;
  
  }
}

public class Test  {
  public static void main(String[] args) 
  {
  	
  	Employee e=new Employee("Nischal",1917999,35000)
  	e.yearlySalary();
  	System.out.println(e);
  	Manager m=new Manager("Mangal",1917999,45000,"computer")
  	m.yearlySalary();
  	System.out.println(m);
  }
}
	 
	
	

