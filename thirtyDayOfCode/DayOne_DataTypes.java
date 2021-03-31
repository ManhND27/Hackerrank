package thirtyDayOfCode;

import java.util.Scanner;

public class DayOne_DataTypes {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        double b = scan.nextDouble();
        //doc mot dong trong java can 
       // scan.nextLine();
        String c = scan.nextLine();
        System.out.println(i+a);
        System.out.println(d+b);
        System.out.println(s+c);

        scan.close();
    }

}
