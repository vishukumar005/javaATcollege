class Program7 {
	public static void main(String args[]) {
		int sum = 0;
		for(int i = 0; i<args.length; i++) {
			int num = Integer.parseInt(args[i]);
			sum += num;
		}
		System.out.println("sum: "+sum);
	}
	
}