import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo37 {

	public static void main(String[] args) {
		String content = "hello , I am Chinese";
		File file = new File("/Users/tmd/Desktop/test/c.txt");
		char[] c = content.toCharArray();
		try {
			FileWriter fw = new FileWriter(file);
			fw.write(c);
			fw.close();
			
			FileReader fr = new FileReader(file);
			char[] c2 = new char[100];
			int count = 0;
			while((count = fr.read(c2)) != -1) {
				String string = new String(c2, 0, count);
				System.out.print(string);			
			}
			fr.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
