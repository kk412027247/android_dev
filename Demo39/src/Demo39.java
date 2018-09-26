
public class Demo39 {

	public static void main(String[] args) {
		ShowObject<Dog> showDog = new ShowObject<>();
		ShowObject<Cat> showCat = new ShowObject<>();
		showDog.showMess(new Dog());
		showCat.showMess(new Cat());
	}

}
