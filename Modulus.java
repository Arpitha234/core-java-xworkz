class Modulus{
public static void main(String Modulus[]){
mod(34,78);
mod(65,34);
mod(28,42);
mod(65,89);
mod(34,45);
mod(90,87);
mod(34,65);
mod(234,876);
mod(123,543);
mod(654,78);
System.out.println("-----------------");
mod(65,34,2);
 mod(100, 12, 37);
 mod(568, 234, 22);
 mod(1100,908, 654);
 mod(1234,321, 876);
 mod(852,677, 87);
 mod(6325,3456, 765);
 mod(1230, 900, 76);
 mod(1530,334, 243);
 mod(963,679, 165);

}
public static void mod(int a, int b){
System.out.println(a-b);
}
 public static void mod(int x, int y, int z){
System.out.println(x-y-z);

}
}