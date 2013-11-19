package Bharat.mondodb;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class formatConversion {
	public static void main(String[] args) {
		int i=10;
		String a="100";
		Double d=Double.parseDouble(a);
		
		//System.out.println(d);
		File newfile=new File("pom.xml");
		Date d1=new Date();
		SimpleDateFormat simpledateformat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		//int ii=d1.getDate();
		long len=newfile.length();
		String s=String.valueOf(len);
		System.out.println(s+" length is "+s.length());
		Double doblen=(double) newfile.length();;
		System.out.println("doblen "+doblen );
		//System.out.println(ii);
		//System.out.println("last modified date "+simpledateformat.format(newfile.lastModified()));
		String str=simpledateformat.format(newfile.lastModified()).toString();
		
		//System.out.println(str);
		System.out.println(str.length());
		String date=str.split(" ")[0];
		String time=str.split(" ")[1];
		//System.out.println(date);
		//System.out.println(time);


		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		//get current date time with Date()
		Date date1 = new Date();
		System.out.println(dateFormat.format(date1));
		String ss=dateFormat.format(date1);
		System.out.println(""+ss+" length is"+ss.length());
		//get current date time with Calendar()
		Calendar cal = Calendar.getInstance();
		System.out.println(dateFormat.format(cal.getTime()));

	}
}
