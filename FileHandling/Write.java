import java.io.File;
import java.io.FileOutputStream;

class Write{
public static void main(String[]args)
{
File file=new File("java.txt");
FileOutputStream f=new FileOutputStream(file);
String Msg="Apsara loves coding in python";
byte[]byteMsg=Msg.getByte();
f.write(byteMsg);
f.close();
}
}





