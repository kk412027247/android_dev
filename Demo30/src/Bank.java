
public class Bank {
	void income(int in, int out) throws BankException{
		if(in < 0 || out >0) {
			throw new BankException();
		}
		System.out.println("success");
	}
}
