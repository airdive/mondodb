package Bharat.mondodb;

import java.awt.Cursor;
import java.io.File;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.management.Query;

import net.vz.mongodb.jackson.MongoCollection;

import org.bson.types.ObjectId;
import org.jongo.Find;
import org.jongo.FindOne;
import org.jongo.Jongo;

import com.fasterxml.jackson.databind.introspect.WithMember;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class MongoJongo {
	public static void main(String[] args) throws UnknownHostException {
		
		MongoJongo m=new MongoJongo();
		MongoClient newClient = new MongoClient("localhost", 27017);
		DB db = newClient.getDB("friendclass3");
		Jongo jongo=new Jongo(db);
		org.jongo.MongoCollection friends=jongo.getCollection("friends");
		int i=1;
		String newUser="Database"+i;
		m.checkExistingUser(newUser, friends, m);
	}		
	//TODO::Need to add username in FileDate class and in UserInfo class add filename so as to make reflexive property mobilize.
	
		//Iterable<ProjectionsTest> projecttest=friends.findOne().as(ProjectionsTest.class);
		//System.out.println(projecttest);
		
		
		public void checkExistingUser(String userName, org.jongo.MongoCollection friends,MongoJongo m)
		{
			
			AllFileData mydoc4=friends.findOne("{'proj.userInfo.vaultname':'"+userName+"'}").as(AllFileData.class);
			if(mydoc4==null)
				insertNewUser(friends, userName);
			
			else
				retriveUserData(friends, userName);
		}
		public void insertNewUser(org.jongo.MongoCollection friends,String newUser){

			FileData newFileData=new FileData();
			UserInfo userInfo=new UserInfo();
			newFileData.setArchiveid("138 bit archive id");
			newFileData.setFilename("newexample.zip");
			newFileData.setFilesize("1MB");
			newFileData.setFileuploaddate("4/10/2110");
			newFileData.setSharedwith("Akash");
			newFileData.setStatus("Deleted");
			userInfo.setRole("MD");
			userInfo.setTier1(true);
			userInfo.setTier2(false);
			userInfo.setVaultname(newUser);
			
			AllFileData allfiledata=new AllFileData();
			allfiledata.setFiledata(newFileData,userInfo);
			friends.insert(allfiledata);
			AllFileData mydoc=friends.findOne("{'proj.userInfo.vaultname':'"+newUser+"'}").as(AllFileData.class);
			System.out.println(mydoc.getFiledata().getUserInfo().getVaultname());
		}
		public void retriveUserData(org.jongo.MongoCollection friends,String newUser){
			Iterable<AllFileData> mydoc=friends.find().as(AllFileData.class); 
			/*for (AllFileData projectionsTest : mydoc) {
				System.out.println(projectionsTest.getFiledata().getFiledata().getFilename());
				System.out.println(projectionsTest.getFiledata().getUserInfo().getRole());
			}*/
			//List<AllFileData> mydoc3=friends.aggregate("{$match:{$proj:{filedata:{filesize:'1MB'}}}}").as(AllFileData.class);
			//System.out.println(mydoc3);
			AllFileData mydoc4=friends.findOne("{'proj.userInfo.vaultname':'"+newUser+"'}").as(AllFileData.class);
//			System.out.println(mydoc4.getFiledata().getFiledata().getArchiveid());
//			System.out.println(mydoc4.getFiledata().getFiledata().getFilesize());
//			System.out.println(mydoc4.getFiledata().getFiledata().getSharedwith());
			System.out.println(mydoc4.getFiledata().getUserInfo().getVaultname());
			//AllFileData mydoc5=friends.findOne("{'proj.userInfo.vaultname':'newvault'}").as(AllFileData.class);
			//System.out.println(mydoc5.getFiledata().getUserInfo().getVaultname());

		}
}
