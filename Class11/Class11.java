package Java14;

import java.io.*;

public class Class11 {

	public static void main(String[] args) throws IOException {
		String str;
		int count = 1;
		FileInputStream fi = new FileInputStream("number.txt");
		byte[] data = new byte[fi.available()];
		fi.read(data);
		str = new String(data);
		System.out.println(str);
		char[] data2 = str.toCharArray();
		for (int i = 0; i < data2.length; i++) {
			if (data2[i] == '\n') {
				count++;
			}
		}
		System.out.println(count + " lines read");
		fi.close();
	}
}
