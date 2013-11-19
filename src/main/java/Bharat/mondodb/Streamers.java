package Bharat.mondodb;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Streamers {
	public static void main(String[] args) {
		File file=new File("D:\\getfile.zip");
		FileInputStream fin=null;
		try{
			fin=new FileInputStream(file);
			System.out.println("Size of file "+fin.available());
			
			int content;
			while((content=fin.read())!=-1){
				System.out.println((char)content);
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally{
			try {
				fin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
