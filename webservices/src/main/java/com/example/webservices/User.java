package com.example.webservices;




public class User {
public User(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

private String id;
private String name;
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
/*@Override  
public String toString()   
{  
//return "User [id=" + id + ", name=" + name + ", dob=" + dob + "]";  
return String.format("User [id=%s, name=%s]", id, name);  
}  
*/

}
