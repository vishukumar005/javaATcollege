class Calculator {
	//overloaded methods
	int add(int a, int b) {
		return a + b;
	}
	double add(double a, double b) {
		return a + b;
	}
	int add(int a, int b, int c) {
		return a + b + c;
	}
	void display(){
		System.out.println("Addtion of 2 intergers: "+add(10, 20));
		System.out.println("Addtion of 2 doubles: "+add(10.5, 20.5));
		System.out.println("Addion of 3 integers: "+add(5, 15, 25));
	}
	public static void main(String args[]) {
		Calculator cal = new Calculator();
		cal.display();
	}	
}

