package fileWritingOperations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedFileWritingExample {

	public static void main(String[] args) throws IOException
	{
	
		String location ="BufferedFileWritingExample.txt"; // this create new file in the project directory
		String content ="Writing the text in the file using Buffered File Writing Example";
		
		FileWriter fileWriter = new FileWriter(location);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		bufferedWriter.write(content);
		bufferedWriter.close();
		System.out.println("File Writing operation completed");

	}

}
