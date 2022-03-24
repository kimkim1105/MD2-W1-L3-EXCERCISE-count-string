package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một chuối");
        String str;
        str = scanner.nextLine();
        System.out.println("Nhập vào một ký tự");
//        char kyTu = scanner.nextLine().charAt(0);
        char kyTu = scanner.next().charAt(1);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == kyTu) {
                count++;
            }
        }

        System.out.println("Số lần xuất hiện của ký tự " + kyTu +
                " trong chuỗi " + str + " = " + count);
    }
}
