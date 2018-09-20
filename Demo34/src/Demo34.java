import java.io.File;
import java.io.IOException;

public class Demo34 {

	public static void main(String[] args) {
		File file = new File("/Users/tmd/Desktop/test/a.txt");
		System.out.println(file.getName());
		System.out.println(file.length());
		System.out.println(file.getAbsolutePath());
		
		File file2 = new File("/Users/tmd/Desktop/test");

		FileAccept fileAccept = new FileAccept();
		String[] fileNames = file2.list(fileAccept);
		
		for(String name:fileNames) {
			System.out.println(name);
		}
		
//		if(!file2.exists()) {
//			try {
//				file2.createNewFile();
//				System.out.println("create success");
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
	}

}
