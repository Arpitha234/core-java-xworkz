class Subtraction{

public static void main(String subtraction[]){
 sub(65,34);
 sub(100, 37);
 sub(568, 234);
 sub(908, 654);
 sub(1234, 876);
 sub(677, 87);
 sub(3456, 765);
 sub(900, 76);
 sub(334, 243);
 sub(679, 165);
System.out.println("-----------------");
sub(65,34,2);
 sub(100, 12, 37);
 sub(568, 234, 22);
 sub(1100,908, 654);
 sub(1234,321, 876);
 sub(852,677, 87);
 sub(6325,3456, 765);
 sub(1230, 900, 76);
 sub(1530,334, 243);
 sub(963,679, 165);

}
public static void sub(int a, int b){
System.out.println(a-b);
}
 public static void sub(int x, int y, int z){
System.out.println(x-y-z);

}
}