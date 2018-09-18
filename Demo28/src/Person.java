
public class Person {
	int age = 10;
	void eat() {
		System.out.println("eat");
	}
	
	Car car;
	
	public Person() {
		car = new Car();
	}
	
	
	void start() {
		car.playCar();
	}
	
	class Car {
		void playCar() {
			System.out.println("play car");
			System.out.println(age);
			eat();
		}
	}
}
