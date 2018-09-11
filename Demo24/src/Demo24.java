
public class Demo24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Car car = new PoliceCar();
//		car.cautionSound();
//		car = new AmbulanCar();
//		car.cautionSound();
//		car = new FireCar();
//		car.cautionSound();
		SoundMaker soundMaker = new SoundMaker();
		Car car = new PoliceCar();
		soundMaker.sound(car);
		car = new AmbulanCar();
		soundMaker.sound(car);
		car = new FireCar();
		soundMaker.sound(car);
	}

}

