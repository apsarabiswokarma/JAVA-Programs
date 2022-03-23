import java.awt.*;
import java.awt.event.*;

class Test implements ActionListener 
{
Frame f;
Button plus,minus;
Textfield t1,t2,t3;
public Test()
{
    f=new Frame();
    f.setFrame(400,500);
   t1=new Textfield();
   t1.setBounds(100,100,50,30);
   t2=new Textfield();
   t2.setBounds(100,150,50,30);
   t3=new Textfield();
   t3.setBounds(100,130,50,30);
   plus=new Button("ADD");
   plus.setBounds(70,200,20,20);
   minus=new Button("SUBTRACT");
   minus.setBounds(200,200,20,20);
  f.add(t1);
  f.add(t2);
  f.add(t3);
  f.add(plus);
  f.add(minus);
  t3.setEditable(false);
  f.setLayout(null);
  f.setVisible(true);
  plus.addActionListener(this);
  minus.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
    int num1=Integer.parseInt(t1.getText());
    int num2=Integer.parseInt(t2.getText());
    if(e.getSource()==plus)
    {
        t3.setText(num1+num2);
        }
    else{
int sub=num1-num2;
t3.setText(""+sub);
 }
}
public static void main(String[]args)
{
    new Test();
}


}