import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;



public class Demo42 {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("1");
		hashSet.add("2");
		hashSet.add("3");
		hashSet.add("3");
		
		Iterator<String> iterator = hashSet.iterator();
		while(iterator.hasNext()) {
			String string = iterator.next();
			System.out.println(string);
		}
		
		
		
		
		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put("name", "Tom");
		hashMap.put("age", "11");
		
		System.out.println(hashMap.get("age"));
		
		Iterator<Entry<String, String>> iterator2 = hashMap.entrySet().iterator();
		
		while(iterator2.hasNext()) {
			Entry<String, String> entry = iterator2.next();
			System.out.println("key="+entry.getKey()+" value="+entry.getValue());
		}
	}

}
