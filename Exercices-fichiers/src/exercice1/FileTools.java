package exercice1;

import java.io.File;

public class FileTools {
	public static void printFiles(String path){
		File rep = new File(path);
		
		for(File f : rep.listFiles()){
			System.out.println(f);
		}
	}
	
	public static void printFiles(String path, String prefix){
		File rep = new File(path);

		for(File f : rep.listFiles((F, name) -> name.startsWith(prefix))){
			System.out.println(f);
		}
	}
	
	public static void totalSizeOfFiles(String path){
		File rep = new File(path);
		int size = 0;
		for(String f : rep.list()){
			size += new File(path+"/"+f).length();
		}
		System.out.println("Size : " + size + "bytes");
	}
	
	public static void mostRecentFile(String path){
		File rep = new File(path);
		long date = 0;
		long curDate;
		File mostRecentFile = null;
//		rep.lastModified();
		
		for(String f : rep.list()){
			File curFile = new File(path+"/"+f);
			curDate = curFile.lastModified();
			if(date < curDate){
				date = curDate;
				mostRecentFile = curFile;
			}
		}
		
		System.out.println("Most recent File : " + mostRecentFile);
	}
	
	
}
