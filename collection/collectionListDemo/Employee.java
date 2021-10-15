package collectionListDemo;

public class Employee {

	private int id;
	private String name;
	private long mobile;
	private String email;
	
	public Employee() {
	}
	public Employee(int id, String name, long mobile, String email) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "\n [id=" + id + ", name=" + name + ", mobile=" + mobile + ", email=" + email + "]";
	}
	
}
