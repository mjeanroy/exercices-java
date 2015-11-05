package exercice1;


public class MainEx1 {

	public static void main(String[] args) {
		String path = "C:\\Users\\Leon\\Documents\\Ynov";
		FileTools.printFiles(path, "D");
		FileTools.totalSizeOfFiles(path);
		FileTools.mostRecentFile(path);
	}

}
