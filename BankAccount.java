class BankAccount{
static boolean iscredited;
static boolean isdebited ;
static double balance ;

public static boolean credit(int amount){
boolean iscredited = false;
if(amount>0){
	
    balance=balance+amount;
    iscredited=true;
}

return iscredited;

}

public static boolean debit(int amount){
	boolean isdebited=false;
	if (amount<=balance){
		balance=balance-amount;
		isdebited=true;
	}
	return isdebited;
	
}
public static double getbalance(){
	return balance;
}	
}





 