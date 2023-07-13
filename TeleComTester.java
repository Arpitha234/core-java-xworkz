class TeleComTester{
public static void main(String tele[]){
TeleCom.addsim(" Airtel ");
TeleCom.addsim(" Jio ");
TeleCom.addsim(" Aircel ");
TeleCom.addsim(" BSNL ");
TeleCom.addsim(" Vadafone ");
TeleCom.getAllSim();
TeleCom.updateSimName(" Jio "," Reliance ");
TeleCom.getAllSim();

int newLength =TeleCom.deleteSim(" Vadafone ");
System.out.println("calling all Sim");

TeleCom. getAllSimPostDeletion(newLength);
}
}
