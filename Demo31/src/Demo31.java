
public class Demo31 {

	public static void main(String[] args) {
		String string = "hello string ";
		String string2 = "hello string";
		
		boolean b = string.startsWith("abc");
		System.out.println(b);
		boolean c = string.endsWith("ing");
		System.out.println(c);
		
		boolean d = string.contains("hellos");		
		System.out.println(d);
		
		int index = string.indexOf("he");
		System.out.println(index);
		
		String sub = string.substring(0,1);
		System.out.println(sub);
		
		String string3 = string.trim();
		System.out.println(string3);
		
		
//		int length = string.length();
//		System.out.println(length);
//		
//		boolean b = string.equals(string2);
//		System.out.println(b);
//		System.out.println(string==string2);
		
//		System.out.println(string);
//
//		String string2 = new String("i am boy");
//		System.out.println(string2);
//		
//		char[] c = {'a','b','c'};
//		String string3 = new String(c);
//		System.out.println(string3);
//		
//		String string4 = new String(c, 1, 1);
//		System.out.println(string4);
		
		
	}
	
	

}
