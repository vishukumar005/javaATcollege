class Vehicle {
	int speed;
	Vehicle(int speed) {
		this.speed = speed;
	}
	void showSpeed() {
		System.out.println("Vehicle Speed: "+speed);
	}
}

class Car extends Vehicle {
	Car(int speed) {
		super(speed);
	}
	void showSpeed() {
		super.showSpeed();
		System.out.println("Car speed: "+speed);
	}
}

class Q_3 {
	public static void main(String args[]) {
		Vehicle v = new Vehicle(34);
		v.showSpeed();
		Car c = new Car(32);
		c.showSpeed();
	}
}