package Java14;
import java.io.*;

public class Class04 { 
	
    public static void main(String[] args) throws IOException{
    	char[] data = new char[50];
        FileReader fr = new FileReader("donkey.txt");
        int num = fr.read(data);      
        System.out.println(new String(data)+"\r\n字元數:"+num);
    } 
}
//第二題 不一樣 換行會當作/r/n兩個字元 所以最後顯示出來的字元總共會有三十個字
