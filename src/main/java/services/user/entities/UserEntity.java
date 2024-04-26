package services.user.entities;

public class UserEntity {

	private String fullName;
	private String phoneNumber;
	private String password;
	private String username;
	private String role;

	public UserEntity(String fullName, String phoneNumber, String password, String username) {
		this.fullName = fullName;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.username = username;
	}

	public UserEntity() {

	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
