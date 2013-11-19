package Bharat.mondodb;

public class AllFileData {
	
//FileData filedata=new FileData();
//UserInfo userInfo=new UserInfo();
	ProjectionsTest proj=new ProjectionsTest();
/**
 * @return the filedata
 */
public ProjectionsTest getFiledata() {
	
	return this.proj;
}

/**
 * @param filedata the filedata to set
 */
public void setFiledata(FileData filedata,UserInfo userinfo) {
	this.proj.setFiledata(filedata);
	this.proj.setUserInfo(userinfo);
	//this.filedata = filedata;
}



}
