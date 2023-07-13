class Metro{

static String stationNames[]={null,null,null,null,null,null,null};
static int index;
public static boolean addstation(String station){
boolean isAdded = false;
if(station!=null){
stationNames[index]=station;
index++;
}else{
System.out.println("Cannot add station ,as it is a null value");

}
return isAdded;
}
public static void getAllStation(){
System.out.println("Invoing getAllStation");
for(int station=0;station<stationNames.length;station++){
String reference = stationNames[station];
System.out.println("Accessing station" +reference+"at"+station);


}
System.out.println("End of getAllStation");
}
public static boolean updateStationName(String existingStationName,String updatedStationName){
boolean isUpdated = false ;
for (int stationIndex= 0 ; stationIndex < stationNames.length;stationIndex++) {
if (stationNames[stationIndex].equals(existingStationName)) {
stationNames[stationIndex]=updatedStationName;
isUpdated = true ;
System.out.println("Is Station Name updated"+ isUpdated) ;
}
}

return isUpdated ;
}

public static int deleteStation(String stationName){
	boolean isDeleted = false;
	int stationIndex;
	int noOfElements = stationNames.length;
	
	for(stationIndex=0;stationIndex<stationNames.length;stationIndex++){
		if(stationNames[stationIndex].equals(stationName)){
			break;
		}
		
	}
	
	if(stationIndex<noOfElements){
	noOfElements = noOfElements-1;
	for(int newindex=stationIndex;newindex<noOfElements;newindex++){
		//logic to remove data from array
		          stationNames[newindex] =stationNames[newindex+1];
	}
	}
	
	return noOfElements;
}
public static void getAllStationPostDeletion(int newLength){
	for(int itemIndex=0;itemIndex<newLength;itemIndex++){
		System.out.println(stationNames[itemIndex]);
	}
}
}


