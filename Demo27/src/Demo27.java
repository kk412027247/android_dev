
public class Demo27 {

	public static void main(String[] args) {
		Test test;
		Tom tom = new Tom();
		test = tom;
		System.out.println(test.getSum(20));
		test = new Bob();
		System.out.println(test.getSum(20));
				
	}

}
