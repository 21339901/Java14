package Java14;
import java.io.*;

public class Class09 { 
	
    public static void main(String[] args) throws IOException{
    	String str;
    	BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\ccc.txt"));
    	
        BufferedReader br = new BufferedReader(new FileReader("D:\\aaa.txt"));
    	while((str=br.readLine())!=null) {
    		bw.write(str);
    		bw.newLine();
    	}
    	br.close();
        
        br = new BufferedReader(new FileReader("D:\\bbb.txt"));
        while((str=br.readLine())!=null) {
    		bw.write(str);
    		bw.newLine();
    	}
        br.close();
        bw.close();
        
        br = new BufferedReader(new FileReader("D:\\ccc.txt"));
        while((str=br.readLine())!=null) {
        	System.out.println(str);
        }
    } 
}
