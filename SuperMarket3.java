class {
static String vegetables[] = {"Potato","Carrot","Brinjal","Beans","Onion"};
static String  biscuits[] = {" ParleG"," Marie"," JimJam"," DarkFantasy"," Sunfeast"," Moms Magic"," Gooday","oreo "," NutriChoice"," CrackJack"};
static String  perfumes[] = {"MyOp","Sandal","WildStone","Engage","Eva","Dazzler","wattagirl","Gucci","Channel","Fogg"};
static String  groceries[] = {"Rice","wheat", "Ragi","Suger","Coffee","mustud","cornflour","Maida","oil","Daal"};
static String cosmetics[] = {"Toner","Moisturizer","Sunscreen","Face Cream","Foundation","Compact","Kajal","Eyeliner","eyeshadow","eyelashes","Blush","Lipstick","Lipblam","Lipgloss","Concealer","highlighter","Contour","Eyebrowliner","Fcaewash","Rosewater","Setter","MakeupRemover","Nailpolish","NailpolishRemover","Powder"};

public static void main(String market[]){

System.out.println("List Of Vegetables are:");
//getVegetables();
fetchVegetables();

System.out.println("List Of biscuits are:");
//getbiscuits();
fetchbiscuits();

System.out.println("List Of perfumes are:");
//getperfumes();
fetchperfumes();

System.out.println("List Of groceries are:");
//getgroceries();
fetchgroceries();

System.out.println("List Of cosmetics are:");
//getcosmetics();
fetchcosmetics();
}

public static void fetchVegetables(){
System.out.println("Inside fetchVegetables");
for(String vegetable : vegetables){
System.out.println(vegetable);
}
}

public static void fetchbiscuits(){
System.out.println("Inside fetchbiscuits");
for(String biscuit : biscuits){
System.out.println(biscuit);
}
}

public static void fetchperfumes(){
System.out.println("Inside fetchperfumes");
for(String perfume : perfumes){
System.out.println(perfume);
}
}

public static void fetchgroceries(){
System.out.println("Inside fetchgroceries");
for(String grocerie : groceries){
System.out.println(grocerie);
}
}

public static void fetchcosmetics(){
System.out.println("Inside fetchcosmetics");
for(String cosmetic : cosmetics){
System.out.println(cosmetic);
}
}
}
