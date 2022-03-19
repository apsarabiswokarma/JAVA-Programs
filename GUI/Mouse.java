import java.awt.*;
import java.awt.event.*;

class Mouse extends Frame implements MouseListener,MouseMotionListener
{
TextField t1,t2;

public Mouse()
{
    setSize(400,500);
    t1=new TextField();
    t1.setBounds(200,50,40,40);
     t2=new TextField();
    t2.setBounds(200,100,40,40);
    add(t1);
    add(t2);
    setVisible(true);
    setLayout(null);
   // t1.setEditable(false);
  //  t2.setEditable(false);
    addMouseListener(this);
    addMouseMotionListener(this);

    
}
public void mouseEntered(MouseEvent e)
{
 t1.setText("IN");
}
public void mouseExited(MouseEvent e)
{
    t1.setText("OUT");
}
public void mouseMoved(MouseEvent e)
{
    string m="X:"+e.getX()+"Y:"+e.getY();
    t2.setText(m);
}
public void mouseReleased(MouseEvent e)
{
    

    
}
public void mouseDragged(MouseEvent e)
{
    
}
public void mousePressed(MouseEvent e)
{
    
}
public void mouseClicked (MouseEvent e)
{
    
}
public static void main(String[]args)
{
    new Mouse();

}
}
