class Book {
	private String title;
	private String author;
	private double price;
	
	//parameterized constructor
	public Book(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	//function to display
	public void display() {
		System.out.println("Book Title: "+title);
		System.out.println("Book Author: "+author);
		System.out.println("Book Price: "+price);
    }
	//Main function to run the program
	public static void main(String args[]) {
		Book b1 = new Book("Java Programming", "James Gosling", 499.99); //first book obj
		Book b2 = new Book("Clean code", "Robert C. Martin", 599.50);//second book obj
		b1.display();
		b2.display();
	}
}

