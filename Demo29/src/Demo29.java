
public class Demo29 {

	public static void main(String[] args) {
		Test test = new Test();
//		Person person = new Boy();
		
//		test.testPerson(new Boy());
		
//		test.testPerson(new Person() {
//			@Override
//			void speak() {
//				System.out.println("some body");
//			}}
//		);
		
		
//		person = new Girl();
//		test.testPerson(person);
		
//		test.testCar(new Car() {
//			@Override
//			void sound() {
//				System.out.println("some car");
//			}
//		});
		
		
		test.testBall(new RedBall());
		test.testBall(new BlueBall());
		test.testBall(new Ball() {

			@Override
			public void getColor() {
				System.out.println("othen color");
			}
			
		});
		
	}

}
