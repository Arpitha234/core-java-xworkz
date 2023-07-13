class MixerTester{

public static void main(String test[]){
	
  boolean connected = Mixer.onOroff();
  System.out.println("is Mixer connected "+connected);
  Mixer.increasespeed();
  Mixer.increasespeed();
  Mixer.increasespeed();
  Mixer.increasespeed();
  Mixer.increasespeed();
  
   boolean connected1 = Mixer.onOroff();
  System.out.println("is Mixer connected "+connected1);
   Mixer.increasespeed();
  Mixer.increasespeed();
  Mixer.increasespeed();
  Mixer.increasespeed();
  Mixer.increasespeed();
  boolean connected3 = Mixer.onOroff();
  System.out.println("is Mixer connected "+connected3);
  Mixer.decreasespeed();
  Mixer.decreasespeed();
  Mixer.decreasespeed();
  Mixer.decreasespeed();
    boolean connected2 = Mixer.onOroff();
 System.out.println("is Mixer connected "+connected2);
  Mixer.decreasespeed();
  Mixer.decreasespeed();
  Mixer.decreasespeed();
  Mixer.decreasespeed();
  
  
}
}