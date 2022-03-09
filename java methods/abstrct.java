abstract class Button
 {
  abstract int add();

  abstract int sub();
}

class Addition extends Button
 {
  int a, b;

  public Addition(int a, int b)
   {
    this.a = a;
    this.b = b;
  }
  public int add()
  {
  	return a+b;
  }

  abstract void subtraction();
}

class Subtraction extends Button 
{
  int a, b;

  public Subtraction(int a, int b)
   {
    this.a = a;
    this.b = b;
  }
   public int sub()
  {
  	return a-b;
  }

  abstract void addition();
}

public class Test
{
  public static void main(String[] args) 
  {
    Addition obj = new Addition(20,10);
    System.out.println("Addition is= " + obj.add());
    Subtraction s = new Subtraction(20, 10);
    System.out.println("Subtraction = " + s.sub());
  }
}

