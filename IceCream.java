
class IceCream{
 static String flavors[] = {null,null,null,null,null,null};
 static int index;
 
 public static boolean iceCream(String flavor){
	 boolean isFlavor = false;
	 if(flavor!=null){
		 flavors[index]=flavor;
		 index++;
		isFlavor = true; 
	 }else{
		 System.out.println("Can not add as it has null value");
		 }
	 return isFlavor;
}
 public static void getFlavors(){
	 for(int f=0;f<flavors.length;f++){
		 String flavors = flavors[f];
System.out.println(flavorss);		 
	 }
 }
 public static boolean updateIceName(String existingFlavor,String newFlavor){
	boolean isUpdated = false;
	for(int flavorIndex=0; flavorIndex<flavors.length;flavorIndex++){
		if(flavors[flavorIndex].equals(existingFlavor)){
			flavors[flavorIndex] = newFlavor;
			isUpdated = true;
			System.out.println("is Flavor Name updated "+isUpdated);
		}
	}
	return isUpdated;
}
public static int deleteFlavors(String flavorName){
	boolean isDeleted = false;
	int flavorIndex;
	int noOfElements = flavors.length;
	
	for(flavorIndex=0;flavorIndex<flavors.length;flavorIndex++){
		if(flavors[flavorIndex].equals(flavorName)){
			break;
		}
		
	}
	if(flavorIndex<noOfElements){
	noOfElements = noOfElements-1;
	for(int newindex=flavorIndex;newindex<noOfElements;newindex++){
		//logic to remove data from array
		          flavors[newindex] =flavors[newindex+1];
	}
	}
	
	return noOfElements;
}
public static void getAllFlavorsPostDeletion(int newLength){
	for(int itemIndex=0;itemIndex<newLength;itemIndex++){
		System.out.println(flavors[itemIndex]);
	}
	
}
 
}