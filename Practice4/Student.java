package Practice4;

public class Student {
    
	private int id;
	private String name;
	private String email;
	private String phnNum;
	
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public void setPhnNum(String phnNum) {
		this.phnNum=phnNum;
	}
	
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public String getEmail() {
		return this.email;
	}
	public String getPhnNum() {
		return this.phnNum;
	}
}
