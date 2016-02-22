package com.Guruji.Controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import com.guriji.pojo.User;

public class FirstJava {
private Map<String,User> users=new HashMap<String,User>();
	static{
		System.out.println("Projcet  loading");
	}
	static void showMenu(){
		System.out.println("Chouse the option");
		System.out.println("1 -Add User");
		System.out.println("2 Show user ");
		System.out.println("3 Delete Last User");
		System.out.println("4 Delete par User");
		System.out.println("5 Show menu   ");
		System.out.println("6 Exit ");
	
	}
	public void add_user(String name, String id){
	
		User user=new User();
		user.setId(id);
		user.setName(name);
		users.put(id, user);
		System.out.println(" User Added");
		
		 
	}
	public static void main(String arg[]){
		showMenu();
		FirstJava firstJava=new FirstJava();
		
		Scanner scanner=new Scanner(System.in);
		String choice=scanner.next();
		while(!choice.equals("6")){
		switch(choice){
		case "1":
			System.out.println("Enter the user name");
			String name=scanner.next();
			System.out.println("Enter the user id");
			String id=scanner.next();
			firstJava.add_user(name,id);
			break;
		case "2":
			firstJava.show_user();
			break;
		default:
			System.out.println("Wrong chice" );
			showMenu();
			
		}
	  choice=scanner.next();
		}
		System.out.println("Program ended" );
	
}
	private void show_user() {
		// TODO Auto-generated method stub

for (Entry<String, User> entry : users.entrySet()) {
    String key = entry.getKey().toString();
    User value = entry.getValue();
    System.out.println("id, " + key + " Name " + value.getName() );
}
		
	}
	}
