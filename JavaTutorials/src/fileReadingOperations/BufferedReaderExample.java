package fileReadingOperations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

	public static void main(String[] args) throws IOException
	{
		String location ="BufferedFileWritingExample.txt";
		
		FileReader fileReader = new FileReader(location);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		//To print single line
		String currentLine = bufferedReader.readLine();
		System.out.println(currentLine);
		
		
		//To print Multiple line
		String currentLineNew;
		while(( currentLineNew =bufferedReader.readLine())!=null) 
		{
			System.out.println(currentLineNew);
		}
		

	}

}
