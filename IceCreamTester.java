class IceCreamTester{
public static void main(String ice[]){
IceCream.iceCream("Vanilla");
IceCream.iceCream("Butterscotch");
IceCream.iceCream("Black Current");
IceCream.iceCream("Blueberry");
IceCream.iceCream("Strawberry");
IceCream.iceCream("Pista");
IceCream.getFlavors();

IceCream.updateIceName("Vanilla","Chocolate");
IceCream.getFlavors();

int newLength =IceCream.deleteFlavors("Pista");
System.out.println("calling all flavors");

IceCream. getAllFlavorsPostDeletion(newLength);
}
}