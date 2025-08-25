class Printer{
	int print(int a) {
		return a;
	}
	double print(double b) {
		return b;
	}
	String print(String c) {
		return c;
	}
	public static void main(String args[]) {
		Printer p = new Printer();
		System.out.println("interger: "+p.print(100));
		System.out.println("Double: "+p.print(10.3));
		System.out.println("String: "+p.print("hello world"));
	}
}