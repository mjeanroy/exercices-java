package exercice2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogParser {
	public static void parseAndCreateCsv(String filePath, String csvPath) {
		String lineSeparator = System.getProperty("line.separator");
		Methode met;
		Duration dur;
		Map<Methode, Duration> map = new HashMap<>();
		
		Pattern pattern = Pattern.compile("DEBUG ([a-z]*\\.[a-z]*\\.[a-z]*)\\.([a-zA-z]*)\\.([a-zA-Z]*) --> ([0-9]+)ms");
		Matcher matcher;
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(filePath))));
			PrintWriter csvFile = new PrintWriter(new BufferedWriter(new FileWriter (new File(csvPath))));){
			
			String line;
			while ((line=br.readLine())!=null){
				matcher = pattern.matcher(line);
				if(matcher.find()){
					met = new Methode(matcher.group(1), matcher.group(2), matcher.group(3));
					if(map.containsKey(met)){
						map.get(met).addDuration(Long.parseLong(matcher.group(4)));
					}else{
						map.put(met, new Duration(Long.parseLong(matcher.group(4))));
					}
				}
			}

			String csv = "Package;Classe;Methode;Temps moyen" + lineSeparator;
			Iterator<Methode> it = map.keySet().iterator();
			while(it.hasNext()){
				met = (Methode) it.next();
				dur = (Duration) map.get(met);
				
				csv += met.getMetPackage() + ";" + met.getMetClass() + ";" + met.getMetMethode() + ";" + dur.avg() + lineSeparator;
			}
			
			csvFile.println(csv);
			System.out.println("Done !");
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
