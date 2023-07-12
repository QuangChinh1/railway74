package frontend;

import java.io.IOException;

import entity.FileManager;
public class program2 {
	public static void main(String[] args) throws IOException {
		String pathFile = "abc.txt";
		
		boolean Question1 = FileManager.isFileExists(pathFile);
		System.out.println(Question1);
		
		boolean Question2 = FileManager.createNewFile(pathFile);
		System.out.println(Question2);
	}
}
