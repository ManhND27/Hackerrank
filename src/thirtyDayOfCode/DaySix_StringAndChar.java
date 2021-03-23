package thirtyDayOfCode;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DaySix_StringAndChar {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
        	String myString_i = sc.next();
        	String x_i="",y_i="";
        	char[] myCharArray_i = myString_i.toCharArray();
        	for (int j = 0; j < myCharArray_i.length; j++) {
        		if (j%2==0) {
					x_i=x_i+myCharArray_i[j];
				}else y_i=y_i+myCharArray_i[j];
			}
        	  System.out.print(x_i+" "+y_i+"\n");
        }
    }
}	
