package org.example;

import java.util.Scanner;

public class Bai6 {
    public void kiemTra(){
        String chuoi;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi : ");
        chuoi = sc.nextLine();
        System.out.print("Nhập vào một kí tự : ");
        char kiTu = sc.next().charAt(0);
        int dem =0;
        for (int i =0; i< chuoi.length();i++){
            if(chuoi.charAt(i) == kiTu){
                dem++;
                break;
            }
        }
        if(dem>0){
            System.out.print("Có");
        } else {
            System.out.print("Không");
        }
    }
}