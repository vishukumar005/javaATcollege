class Device{
	void start() {
		System.out.println("Device starting....");
	}
}

class Phone extends Device {
	void start() {
		System.out.println("Phone starting....");
	}
}

class Smartphone extends Phone {
	void start() {
		System.out.println("SmartPhone starting....");
	}
}

class Q_6{
	public static void main(String args[]) {
		Device d = new Device();
		d.start();
		Phone p = new Phone();
		p.start();
		Smartphone sp = new Smartphone();
		sp.start();
	}
}