
public class Tom implements Test {

	@Override
	public int getSum(int x) {
		int sum = 0;
		for(int i = 1 ; i<=x ; i++) {
			sum = sum + i;
		}
		return sum;
	}

}
