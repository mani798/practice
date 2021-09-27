package practice5;

public class ConstructorExample {
       
	private int Id;
	private String Name;
	
	
	public ConstructorExample(int Id,String Name) {
		this.Id = Id;
		this.Name = Name;
	}
	
	public ConstructorExample() {
		this.Id = 7;
		this.Name = "chaitanya";
	}
	public void show() {
		System.out.println("Id "+this.Id +" "+"Name "+this.Name);
	}
		
	
}
