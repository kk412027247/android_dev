
public class Demo33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer buffer = new StringBuffer();
		buffer.append("i like");
		buffer.append(123);
		buffer.append('d');
		buffer.append(12.3);
		
		char c = buffer.charAt(4);
		buffer.insert(1, "insert");
		
		System.out.println(buffer);
		buffer.replace(1, 2, "replace");
		
		System.out.println(buffer);
		StringBuffer buffer2 = buffer.reverse();
		
		
		
		System.out.println(c);
		System.out.println(buffer2);
	}

}
