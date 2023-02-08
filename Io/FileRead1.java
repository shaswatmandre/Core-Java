package in.co.Io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		 try (FileReader in = new FileReader("D:\\\\IOfolder\\\\read.txt")) {
			int ch = in.read();
			while (ch != -1) {
				System.out.print((char) ch);
				ch = in.read();
			}

		}

	}
}
