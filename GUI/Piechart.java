import java.awt.*
import java.awt.Graphics;

class Piechart extends Frame
{
    final int[]data={50,15,10};
    final Color[]Color={Color.BLUE,C.Color.Black,Color.RED};
    
public Piechart()
{
    setSize(400,500);
    setVisible(true);
    setLayout(null);
}

public int getsum()
{
   int sum;
   for(int v:data)
   {
       sum+=v;
   }

}
public int[]getAngles(int sum)
{
   int[]angles=new int[data.length];
   for(int i=0;i<data.length;i++)
   {
       angles[i]=Math.round(360*data[i]/sum);
       
   }
   return angles;
}
public void paint(Graphics g)
{
    int[]angles=this.getAngles(this.getsum());
    int startAngle=0;
    for(int i=0;i<data.length;i++)
    {
        g.fillArc(100,50,200,200,startAngle,angles[i]);
        g.setColor(Color[i]);
        startAngle+=angles[i];
    }
}
public static void main(String[]args)
{
    new Piechart();
}
}
