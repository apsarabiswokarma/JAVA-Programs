import javaX.swing.*;
import javaX.awt.*;
import java.awt.event.*;

class Event extends JFrame implements MouseListener,MouseMotionListener{
	JTextField t1,t2;
	public Event(){
		setSize(500,400);
		t1=new JTextField();
		t2=new JTextField();
		add(t1);
		add(t2);
		setLayout(new FlowLayout());
		setVisible(true);
	addMouseMotionListener(this);
	addMouseListener(this);
		
	}
	public void mouseEntered(MouseEvent e){
	t1.setText("IN");
	}
	public void mouseExited(MouseEvent e){
	t1.setText("OUT");
	}
	public void mouseMoved(MouseEvent e)
	{
	String m="X:"+e.getX()+"Y:"+e.getY();
	t2.setText(m);
		}
public void mousePressed(MouseEvent e){
	
	}
public void mouseReleased(MouseEvent e){
	
	}
public void mouseClicked(MouseEvent e){
	
	}
public void mouseDragged(MouseEvent e){

	}

public static void main(String[]args){
  new Event();
	}
	}





