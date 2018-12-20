package jamesbondvault;

public class Driver {
	public static void main(String[] args) {
		
	
Vault v = new Vault();
Bond bond = new Bond();
int code = bond.findCode(v);
boolean unlocked =v.tryCode(code);
if(unlocked) 
	System.out.println("Access Granted!"); 
else {
	System.err.println("Access Denied");
}
}
}
