 import javax.swing.*;
 import java.awt.event.*;

 class Button extends JFrame
 {
    JTextField t;
    JButton b;
    public Button()
    {
        setSize(400,300);
        t=new JTextField();
        t.setBounds(200,100,50,30);
        b= new JButton("click");
        b.setBounds(200,150,50,30);
        setLayout(null);
        setVisible(true);
        add(t);
        add(b);
        Controller c=new Controller(this);
        b.addActionListener(c);
    }
}
    class Controller implements ActionListener
    { 
        Button B1;
        public Controller(Button B1)
        {
            this.B1=B1;

     }
     public void actionPerformed(ActionEvent e)
     {
        this.B1.t.setText("clicked");
     }
 
}
class Check{

 public static void main(String[]args)
 {
     new Button();
 }
}