class OvenTester{

public static void main(String test[]){
	
  boolean connected = Oven.onOroff();
  System.out.println("is Oven connected "+connected);
  Oven.increaseTemp();
  Oven.increaseTemp();
  Oven.increaseTemp();
  Oven.increaseTemp();
  Oven.increaseTemp();
  
   boolean connected1 = Oven.onOroff();
  System.out.println("is Oven connected "+connected1);
   Oven.increaseTemp();
  Oven.increaseTemp();
  Oven.increaseTemp();
  Oven.increaseTemp();
  Oven.increaseTemp();
  boolean connected3 = Oven.onOroff();
  System.out.println("is Oven connected "+connected3);
  Oven.decreaseTemp();
  Oven.decreaseTemp();
  Oven.decreaseTemp();
  Oven.decreaseTemp();
    boolean connected2 = Oven.onOroff();
 System.out.println("is Oven connected "+connected2);
  Oven.decreaseTemp();
  Oven.decreaseTemp();
  Oven.decreaseTemp();
  Oven.decreaseTemp();
  
  
}
}