class KarnatakaTester{
public static void main(String karnataka[]){
	//create,save,add
	Karnataka.addcity(" Bangalore ");
	Karnataka.addcity(" Mysore ");
	Karnataka.addcity(" Mandya ");
	Karnataka.addcity(" Hassan ");
	Karnataka.addcity(" Tumkur ");
	Karnataka.addcity(" Udupi ");
//Read,get,fetch	
Karnataka.getAllCity();
//update,edit
Karnataka.updateCityName(" Bangalore "," Bengaluru ");
Karnataka.getAllCity();

int newLength =Karnataka.deleteCity(" Hassan ");
System.out.println("calling all City");

Karnataka. getAllCityPostDeletion(newLength);
}
}
