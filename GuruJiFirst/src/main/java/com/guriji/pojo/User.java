package com.guriji.pojo;

public class User {
	
private String id;
private String name;
public User(){
this.id="0";
this.name="default";

}
User(String id,String name){
this.id=id;
this.name=name;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}


}