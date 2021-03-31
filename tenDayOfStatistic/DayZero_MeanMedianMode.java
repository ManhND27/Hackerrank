package tenDayOfStatistic;

import java.io.*;
import java.util.*;

public class DayZero_MeanMedianMode {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}
		double double_mean, double_median = 0;
		int int_mode;
		double_mean = (double) sum / n;
		System.out.println(double_mean);
		Arrays.sort(a);
		if (n % 2 == 0) {
			double_median = (a[n / 2 - 1] + a[n / 2]) / 2.0;
		} else {
			double_median = a[n / 2];
		}
		System.out.println(double_median);

		int maxCount = 0, mode = 0;
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}
			if (maxCount < count) {
				maxCount = count;
				mode = a[i];
			}
		}
		System.out.println(mode);
	}
}
