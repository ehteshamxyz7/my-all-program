package springmvc.model;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class User {
	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String Email_address;
	private String userName;
	private String pass;
	public String getEmail_address() {
		return Email_address;
	}
	public void setEmail_address(String email_address) {
		Email_address = email_address;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public User(int id, String email_address, String userName, String pass) {
		super();
		this.id = id;
		Email_address = email_address;
		this.userName = userName;
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "User [Email_address=" + Email_address + ", userName=" + userName + ", pass=" + pass + "]";
	}
	
}
