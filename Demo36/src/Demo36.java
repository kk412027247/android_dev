import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo36 {

	public static void main(String[] args) {
		File file = new File("/Users/tmd/Desktop/test/a.txt");
		File file2 = new File("/Users/tmd/Desktop/test/c.txt");
		byte[] b = new byte[100];
		String txt = "I am China";
		byte[] b2 = txt.getBytes();
		int count = 0;
		try {
			FileInputStream is = new FileInputStream(file);
			while((count = is.read(b)) != -1) {
				String string = new String(b,0,count);
				System.out.println(string);
			}
			is.close();
			
			FileOutputStream os = new FileOutputStream(file2);
			os.write(b2);
			os.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		

}
