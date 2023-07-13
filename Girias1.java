class Girias1{
static String eletronicDevices[] =  {"Refrigerator","WashingMachine","Television","LED","Grinder","AC","IronBox","Microwave"};
static double priceOfElectronicDevices [] = {50000.00,40000.00,15000.00,2000.00,10000.00,25000.00,5000.00,6000.00};
public static void main(String arg[]){
System.out.println("Main Started");
for(String eletronicDevice : eletronicDevices){
System.out.println(eletronicDevice);
}
for(double priceOfElectronicDevice : priceOfElectronicDevices){
System.out.println(priceOfElectronicDevice);	

	

}
System.out.println("Main ended");

}
}