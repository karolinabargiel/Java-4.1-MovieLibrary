package org.example;

import java.util.Scanner;

public class ScannerUtil {
    public static String getStringFromUser() {
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    public static int getIntFromUser() {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

}
