package com.cdac;

public class UserValidation {
	
	public static boolean isValid(User u1) {
		
		boolean valid =false;
		
		String uName = u1.getUsername();
		String pd = u1.getPassword();
		if(uName.equals("akashpargavkar") && pd.equals("Akash@123")){
			valid = true;	
		}
		return valid;
	}

}
