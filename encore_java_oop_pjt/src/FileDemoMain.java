import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileDemoMain {

	public static void main(String[] args) {
		FileReader reader = null;
		int data = 0;
		String path = "C:\\Users\\Playdata\\git\\git_encore_java\\encore_java_oop_pjt\\src\\testReader.txt";
		
		try {
			reader = new FileReader(path);
			while ((data = reader.read()) != -1)
				System.out.print((char)data);
			System.out.println();
			
			File file = new File(path);
			reader = new FileReader(file);
			char [] charAry = new char[(int) file.length()];
			reader.read(charAry); // 전체를 한꺼번에 읽어들임`
			for (int i = 0; i < charAry.length; i++)
				System.out.print(charAry[i]);			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch(Exception e) { 
				e.printStackTrace();
			}			
		}	
	}

}
