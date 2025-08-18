class Rectangle {
	private double length;
	private double width;
	
	//Default constructor (length and width = 1)
	public Rectangle() {
		this.length = 1;
		this.width = 1;
	}
	
	//parameterized constructor
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	//method to calculate area
	public double area() {
		return length * width;
	}
	//method to calculate perimeter
	public double perimeter() {
		return 2 * (length + width);
	}
	//method to display area, length, width, perimeter
	void display() {
		System.out.println("Length: "+length+"\nWidth: "+width);
		System.out.println("Area: "+area());
		System.out.println("Perimeter: "+perimeter());
		System.out.println("--------------------------------");
	}
	//main method
	public static void main(String args[]) {
		Rectangle r1 = new Rectangle(); //default constructor
		Rectangle r2 = new Rectangle(5, 3); //parameterized contructor
		r1.display();
		r2.display();
	}
}