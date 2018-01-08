package com.mysoft.module;

public class User implements java.io.Serializable {

	// Fields

	private Integer userid;
	private String useraccount;
	private String username;
	private String password;
	private Integer balance;

	// Constructors

	/** default constructor */
	public User() {
	}

	/** full constructor */
	public User(String useraccount, String username, String password, Integer balance) {
		this.useraccount = useraccount;
		this.username = username;
		this.password = password;
		this.balance = balance;
	}

	public Integer getUserid() {
		return this.userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUseraccount() {
		return this.useraccount;
	}

	public void setUseraccount(String useraccount) {
		this.useraccount = useraccount;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getBalance() {
		return this.balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

}