package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Geo on 1/1/2017.
 */
@Entity
@Table(name = "user")
public class User extends AbstractDataModel implements Serializable{

	private static final long serialVersionUID = -8611852970758103750L;
	private int id;
	private String firstName;
    private String lastName;
    private String userName;
    private String password;

    public User(){

    }

	public User(int id, String firstName, String lastName, String userName, String password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    

}
