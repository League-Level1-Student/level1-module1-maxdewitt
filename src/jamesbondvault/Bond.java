package jamesbondvault;

public class Bond {
int findCode(Vault vault) {
	int i = 0;
	while(vault.tryCode(i) == false) {
		i++;
		System.out.println(i);
	}

return i;
}
}