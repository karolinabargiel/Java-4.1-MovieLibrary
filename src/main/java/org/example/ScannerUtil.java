package org.example;

import java.util.Scanner;

public class ScannerUtil {
    public static String getDataFromUserString() {
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    public static int getDataFromUserInt() {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

}
