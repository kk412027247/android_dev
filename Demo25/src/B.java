
public class B extends A {

	@Override
	int getMax() {
		int a = 10;
		int b = 20;
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}
	
}
