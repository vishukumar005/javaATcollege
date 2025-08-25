class Converter {
	//convert String to Integer
	int convert(String s) {
		return Integer.parseInt(s);
		
	}
	//convert double to String
	String convert (double d) {
		return Double.toString(d);
	}
	
	//convert integer to boolean
	boolean convert(int i) {
		return i > 0;
	}
	
	public static void main(String args[]) {
		Converter obj = new Converter();
		System.out.println("String to int: "+obj.convert("123"));
		System.out.println("Double to String: "+obj.convert(45.67));
		System.out.println("Integer to bool: "+obj.convert(45));
		System.out.println("Integer to bool: "+obj.convert(-5));
	}
}