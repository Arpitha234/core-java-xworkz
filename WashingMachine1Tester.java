class WashingMachine1Tester{

public static void main(String test[]){
	
  boolean connected = WashingMachine1.onOroff();
  System.out.println("is Washing Machine connected "+connected);
  WashingMachine1.increaseTime();
  WashingMachine1.increaseTime();
  WashingMachine1.increaseTime();
  WashingMachine1.increaseTime();
  WashingMachine1.increaseTime();
  
   boolean connected1 = WashingMachine1.onOroff();
  System.out.println("is Washing Machine connected "+connected1);
   WashingMachine1.increaseTime();
  WashingMachine1.increaseTime();
  WashingMachine1.increaseTime();
  WashingMachine1.increaseTime();
  WashingMachine1.increaseTime();
  boolean connected3 = WashingMachine1.onOroff();
  System.out.println("is Washing Machine connected "+connected3);
  WashingMachine1.decreaseTime();
  WashingMachine1.decreaseTime();
  WashingMachine1.decreaseTime();
  WashingMachine1.decreaseTime();
    boolean connected2 = WashingMachine1.onOroff();
 System.out.println("is Washing Machine connected "+connected2);
  WashingMachine1.decreaseTime();
  WashingMachine1.decreaseTime();
  WashingMachine1.decreaseTime();
  WashingMachine1.decreaseTime();
  
  
}
}