package Java14;
import java.io.*;

public class Class05 { 
	
    public static void main(String[] args) throws IOException{
    	char[] data = new char[50];
        FileReader fr = new FileReader("D:\\donkey.txt");
        fr.skip(9);
        int num = fr.read(data);      
        System.out.println(new String(data)+"\r\n字元數:"+num);
    } 
}
