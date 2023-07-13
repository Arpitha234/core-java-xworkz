class ACTester{

public static void main(String test[]){
	
  boolean connected = AC.onOrOff();
  System.out.println("is AC connected "+connected);
  AC.increaseTemp();
   AC.increaseTemp();
    AC.increaseTemp();
	 AC.increaseTemp();
	  AC.increaseTemp();
   boolean connected1 = AC.onOrOff();
  System.out.println("is AC connected "+connected1);
   AC.increaseTemp();
    AC.increaseTemp();
	 AC.increaseTemp();
	  AC.increaseTemp();
  boolean connected3 = AC.onOrOff();
  System.out.println("is AC connected "+connected3);
  AC.decreaseTemp();
  AC.decreaseTemp();
  AC.decreaseTemp();
  AC.decreaseTemp();
    boolean connected2 = AC.onOrOff();
 System.out.println("is AC connected "+connected2);
 AC.decreaseTemp();
  AC.decreaseTemp();
  AC.decreaseTemp();
  AC.decreaseTemp();
  
  
}
}