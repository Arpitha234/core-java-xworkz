class FaceBook1 {
	public static boolean login(String eMail,String password){
		boolean isLogedIn=false;
		if(eMail!="" && password!=""){
			if(eMail=="arpitha@gmail.com" && password=="arpitha@2001"){
		        isLogedIn=true;
		        System.out.println("Succusfully loged in with eMail and Password..");
			}
		    else{
				isLogedIn=false;
			    System.out.println("Invalid eMail or password..Plz provide correct eMail or Password..");
		    }
	    }else{
			isLogedIn=false;
			System.out.println("Plz..provide the eMail and Password..");
		}
		return isLogedIn;
	}
	public static boolean login(long mobileNo , String password){
		boolean isLogedIn=false;
		if(mobileNo!=0 && password!=""){
			if(mobileNo==8790106926L && password=="arpitha@2001"){
			 isLogedIn=true;
			 System.out.println("Succusfully loged in with Mobile Number and Password..");
		    }else{
				isLogedIn=false;
			System.out.println("Invalid eMail or password..Plz provide correct eMail or Password..");
			}
		}else{
			isLogedIn=false;
			System.out.println("Plz..provide the eMail and Password..");
		}
		return isLogedIn;
	}

}