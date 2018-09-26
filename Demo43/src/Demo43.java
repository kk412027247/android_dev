
public class Demo43 {

	public static void main(String[] args) {
		Cake cake = new Cake();
		int size = 10;
		cake.setSize(size);
		
		System.out.println("cake size is "+ size + " kilogram");
		
		Ant antRed = new Ant("red ant", cake);
		Ant antBlack = new Ant("black ant", cake);

		antRed.start();
		antBlack.start();
		
	}

}
