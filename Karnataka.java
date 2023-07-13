class Karnataka{

static String cityNames[]={null,null,null,null,null};
static int index;
public static boolean addcity(String karnataka){
boolean isAdded = false;
//Validate cityName
if(index<cityNames.length){
if(karnataka!=null){
cityNames[index]=karnataka;
index++;
isAdded=true;

}else{
System.out.println("Cannot add city,as it is a null value");
}
}else{
	System.out.println("Size is full,cannot add city anymore");
}
return isAdded;
}
public static void getAllCity(){
for(int karnataka=0;karnataka<cityNames.length;karnataka++){
String reference = cityNames[karnataka];
System.out.println("Accessing karnataka" +reference+"at"+karnataka);


}
System.out.println("End of getAllCity");
}
public static boolean updateCityName(String existingCityName,String updatedCityName){
boolean isUpdated = false ;
for (int cityIndex= 0 ; cityIndex < cityNames.length;cityIndex++) {
if (cityNames[cityIndex].equals(existingCityName)) {
cityNames[cityIndex]=updatedCityName;
isUpdated = true ;
System.out.println("Is City Name updated"+ isUpdated) ;
}
}

return isUpdated ;
}


public static int deleteCity(String cityName){
	boolean isDeleted = false;
	int cityIndex;
	int noOfElements = cityNames.length;
	
	for(cityIndex=0;cityIndex<cityNames.length;cityIndex++){
		if(cityNames[cityIndex].equals(cityName)){
			break;
		}
		
	}
	
	if(cityIndex<noOfElements){
	noOfElements = noOfElements-1;
	for(int newindex=cityIndex;newindex<noOfElements;newindex++){
		//logic to remove data from array
		          cityNames[newindex] =cityNames[newindex+1];
	}
	}
	
	return noOfElements;
}
public static void getAllCityPostDeletion(int newLength){
	for(int itemIndex=0;itemIndex<newLength;itemIndex++){
		System.out.println(cityNames[itemIndex]);
	}
}
}

