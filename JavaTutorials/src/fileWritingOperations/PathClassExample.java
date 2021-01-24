package fileWritingOperations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class PathClassExample {

	public static void main(String[] args) throws IOException
	{
	
		String location ="PathClassExample.txt"; // this create new file in the project directory
		String content ="Writing the text in the file using PathClassExample";
		
		Path path = Paths.get(location);
		Files.write(path, content.getBytes());
		System.out.println("File Writing operation completed");

	}

}
