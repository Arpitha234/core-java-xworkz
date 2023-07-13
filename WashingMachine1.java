class WashingMachine1{
static String name = "LG";
static int mintime;
static int currenttime;
static int maxtime = 60;
static boolean isConnected ;
 //method
 public static boolean onOroff(){
 
  
  
   if(isConnected == false){
	  isConnected = true;
	   System.out.println("Washing Machine is on");
	}
   else if(isConnected == true){
	   isConnected = false;
	   System.out.println("Washing Machine is off");
   }
   return isConnected;
 
 }
 // increase volume
 public static void increaseTime(){
	
	 if(isConnected == true){
	 if(currenttime<maxtime){
		currenttime = currenttime+1;
		System.out.println("The current time is"+currenttime);
	 }else{
		 System.out.println("Max time reached");
	 }
	 
 }else{
	  System.out.println("Connect first");
 }
 
 }
 
 // decrease time
 public static void decreaseTime(){
	 
   
	  
	 if(isConnected == true){
		 if(currenttime>mintime){
			 currenttime = currenttime - 1;
			System.out.println("The current time is"+currenttime); 
		 }else{
			 System.out.println("Minimum time reached");
		 }
	 }else{
		  System.out.println("Washing Machine is off...can't decrease time");
	 }
	 
	
  }
}