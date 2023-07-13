class Integer{
static int price[] ={567,78,12,90,1};

public static void largestNumber(){
int largest=price[0];
for(int index=0; index<price.length;index++){
if(price[index]>largest)
largest=price[index];
}
System.out.println("Largest number is:"+largest);
}

public static void acendingOrder(){
int temp;
for(int index=0;index<price.length;index++){
	for(int number=index+1;number<price.length;number++){
		if(price[index]>price[number]){
			temp=price[index];
			price[index]=price[number];
			price[number]=temp;
		}
	}
}
System.out.println("The acending order is:");	
for(int index=0;index<price.length;index++){
	System.out.println(price[index]+" ");
}
}


public static void descendingOrder(){
int temp1;
for(int index=0;index<price.length;index++){
	for(int number=index+1;number<price.length;number++){
		if(price[index]<price[number]){
			temp1=price[index];
			price[index]=price[number];
			price[number]=temp1;
		}
	}
	
}

System.out.println("The descending order is:");	
for(int index=0;index<price.length;index++){
	System.out.println(price[index]+" ");
}
}
}

