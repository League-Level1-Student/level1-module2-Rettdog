
public class Vault {
	
	int unlock = 1000;
	Vault(int code){
		unlock=code;
	}
	boolean tryCode(int code) {
		return code==unlock;
	}
}
