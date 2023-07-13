class MetroTester{
public static void main(String station[]){
Metro.addstation(" Attigupe ");
Metro.addstation(" Viyajnagar ");
Metro.addstation(" Hosahalli ");
Metro.addstation(" Mejestic ");
Metro.addstation(" Mysore Road ");
Metro.addstation(" Sandal Soap Factory ");
Metro.addstation(" Rajajinagar ");
Metro.getAllStation();
Metro.updateStationName(" Hosahalli "," Chikpette ");
Metro.getAllStation();

int newLength =Metro.deleteStation(" Sandal Soap Factory ");
System.out.println("calling all Station");

Metro. getAllStationPostDeletion(newLength);
}
}
