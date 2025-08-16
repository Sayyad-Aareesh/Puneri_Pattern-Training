package com.wrapper_classes;

public class User {
	private String username;
	private String pass;
	

	public User(String username, String pass) {
		super();
		this.username = username;
		this.pass = pass;
	}
	


	@Override
	public String toString() {
		return "User [username=" + username + ", pass=" + pass + "]";
	}



	public static void main(String[] args) {
	
		User user = new User("admin","admin12")	;
		User user2 = new User("admin","admin12");
		
		User user3 =user;
		
		System.out.println("User 1 hashcode :"+user.hashCode());
		System.out.println("User 2 hashcode :"+user2.hashCode());
		System.out.println("User 3 hashcode :"+user3.hashCode());
		
		//check hash-code two object are equal or not.
		System.out.println(user.equals(user2));
		System.out.println(user.equals(user3));
		System.out.println(user2.equals(user3));

	}

}
