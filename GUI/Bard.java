import java.awt.*;

class Bard extends Frame{
     final int[]data={10,20,15};
     final int Barw=20;
     final int fheight=400;
     final int fwidth=500;
     final Color[]Color={Color.BLUE,Color.Black,Color.RED};
     public Bard()
     {
         setSize(fheight,fwidth);
         setVisible(true);
         setLayout(null);
             }
             public int getMax()
             {
                 int max=data[0];
                 for(int i=0;i<data.length;i++)
                 {
                 if(max<data[i])
                 {
                     max=data[i];
                 }
             }
               return max;
            }
            public int[]getHeights(int max){
                int[]heights= new int[data.length];
                for(int i=0;i<data.length;i++)
                {
                 heights[i]=Math.round(fheight*data[i]/max);

                }
                return heights;
 }

public void paint(Graphics g)
{
    int[]heights=this.getHeights(this.getMax());
    int x=0;
    for(int i=0;i<data.length;i++)
    {
        g.fillRect(x,i*Barw,fheight)
       
        g.setColor(Color[i]);

   
        public static void main(String[]args)
        {
            new Bard();
        }
        }
        