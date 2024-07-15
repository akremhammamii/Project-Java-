package part5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsKeword {

	public static void main(String[] args) throws IOException, InterruptedException {

		FileReader fr = null;
		fr = new FileReader("//halima/user/file.txt");
		
		BufferedReader  bfr = new BufferedReader(fr);
		System.out.println(bfr.readLine());
		
		Thread.sleep(3000);

	}

}
