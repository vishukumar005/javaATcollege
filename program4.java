class Person {
	private String name;
	private int age;
	private String address;
	
	//constructor with all attributes
	
	public Person(String name, int age, String address){
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	//method chaining
	public Person(String name, int age) {
		this(name, age, "Unknown");
	}
	
	//mehthod to display
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Address: "+address);
		System.out.println("------------------------");
	}
	public static void main(String args[]) {
		Person p1 = new Person("Vishal", 21, "Kolkata");
		Person p2 = new Person("Subhadip", 26);
		
		p1.display();
		p2.display();
	}
}