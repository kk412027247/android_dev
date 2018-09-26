
public class House implements Runnable {

	int cake;
	public void setCake(int c) {
		cake = c;
	}
	
	@Override
	public void run() {
		int m = 2;
		while(true) {
			if(cake <= 0) {
				System.out.println(Thread.currentThread().getName()+ " is dead");
				return;
			}
			
			cake = cake - m;
			System.out.println(Thread.currentThread().getName()+"had eat "+ m + " kilogram");
			System.out.println(Thread.currentThread().getName()+"found "+ cake + " kilogram cake leave ");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
