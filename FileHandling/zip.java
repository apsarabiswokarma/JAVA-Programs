import java.io.*;
import java util.zip.*;

class zipExample{
	public void createZip(C:\Users\User\Desktop\JAVA)
	{
		File[]files=path.listFiles();
		if (files.length==0)
		{
			throw new illegalArgumentException();
			
		}
	FileOutputStream fos=new fileOutputStream("C:\Users\User\Desktop/zip/ncit.zip")
	ZipOutputStream zos=new ZipOutputStream(fos);
	for(File f=files){
		FileInputStream fis=new FileOutputStream(f);
		ZipEntry ze=new ZipEntry (f.getName())
		zos.putNextEntry(ze); 
		int content;
		while((content=fis.read())!=-1)
		{
			Zos.write(content);
		}
		fis.close();
	}
		zos.close();
		fos.close();
	
	}
	public static void main(String[]args)throws Exception
	{
		createZip(new File("file"))
	}
	
	}

