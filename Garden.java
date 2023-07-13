class Garden{

static String flowerNames[]={null,null,null,null,null};
static int index;
public static boolean addflower(String garden){
boolean isAdded = false;
if(garden!=null){
flowerNames[index]=garden;
index++;
}else{
System.out.println("Cannot add flower ,as it is a null value");

}
return isAdded;
}
public static void getAllFlower(){
System.out.println("Invoing getAllFlower");
for(int garden=0;garden<flowerNames.length;garden++){
String reference = flowerNames[garden];
System.out.println("Accessing garden" +reference+"at"+garden);


}
System.out.println("End of getAllFlower");
}
public static boolean updateFlowerName(String existingFlowerName,String updatedFlowerName){
boolean isUpdated = false ;
for (int flowerIndex= 0 ; flowerIndex < flowerNames.length;flowerIndex++) {
if (flowerNames[flowerIndex].equals(existingFlowerName)) {
flowerNames[flowerIndex]=updatedFlowerName;
isUpdated = true ;
System.out.println("Is Flower Name updated"+ isUpdated) ;
}
}

return isUpdated ;
}

public static int deleteFlower(String flowerName){
	boolean isDeleted = false;
	int flowerIndex;
	int noOfElements = flowerNames.length;
	
	for(flowerIndex=0;flowerIndex<flowerNames.length;flowerIndex++){
		if(flowerNames[flowerIndex].equals(flowerName)){
			break;
		}
		
	}
	
	if(flowerIndex<noOfElements){
	noOfElements = noOfElements-1;
	for(int newindex=flowerIndex;newindex<noOfElements;newindex++){
		//logic to remove data from array
		          flowerNames[newindex] =flowerNames[newindex+1];
	}
	}
	
	return noOfElements;
}
public static void getAllFlowerPostDeletion(int newLength){
	for(int itemIndex=0;itemIndex<newLength;itemIndex++){
		System.out.println(flowerNames[itemIndex]);
	}
}
}
