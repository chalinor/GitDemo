
public class PersonInfo {

	private String name;

	public PersonInfo(String name) {
		super();
		this.name = name;
	}
	
	public void displayInfo(){
		System.out.println("Name: "+name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

