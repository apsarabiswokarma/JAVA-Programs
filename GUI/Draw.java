import java.awt.*;
//import java.applet.*;

 class Draw extends Frame{
    public Draw {
        setSize(400,300);
        setVisible(true);
    }
    public void Paint(Graphics g)
    {
        g.fillRect(20,20,10,15);
        g.setColor(Color.BLUE);
        g.fillOval(50,20,10,10);
        g.setColor(Color.RED);
    }
    public static void main(String[]args)
    {
        new Draw();
    }
}