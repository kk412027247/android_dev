import java.util.ArrayList;
import java.util.LinkedList;

public class Demo41 {

	public static void main(String[] args) {
//		ArrayList arrayList = new ArrayList<>();
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
//		arrayList.add("i am Chinese");
		
		for(int i = 0; i<arrayList.size(); i++) {
			int tmp = (int) arrayList.get(i);
			System.out.println(tmp);
//			System.out.println(arrayList.get(i));
		}
		
		LinkedList<String> linkedList = new LinkedList();
		linkedList.add("1");
		linkedList.add("2");
		linkedList.add("3");
		linkedList.addFirst("0");
		
		for(int i = 0; i<linkedList.size(); i++) {
			String tmp = linkedList.get(i);
			System.out.println(tmp);

		}
	}

}
