import java.awt;
import java.awt.event;

class GUI extends Frame implements ActionListener
{
 Button b;
 TextField t1,t2;
 public GUI()
 {
     setSize(400,500);
     t1= new TextField();
     t1.setBounds(100,100,100,100);
     t2=new TextField();
    t2.setBounds(100,150,100,100);
    b=new Button("click");
     b.setBounds(100,200,50,50);
     add(t1);
     add(t2);
     add(b);
     t1.setEditable(false);
     t2.setEditable(false);
     setLayout(true);
     setVisible(true);
     b.addActionListener(this);
 }
 public void actionPerformed(ActionEvent e)
 {
     int num=Integer.parseInt(t1.getText());
if(num%2==0)
{
    t2.setText("even");
}
else{
    t2.setText("odd");
}
}
public static void main(String[]args)
{
 new GUI();
}
}