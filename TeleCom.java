class TeleCom{

static String sim[]={null,null,null,null,null};
static int index;
public static boolean addsim(String tele){
boolean isAdded = false;
if(tele!=null){
sim[index]=tele;
index++;
}else{
System.out.println("Cannot add sim,as it is a null value");

}
return isAdded;
}
public static void getAllSim(){
System.out.println("Invoing getAllSim ");
for(int tele=0;tele<sim.length;tele++){
String reference = sim[tele];
System.out.println("Accessing tele" +reference+"at"+tele);


}
System.out.println("End of getAllSim");
}
public static boolean updateSimName(String existingSimName,String updatedSimName){
boolean isUpdated = false ;
for (int simIndex= 0 ; simIndex < sim.length;simIndex++) {
if (sim[simIndex].equals(existingSimName)) {
sim[simIndex]=updatedSimName;
isUpdated = true ;
System.out.println("Is Sim Name updated"+ isUpdated) ;
}
}

return isUpdated ;
}

public static int deleteSim(String simName){
	boolean isDeleted = false;
	int simIndex;
	int noOfElements = sim.length;
	
	for(simIndex=0;simIndex<sim.length;simIndex++){
		if(sim[simIndex].equals(simName)){
			break;
		}
		
	}
	
	if(simIndex<noOfElements){
	noOfElements = noOfElements-1;
	for(int newindex=simIndex;newindex<noOfElements;newindex++){
		//logic to remove data from array
		          sim[newindex] =sim[newindex+1];
	}
	}
	
	return noOfElements;
}
public static void getAllSimPostDeletion(int newLength){
	for(int itemIndex=0;itemIndex<newLength;itemIndex++){
		System.out.println(sim[itemIndex]);
	}
}
}

