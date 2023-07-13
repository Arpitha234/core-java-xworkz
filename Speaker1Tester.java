class Speaker1Tester{

public static void main(String test[]){
	System.out.println("Main started");
  boolean connected = Speaker1.onOrOff();
  System.out.println("is speaker connected "+connected);
  Speaker1.increaseVolume();
  Speaker1.increaseVolume();
  Speaker1.increaseVolume();
  Speaker1.increaseVolume();
  boolean connected1 = Speaker1.onOrOff();
  System.out.println("is speaker connected "+connected1);
   Speaker1.increaseVolume();
  Speaker1.increaseVolume();
  Speaker1.increaseVolume();
  Speaker1.increaseVolume();
  boolean connected3 = Speaker1.onOrOff();
  System.out.println("is speaker connected "+connected3);
  Speaker1.decreaseVolume();
  Speaker1.decreaseVolume();
  Speaker1.decreaseVolume();
  Speaker1.decreaseVolume();
    boolean connected2 = Speaker1.onOrOff();
 System.out.println("is speaker connected "+connected2);
  Speaker1.decreaseVolume();
  Speaker1.decreaseVolume();
  Speaker1.decreaseVolume();
  Speaker1.decreaseVolume(); 
  
  System.out.println("Main Ended");
}
}