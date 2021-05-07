package gameProject.entities;

import java.util.Date;
import gameProject.abstracts.Entity;

public class User implements Entity{
	private String nationalityId;
	private String userFirstName;
	private String userLastName;
	private Date dateOfBirth;
	
	public User(String nationalityId, String userFirstName, String userLastName, Date dateOfBirth) {
		super();
		this.nationalityId = nationalityId;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.dateOfBirth = dateOfBirth;
	}

	public String getnationalityId() {
		return nationalityId;
	}

	public void setnationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	

}
