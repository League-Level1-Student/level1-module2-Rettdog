
public class JamesBond {
	public static void main(String[] args) {
		JamesBond bond = new JamesBond();
		Vault vault = new Vault(23452);
		System.out.println(bond.findCode(vault));
	}
	int findCode(Vault vault){
		int i;
		int number=0;
		for(i = 1000000;i>-1;i--) {
		if(vault.tryCode(i)) {
			number = i;
		}
		
		}
		return number;
	}
}
