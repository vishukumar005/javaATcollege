class Geometry {
	//circle
	double area(double radius) {
		return Math.PI * radius * radius;
	}
	//rectangle
	double area(double length, double width) {
		return length * width;
	}
	//Trinagle
	double area(double base, double height, boolean isTriangle) {
		if(isTriangle) {
			return 0.5 * base * height;
		}
		return -1;
	}
	public static void main(String args[]) {
		Geometry sh =  new Geometry();
		System.out.println("Area of circle: "+sh.area(7));
		System.out.println("Area of Rectangle: "+sh.area(4.0, 5.0));
		System.out.println("Area of Triangle: "+sh.area(3.0, 4.0, true));
	}
}