import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo38 {

	public static void main(String[] args) {
		String[] content = {"i am chinese", "i like china", "i hate japense","i hate korea"};
		File file = new File("/Users/tmd/Desktop/test/c.txt");
		
		try {
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			
			for(String str:content) {
				bw.write(str);
				bw.newLine();
			}
			bw.close();
			fw.close();
			
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String string = null;
			while((string = br.readLine()) != null) {
				System.out.println(string);
			}
			br.close();
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
