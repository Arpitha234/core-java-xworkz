class BankAccountTester{
public static void main(String account[]){
	BankAccount.credit(20000);
System.out.println(BankAccount.getbalance());
	BankAccount.debit(300);
	
	BankAccount.credit(12000);
	BankAccount.credit(200);
	BankAccount.credit(4000);
System.out.println(BankAccount.getbalance());
	
}
}7 