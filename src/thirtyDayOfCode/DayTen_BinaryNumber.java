package thirtyDayOfCode;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DayTen_BinaryNumber {
// print max string 1  consecutive when convert base-10 to base-2
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		int s=0,count=0,reminder =0;
		while (n>0) {
			reminder = n%2;
			n=n/2;
			if (reminder==1) {
				s=s+1;
				if (count<s) {
					count=s;
				}
			}else {
				s=0;
			}
		}
		System.out.println(count);
		scanner.close();
	}
}
	