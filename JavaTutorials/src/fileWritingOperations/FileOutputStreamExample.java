package fileWritingOperations;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {

	public static void main(String[] args) throws IOException
	{

		String location ="FileOutputStreamExample.txt"; // this create new file in the project directory
		String content ="Writing the text in the file using FileOutputStreamExample";
		
		FileOutputStream  fileOutputStream = new FileOutputStream(location);
		byte[] bytecontent = content.getBytes();
		
		fileOutputStream.write(bytecontent);
		fileOutputStream.close();
		System.out.println("File Writing operation completed");
	}

}
