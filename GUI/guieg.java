import javax.swing.;
import java.awt.event.;

class GUI extends JFrame
 {
 	JTextField t1,t2;
 	 JButton b;
  public GUI() 
  {
    setSize(400, 500);
    t1 = new JTextField();
    t2 = new JTextField();
    b = new JButton("Submit");

    t1.setBounds(200, 100, 150, 120);
    t2.setBounds(200, 150, 150, 120);
    b.setBounds(100, 200, 100, 100);
    add(t1);
    add(t2);
    add(b);
    setVisible(true);
    setLayout(null);
   Action c= new Action(this);

    b.addActionListener(c);
  }
}

class Action implements ActionListener 
{
GUI t3,t4;
  public Action(GUI t3, GUI t4)
   {
    this.t3 = t1;
    this.t4 = t2;
  }

  public void actionPerformed(ActionEvent e) 
  {
  	system.out.println("enter the statement");
  	string t1=t1.nextLine();
  	system.out.println("enter the statement");
  	string t2=t2.nextLine();
    int length = t1.getText().length();
    t2.setText("lenght of string=" + length);
    int length = t2.getText().length();
    t1.setText("length of string=" + length);
  }
}

public class Test {
  public static void main(String[] args) 
  {
    new GUI();
  }
}
