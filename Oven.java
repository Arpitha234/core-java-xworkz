class Oven{
static String name = "Whirlpool";
static int mintemp;
static int currenttemp;
static int maxtemp = 30;
static boolean isConnected ;
 //method
 public static boolean onOroff(){
 
  
  
   if(isConnected == false){
	  isConnected = true;
	   System.out.println("Oven is on");
	}
   else if(isConnected == true){
	   isConnected = false;
	   System.out.println("Oven is off");
   }
   return isConnected;
 
 }
 // increase volume
 public static void increaseTemp(){
	
	 if(isConnected == true){
	 if(currenttemp<maxtemp){
		currenttemp = currenttemp+1;
		System.out.println("The current temperature is"+currenttemp);
	 }else{
		 System.out.println("Max temperature reached");
	 }
	 
 }else{
	  System.out.println("Connect first");
 }
 
 }
 
 // decrease temperature
 public static void decreaseTemp(){
	 
   
	  
	 if(isConnected == true){
		 if(currenttemp>mintemp){
			 currenttemp = currenttemp - 1;
			System.out.println("The current temperature is"+currenttemp); 
		 }else{
			 System.out.println("Minimum temperature reached");
		 }
	 }else{
		  System.out.println("Oven is off...can't decrease temperature");
	 }
	 
	
  }
}