package in.co.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteObject_1 {

	public static void main(String[] args) throws Exception {

		FileOutputStream file = new FileOutputStream("D:\\New folder\\Marksheet.txt");
		ObjectOutputStream out = new ObjectOutputStream(file);

		Marksheet m = new Marksheet();
		m.name = "Shaswat";
		m.physics = 65;
		m.maths = 52;
		m.chemistry = 85;
		
		System.out.println("done");

		out.writeObject(m);
		out.close();
		file.close();

	}

}
