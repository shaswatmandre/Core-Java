package in.co.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadObject {
	
public static void main(String[] args) throws Exception {
	
	FileInputStream file = new FileInputStream("D:\\New folder\\Marksheet.txt");
	ObjectInputStream in = new ObjectInputStream(file);
	
	Marksheet m = (Marksheet)in.readObject();
	
	System.out.println(m.name);
	System.out.println(m.physics);
	System.out.println(m.maths);
	System.out.println(m.chemistry);
	
	in.close();
	file.close();
	
}

}
