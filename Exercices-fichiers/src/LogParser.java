import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LogParser {
	public static void parseAndCreateCsv(String filePath, String csvPath) {
		String lineSeparator = System.getProperty("line.separator");
		try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(filePath))));){
			
			String line;
			while ((line=br.readLine())!=null){
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
