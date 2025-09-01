class Shape {
	void draw() {
		System.out.println("Drawing Shape");
	}
}
class Circle extends Shape {
	void draw() {
		System.out.println("Drawing Circle");
	}
}
class Square extends Shape {
	void draw() {
		System.out.println("Drawing Square");
	}
}

class Triangle extends Shape {
	void draw() {
		System.out.println("Drawing Triangle");
	}
}

class Q_4 {
	public static void main(String[] args) {
		Shape shapes[] = {new Circle(), new Square(), new Triangle()};
		for(int i = 0; i<shapes.length; i++) {
			shapes[i].draw();
		}
	}
}