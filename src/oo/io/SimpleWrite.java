package oo.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

public class SimpleWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 try{
	 FileOutputStream fos = new FileOutputStream("data.txt");
	 fos.write(98);
	 fos.flush();
	 fos.close();
	 
 
	}catch(FileAlreadyExistsException e){
		e.printStackTrace();
	}catch(IOException e){
		e.printStackTrace();
	}
	}
}
