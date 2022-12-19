package Java14;
import java.io.*;
import java.util.Arrays;

public class Class10 { 
	
    public static void main(String[] args) throws IOException{
    	String str;
    	int storage;
    	int i = 1;
    	BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\rand.txt"));
    	while((i++)<=1000) {
    		storage = (int)(Math.random()*100000)+1; //強制轉型可以改成 a.intValue()
    		if (storage == 100000) {
    			i--;
    			continue;
    		}
    		bw.write(Integer.toString(storage));
    		bw.newLine();
    	}
    	bw.flush();
    	bw.close();
    	
    	i = 0;
    	int[] array = new int[1000];
    	int max = 0;
    	int min = 100000;
    	int sum = 0;
        BufferedReader br = new BufferedReader(new FileReader("D:\\rand.txt"));
        while((str = br.readLine())!= null) {
        	sum+=Integer.parseInt(str);
        	array[i] = Integer.parseInt(str);
        	i++;
        	if(Integer.parseInt(str)<min) {
        		min = Integer.parseInt(str);
        	}
        	if(Integer.parseInt(str)>max) {
        		max = Integer.parseInt(str);
        	}
        }
        System.out.println("max= "+max);
        System.out.println("min= "+min);
        System.out.println("average= "+sum/1000);
        br.close();
        Arrays.sort(array);
        bw =  new BufferedWriter(new FileWriter("D:\\rand2.txt"));
        for(int j = 0;j<=999;j++) {
        	bw.write(Integer.toString(array[j]));
        	bw.newLine();
        }
        bw.flush();
        bw.close();
    } 
}

