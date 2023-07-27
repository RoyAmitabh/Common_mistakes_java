package open.arc.org;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Streams {

	public static void main(String[] args)  {
		try {
			copyWithoutBuffer(args[0],args[1]);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		try {
			copyUsingBuffer(args[0],args[1]);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void copyWithoutBuffer(String sourcePath, String targetPath) throws FileNotFoundException, IOException {
		try (InputStream inputStream = new FileInputStream(sourcePath); OutputStream os = new FileOutputStream(targetPath)) {
			int data;
			while ((data = inputStream.read()) != -1) {
				os.write(data);
			}
		}
	}
	
	private static void copyUsingBuffer(String sourcePath, String targetPath) throws FileNotFoundException, IOException {
		try (InputStream inputStream = new BufferedInputStream(new FileInputStream(sourcePath)); OutputStream os = new BufferedOutputStream(new FileOutputStream(targetPath))) {
			int octet;
			while ((octet = inputStream.read()) != -1) {
				os.write(octet);
			}
		}
	}
}
