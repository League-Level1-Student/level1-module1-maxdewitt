package jamesbondvault;
import java.util.Random;
public class Vault {
  private int secretCode;
 Vault(){
	 Random gen = new Random();
	 secretCode=gen.nextInt(200000);
 }
boolean tryCode(int guess) {
if(secretCode == guess){
 return true;	
}
return false;
}
}

