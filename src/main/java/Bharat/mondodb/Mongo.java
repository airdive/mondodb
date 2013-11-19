package Bharat.mondodb;

import java.net.UnknownHostException;
import java.util.ArrayList;

import org.jongo.Jongo;

import net.vz.mongodb.jackson.DBCursor;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
//{ {} }subobject
//{ [] }subarray
public class Mongo {
	public static void main(String[] args) throws UnknownHostException {
		
		
		MongoClient client=new MongoClient(new ServerAddress("ds053788.mongolab.com", 53788));
		DB database=client.getDB("dropbox");
		String username="teamprojections";
		String password="teamprojections";
		
		char[] passwd=password.toCharArray();
		boolean auth = database.authenticate(username, passwd);
		DBCollection collection=database.getCollection("dropdetails");
		BasicDBObject document=new BasicDBObject();
		document.put("Member1", "Amit Dikkar");
		document.put("Member2", "Maulik Fojdar");
		document.put("Member3", "Akash Patel");
		document.put("Member4", "Bharat Savani");
		
		collection.insert(document);
		
		com.mongodb.DBCursor cursor=collection.find();
		while(cursor.hasNext())
			System.out.println(cursor.next());
/*		
		MongoClient newClient = new MongoClient("localhost", 27017);
		DB db = newClient.getDB("newuser2");
		DBCollection table = db.getCollection("newusercollection2");
		String str="5368709120";
		Double d=Double.parseDouble(str);
		
		BasicDBObject document = new BasicDBObject();
		//document.put("link", "htguhvviuiubviuvbiuviu.com/");
		document.put("name", "aryan");
		document.put("name1", "ned");
		table.insert(document);
		
				//table.insert(document);
		//com.mongodb.DBCursor cursor = table.find(document);
		com.mongodb.DBCursor cursor=table.find();
		//ArrayList arr=new ArrayList();
		while (cursor.hasNext()){
			//BasicDBObject obj=(BasicDBObject)cursor.next();
			//System.out.println("printing the basicdbobject "+obj);
			//arr.add(obj.toString());
			System.out.println(cursor.next());
*/
		}
	}


/*
document.put("checking double", d);
document.put("dbname", "user1");
document.put("dbcollection", "user1files");
document.put("filename", "abc.txt");
document.put("vaultname", "my vault");

document.put("archiveid", "archiveid");
document.put("status", "uploaded");
document.put("sharedwith", "NONE");

 document.put("filesize", "");//retrive from inventory
 document.put("fileuploaddate", "");
 document.put("userid", ""); //get from html form
 document.put("vaultsize","" );//from inventory

*/