class TravelAgency{

static String touristPlaces[]={null,null,null,null,null,null,null,null};
static int index;
public static boolean addplace(String travel){
boolean isAdded = false;
if(travel!=null){
touristPlaces[index]=travel;
index++;
}else{
System.out.println("Cannot add travel ,as it is a null value");

}
return isAdded;
}
public static void getAllPlaces(){
System.out.println("Invoing getAllPlaces");
for(int travel=0;travel<touristPlaces.length;travel++){
String reference = touristPlaces[travel];
System.out.println("Accessing travel" +reference+"at"+travel);


}
System.out.println("End of getAllPlaces");
}
public static boolean updateTouristName(String existingTouristName,String updatedTouristName){
boolean isUpdated = false ;
for (int touristIndex= 0 ; touristIndex < touristPlaces.length;touristIndex++) {
if (touristPlaces[touristIndex].equals(existingTouristName)) {
touristPlaces[touristIndex]=updatedTouristName;
isUpdated = true ;
System.out.println("Is Tourist Name updated"+ isUpdated) ;
}
}

return isUpdated ;
}

public static int deletePlaces(String travelName){
	boolean isDeleted = false;
	int travelIndex;
	int noOfElements = touristPlaces.length;
	
	for(travelIndex=0;travelIndex<touristPlaces.length;travelIndex++){
		if(touristPlaces[travelIndex].equals(travelName)){
			break;
		}
		
	}
	
	if(travelIndex<noOfElements){
	noOfElements = noOfElements-1;
	for(int newindex=travelIndex;newindex<noOfElements;newindex++){
		//logic to remove data from array
		          touristPlaces[newindex] =touristPlaces[newindex+1];
	}
	}
	
	return noOfElements;
}
public static void getAllPlacesPostDeletion(int newLength){
	for(int itemIndex=0;itemIndex<newLength;itemIndex++){
		System.out.println(touristPlaces[itemIndex]);
	}
}
}





