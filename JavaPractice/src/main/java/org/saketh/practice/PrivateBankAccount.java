package org.saketh.practice;
public class PrivateBankAccount {
	private String userName;
	private String password;
	void setUserName(String usr)
	{
		this.userName = usr; // set
	}
	void setPassword (String pwd)
	{
		this.password = pwd;
	}
	String getUserName()
	{
		return this.userName;
	}
	String getPassword()
	{
		return this.password;
	}
}
