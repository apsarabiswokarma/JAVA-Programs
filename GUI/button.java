import javaX.swing.*;
import java.awt.*;
import java.awt.event.*;

class view extends JFrame implements ActionListener{
	JButton b;
	JTextfield t;
	public view(){
		setSize(500,400);
		t=new JTextField();
		b=new JButton("click");
		add(t);
		add(b);
		setLayout(new FlowLayout());
		setVisible(true);
         t.setEditable(false);
	b.addActionListener(this);
		
	}
public void actionPerformed(ActionEvent e){
	t.setText("buttonClicked");
}
public static void main(String[]args){
new View();
}
}