class GardenTester{
public static void main(String garden[]){
Garden.addflower(" Rose ");
Garden.addflower(" Jasmin ");
Garden.addflower(" Lilly ");
Garden.addflower(" Hibiscus ");
Garden.addflower(" Daffodil");
Garden.getAllFlower();

Garden.updateFlowerName(" Lilly "," Daisy ");
Garden.getAllFlower();

int newLength =Garden.deleteFlower(" Hibiscus ");
System.out.println("calling all Flower");

Garden. getAllFlowerPostDeletion(newLength);
}
}
