package tenDayOfStatistic;

import java.io.*;
import java.util.*;

public class DayZero_Weighted {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int X[] = new int[n];
		int W[] = new int[n];
		// input X[]
		double sumW = 0, sumXW = 0;
		for (int i = 0; i < n; i++) {
			X[i] = sc.nextInt();
		}
		// input W[]
		// sc.nextLine();
		for (int i = 0; i < n; i++) {
			W[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			sumW += W[i];
			sumXW += X[i] * W[i];
		}
		// System.out.println("\n"+sumW);
		// System.out.println(""+sumXW);
		double mW = sumXW / sumW;
//		System.out.println(sumXW / sumW);
		System.out.println((double)Math.round(mW*10)/10);
	}
}