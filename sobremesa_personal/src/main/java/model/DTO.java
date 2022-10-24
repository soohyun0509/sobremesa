package model;

public class DTO {

	private int mno;
	private String id;
	private String password;
	private String name;
	private String email;
	
	public DTO() {
		// TODO Auto-generated constructor stub
	}

	public DTO(int mno, String id, String password, String name, String email) {
		super();
		this.mno = mno;
		this.id = id;
		this.password = password;
		this.name = name;
		this.email = email;
	}

	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "DTO [mno=" + mno + ", id=" + id + ", password=" + password + ", name=" + name + ", email=" + email
				+ "]";
	}
	
	
	
	
}
