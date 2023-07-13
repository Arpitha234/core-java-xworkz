class Mixer{
static String name = "prestige";
static int minspeed;
static int currentspeed;
static int maxspeed = 30;
static boolean isConnected ;
 //method
 public static boolean onOroff(){
 
  
   if(isConnected == false){
	  isConnected = true;
	   System.out.println("MIXER is on");
	}
   else if(isConnected == true){
	   isConnected = false;
	   System.out.println("MIXER is off");
   }
   return isConnected;
 
 }
 // increase speed
 public static void increasespeed(){
	
	 if(isConnected == true){
	 if(currentspeed<maxspeed){
		currentspeed = currentspeed+1;
		System.out.println("The current speed is"+currentspeed);
	 }else{
		 System.out.println("Max speed reached");
	 }
	 
 }else{
	  System.out.println("Connect first");
 }
 
 }
 
 // decrease speed
 public static void decreasespeed(){
	 
   
	  
	 if(isConnected == true){
		 if(currentspeed>minspeed){
			 currentspeed = currentspeed - 1;
			System.out.println("The current speed is"+currentspeed); 
		 }else{
			 System.out.println("Minimum speed reached");
		 }
	 }else{
		  System.out.println("MIXER is off...can't decrease speed");
	 }
	 
	
  }
}