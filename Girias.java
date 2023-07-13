class Girias{
static String eletronicDevices[] =  {"Refrigerator","WashingMachine","Television","LED","Grinder","AC","IronBox","Microwave"};
public static void main(String arg[]){
System.out.println("Main Started");
for(int devsIndex=0;devsIndex<eletronicDevices.length;){
	//for(String eletronicDevice:eletronicDevices)
		//System.out.println(eletronicDevice);
System.out.println(eletronicDevices[devsIndex]);
devsIndex++;
}
System.out.println("Main ended");
}
}