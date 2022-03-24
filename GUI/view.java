import javaX.swing.*;
import java.awt.*;
import java.awt.event.*;

class view extends JFrame{
	JButton b
	JTextfield t
	public view(){
		setSize(500,400);
		t=new JTextField("click");
		b=new JButton("add");
		add(t);
		add(b);
		setLayout(new FlowLayout());
		setVisible(true);
          Controller c=new Controller(this);
	  b.addActionListener(c);
	t.setEditable(false);
}
		
	}


class Controller implements ActionListener{
	view v;
public Controller(view v)
{
this.v=v;
}
public void actionPerformed(ActionEvent e){
this.v.t.setText("button Clicked");
this.v.t.setBackground(color.BLUE);
this.v.t.setFont(new Font("Arial",font,BOLD,20));
}
public static void main(String[]args){
new view();
}
}










