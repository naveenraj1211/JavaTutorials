package fileWritingOperations;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) throws IOException
	{

		String location ="FileWriterExample.txt"; // this create new file in the project directory
		String content ="Writing the text in the file using File Writer";
		
		FileWriter fileWriter = new FileWriter(location);
		fileWriter.write(content);
		fileWriter.close();
		System.out.println("File Writing operation completed");
				

	}

}
