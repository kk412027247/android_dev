
public class Demo23 {

	public static void main(String[] args) {
		Person person = null;
		
		American tom = new American();
		person = tom;
		person.height = 187;
		person.showBodyMess();
		person.mustDoingthing();

		Chinese zhagnsan = new Chinese();
		person = zhagnsan;
		person.height = 190;
		person.showBodyMess();
		person.mustDoingthing();
		person.speakChinese();
	}

}

