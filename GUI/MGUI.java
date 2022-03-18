import java.awt.event.*;
import java.awt.*; 

class Example  extends Frame implements ActionListener 
{
Button plus,minus;
TextField t1,t2,t3;
public Example()
{
    setFrame(400,500);
   t1=new TextField();
   t1.setBounds(100,100,50,30);
   t2=new TextField();
   t2.setBounds(100,150,50,30);
   t3=new TextField();
   t3.setBounds(100,130,50,30);
   plus=new Button("ADD");
   plus.setBounds(70,200,20,20);
   minus=new Button("SUBTRACT");
   minus.setBounds(200,200,20,20);
  add(t1);
 add(t2);
  add(t3);
  add(plus);
  add(minus);
  t3.setEditable(false);
  setLayout(null);
  setVisible(true);
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
}


class MGUI
{
    public static void main(String[]args)
{
    new Example();
}


}