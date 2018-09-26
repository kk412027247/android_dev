
public class Demo44 {

	public static void main(String[] args) {
		House house = new House();
		house.setCake(10);
		
		Thread antRed = new Thread(house);
		antRed.setName("red ant");
		
		Thread antBlack = new Thread(house);
		antBlack.setName("black ant");
		
		antRed.start();
		antBlack.start();

	}

}
