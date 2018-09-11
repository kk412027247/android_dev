
public class Demo24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new PoliceCar();
		car.cautionSound();
		car = new AmbulanCar();
		car.cautionSound();
		car = new FireCar();
		car.cautionSound();
	}

}

