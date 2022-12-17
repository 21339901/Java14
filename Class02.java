package Java14;
import java.io.*;

public class Class02 { 
	
    public static void main(String[] args) throws IOException{ 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(str.toUpperCase());
    } 
}
