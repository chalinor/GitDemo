
public class PersonInfo {

	private String name;
	private int age;

	public PersonInfo() {
		name = null;
		age = 0;
	}
	
	public void displayInfo(){
		System.out.println("Name: "+name+ "\nAge: "+age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}

