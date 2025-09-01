abstract class BankAccount {
	abstract void calculateInterest();
}
class SavingsAccount extends BankAccount {
	void calculateInterest() {
		System.out.println("calculating interest for Saving Account");
	}
}
class CurrentAccount extends BankAccount {
	void calculateInterest() {
		System.out.println("calculating interest for current Account");
	}
}

class Q_5 {
	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount();
		sa.calculateInterest();
		CurrentAccount ca = new CurrentAccount();
		ca.calculateInterest();
	}
}