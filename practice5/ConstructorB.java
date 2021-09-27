package practice5;

public class ConstructorB {
	private int id;
	private String name;
	private String email;
	private String phnNum;
	
	
	public ConstructorB(int id, String name, String email, String phnNum) {
		this.id=id;
		this.name=name;
		this.email= email;
		this.phnNum=phnNum;
	}
	
	public ConstructorB() {
		this.id=201;
		this.name="John";
		this.email="john@123";
		this.phnNum="900875456";
		
	}
	
	public void show() {
		System.out.println("id "+this.id  + "  name " +this.name + " email " +this.email + " phnNum " +phnNum );
	}
}
