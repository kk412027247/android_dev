
public class Bank implements Runnable {

	
	int money;
	
	
	public void setMoney(int n) {
		money = n;
	}
	
	
	@Override
	public void run() {
//		if(Thread.currentThread().getName().equals("accountant")) {
//			saveOrTake(300);
//		}else if(Thread.currentThread().getName().equals("cashier")) {
//			saveOrTake(150);
//		}
		saveOrTake();
	}
	
	public synchronized void saveOrTake() {
		if(Thread.currentThread().getName().equals("accountant")) {
			int m = 300;
			for (int i = 0; i<= 3 ; i++) {
				money = money + m/3;
				System.out.println(Thread.currentThread().getName()+" deposit " +m/3 +", there is "+money+" in my account, i will take a break");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}else if(Thread.currentThread().getName().equals("cashier")) {
			int m = 150;
			for (int i = 0; i<= 3 ; i++) {
				money = money - m/3;
				System.out.println(Thread.currentThread().getName()+" draw " +m/3 +", there is "+money+" in my account, i will take a break");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	

}
