class Television{
static String name = "MI";
static  int minVolume;
static  int currentVolume;
static  int maxVolume=15;
static int increaseVolume;
static boolean isConnected;


//method
public static boolean onOrOff(){
System.out.println("Invoking onOrOff()");
if(isConnected == false){
isConnected = true;
System.out.println("Television is Turned onnn...Enjoyyyyyy");
}else if(isConnected == true){
isConnected = false;
System.out.println("Television is turned off ");
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
	System.out.println("Gubee...Television Connect Maadu Firstuu");
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
		System.out.println("Television if off..Can't decrease volume");
	}
	System.out.println("End of decrease volume");
}
}

