package backend;

import java.io.IOException;

import entity.FileManager;

public class Exercise3 {
	public static void main(String[] args) throws IOException {
		String path = "abc.txt";
		boolean Question1 = FileManager.isFileExists(path);
		System.out.println(Question1);
		
		boolean Question2 = FileManager.createNewFile(path);
		System.out.println(Question2);
		
		boolean Question4 = FileManager.deleteFile(path);
		System.out.println(Question4);
		
		boolean Question5 = FileManager.isFolder(path);
		System.out.println(Question5);
	}
}
