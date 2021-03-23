package tenDayOfStatistic;
import java.io.*;
import java.util.*;

public class DayOne_StandardDeviation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int x[] = new int[N];
		for (int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
		}
		int sum=0;
		double tb;
		float SD=0;
		for (int i = 0; i <N; i++) {
			sum+=x[i];
		}
		tb = sum/N;
		for (int i = 0; i < N; i++) {
			SD += ((x[i]-tb)*(x[i]-tb)/N);
		}
		SD = (float) Math.sqrt(SD);
		//System.out.println(tb);
		System.out.println(SD);
	}
}
