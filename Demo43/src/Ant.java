
public class Ant extends Thread  {
	
	
	Cake cake;
	public Ant(String name, Cake cake) {
		this.cake = cake;
		setName(name);
	}
	
	@Override
	public void run() {
		while(true) {
			int n = 2;
			System.out.println(getName()+"had eat "+ n +" kilogram cake");
			cake.lost(n);
			System.out.println(getName()+"find "+cake.getSize()+" kilogram");
			
			
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(cake.getSize() <= 0) {
				System.out.println(getName()+" died");
				return;
			}
		}
	}
}
