
public class Demo45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank bank = new Bank();
		
		bank.setMoney(10000);
		
		Thread accountant = new Thread(bank);
		accountant.setName("accountant");
		
		Thread cashier = new Thread(bank);
		cashier.setName("cashier");
		
		accountant.start();
		cashier.start();
	}

}
