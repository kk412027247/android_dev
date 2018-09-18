
public class Demo30 {

	public static void main(String[] args) {
//		int a = 10;
//		int b = 0;
//		
//		Person person = new Person();
//		person = null;
//		try {
//			person.speak();
//			int c = a/b;
//		}catch(NullPointerException e) {
//			System.out.println(e.getMessage());
//		}catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
		
		Bank bank = new Bank();
		
		try {
			bank.income(1, -1);
		} catch (BankException e) {
			e.showMessage();
		}
		

	}

};
