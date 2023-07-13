class TravelAgencyTester{
public static void main(String travel[]){
TravelAgency.addplace(" Hampi ");
TravelAgency.addplace(" Jog Falls ");
TravelAgency.addplace(" Gokarna ");
TravelAgency.addplace(" Bandipur ");
TravelAgency.addplace(" Nandi Hills ");
TravelAgency.addplace(" Mysuru ");
TravelAgency.addplace(" Dandeli ");
TravelAgency.addplace(" Nagarahole ");
TravelAgency.getAllPlaces();
TravelAgency.updateTouristName(" Jog Falls "," Honnavar ");
TravelAgency.getAllPlaces();

int newLength =TravelAgency.deletePlaces(" Nagarahole ");
System.out.println("calling all Places");

TravelAgency. getAllPlacesPostDeletion(newLength);
}
}
