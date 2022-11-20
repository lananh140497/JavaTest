package org.example;

import java.util.Scanner;

public class Bai3 {
    double canhA;
    double canhB;
    double canhC;
    public void kiemTra(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào cạnh thứ nhất :");
        canhA = sc.nextDouble();
        System.out.println("Nhập vào cạnh thứ hai :");
        canhB = sc.nextDouble();
        System.out.println("Nhập vào cạnh thứ ba :");
        canhC = sc.nextDouble();
        if(canhA+canhB> canhC && canhA +canhC>canhB && canhB+ canhC>canhA){
            System.out.println(" Đây là ba cạnh của một tam giác");
        }else {
            System.out.println(" Đây không phải là ba cạnh của một tam giác");
        }
    }
}