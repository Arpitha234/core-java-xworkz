class Speaker1{
static String name = "JBL";
static  int minVolume;
static  int currentVolume;
static  int maxVolume=10;
static int increaseVolume;
static boolean isConnected;


//method
public static boolean onOrOff(){
System.out.println("Invoking onOrOff()");
System.out.println("Parameter" + 0);
if(isConnected == false){
isConnected = true;
System.out.println("Speaker is Turned onnn...Enjoyyyyyy");
}else if(isConnected == true){
isConnected = false;
System.out.println("Speaker is turned off ");
}
return isConnected;
}


//increaseVolume

public static void increaseVolume(){
if(isConnected == true){
	if(currentVolume < maxVolume){
		currentVolume = currentVolume + 1;
		System.out.println("the current volume is" +currentVolume);
	} else {
		System.out.println("Max Volume Reached");
	}
} else {
	System.out.println("Gubee...Speaker Connect Maadu Firstuu");
}	
}	

public static void decreaseVolume(){
	//logic
	System.out.println("Invoking decreaseVolume()");
	System.out.println("list of parameters"+0);
	if(isConnected==true){
		if(currentVolume>minVolume){
		currentVolume=currentVolume-1;
		System.out.println("the cureent volume is" +currentVolume);
		
		}else{
			System.out.println("Minimum Volume reached");
		}
	}else{
		System.out.println("Speaker if off..Can't decrease volume");
	}
	System.out.println("End of decrease volume");
}
}

