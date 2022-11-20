package org.example;

import java.util.Scanner;

public class Bai7 {
    public void demKiTu() {
        String chuoi;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi : ");
        chuoi = sc.nextLine();
        int dem =0;
        for (int i =0; i< chuoi.length();i++){
            if('a' == chuoi.charAt(i)){
                dem++;
            }
        }
        System.out.print("Kí tự a xuất hiện trong chuỗi: "+ dem + " lần");
    }
}