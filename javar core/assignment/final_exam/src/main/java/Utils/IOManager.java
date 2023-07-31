package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class IOManager {
	public static final String FILE_EXISTS = "Error! File Exist.";
	public static boolean isFileExists(String pathFile) {

		File file = new File(pathFile);
		return file.exists();
	}
	public static boolean createNewFile(String pathFile) throws IOException {
		if (isFileExists(pathFile)) {
			throw new IllegalStateException(FILE_EXISTS);
		}
		File file = new File(pathFile);
		return file.createNewFile();
	}
	
	public static void readFile (String pathFile) throws IOException {
		FileInputStream reads = new FileInputStream(pathFile);
		byte [] a = new byte [1024];
		int length = reads.read(a);
		while(length !=-1) {
			String s = new String (a,0,length);
			System.out.println(s);
			length = reads.read(a);
		}
		reads.close();
	}
	
	public static void writeFile(String pathFile, String content, boolean append) throws IOException {
		FileOutputStream fos = new FileOutputStream(pathFile);
		fos.write(content.getBytes(StandardCharsets.UTF_8));
		fos.close();
	}
}
