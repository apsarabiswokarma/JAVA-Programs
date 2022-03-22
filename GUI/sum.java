import javaX.swing.*;
import java.awt.*;
import java.awt.event.*;

class Number extends JFrame implements ActionListener{
	JButton plus,minus;
	public void show(){
		setSize(500,400);
		t1=new JTextField("num1");
		t2=new JTextField("num2");
		t3=new JTextField("num3");
		plus=new JButton("ADD");
		minus=new JButton("sub");
		add(t1);
		add(t2);
		add(t3);
		add(plus);
		add(minus);
		setLayout(new FlowLayout()
		setVisible(true);
	plus.addActionListener(this);
	minus.addActionListener(this)
		
	}
public void actionPerformed(ActionEvent e){
int  num1= Integer.parseInt(t1.getText());
int  num2= Integer.parseInt(t2.getText());
if(e.getSource()==plus)
{
int sum=num1+num2;
t3.setText(""+sum);
}
else
{
int sub=num1-num2;
t3.setText(""+sub);
}
}
public static void main(String[]args){
 Number n =new Number();
n.show();
}
}
























