class AC{
static String name = "Harier";
static  int minTemp;
static  int currentTemp;
static  int maxTemp=25;
static int increaseTemp;
static boolean isConnected;


//method
public static boolean onOrOff(){
System.out.println("Invoking onOrOff()");
System.out.println("Parameter" + 0);
if(isConnected == false){
isConnected = true;
System.out.println("AC is Turned onnn...Enjoyyyyyy");
}else if(isConnected == true){
isConnected = false;
System.out.println("AC is turned off ");
}
return isConnected;
}


//increasetemp

public static void increaseTemp(){
if(isConnected == true){
	if(currentTemp < maxTemp){
		currentTemp = currentTemp + 1;
		System.out.println("the current Temp is" +currentTemp);
	} else {
		System.out.println("Max Temp Reached");
	}
} else {
	System.out.println("Gubee...Speaker Connect Maadu Firstuu");
}	
}	

public static void decreaseTemp(){
	//logic
	System.out.println("Invoking decreaseTemp()");
	System.out.println("list of parameters"+0);
	if(isConnected==true){
		if(currentTemp>minTemp){
		currentTemp=currentTemp-1;
		System.out.println("the cureent Temp is" +currentTemp);
		
		}else{
			System.out.println("Minimum Temp reached");
		}
	}else{
		System.out.println("Speaker if off..Can't decrease Temp");
	}
	System.out.println("End of decrease Temp");
}
}

