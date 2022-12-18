package Java14;
import java.io.*;

public class Class08 { 
	
    public static void main(String[] args) throws IOException{
    	int count = 0;
    	String str;
    	char[] data_aaa = new char[21];
    	char[] data_bbb = new char[128];
    	
        BufferedReader br = new BufferedReader(new FileReader("D:\\aaa.txt"));
        br.read(data_aaa);
        br.close();
        br = new BufferedReader(new FileReader("D:\\bbb.txt"));
        br.read(data_bbb); 
        br.close();
        FileWriter fw = new FileWriter("D:\\ccc.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(data_aaa);
        bw.newLine();
        
        bw.write(data_bbb);
        bw.close();
        
    } 
}
