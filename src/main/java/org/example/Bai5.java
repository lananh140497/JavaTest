package org.example;

import java.util.Scanner;

public class Bai5 {
    public void timMax () {
        //Bai 1
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập vào số các số : ");
        int x = input.nextInt();
        int max=0;
        int y;
        int i = 1;
        while (i <=x) {
            y= input.nextInt();
            if (y>=0){
                if (y>max){
                    max=y;
                    i++;}
                else{ i++;}
            }else {
                System.out.print("Nhập lại : ");
            }
        }

        System.out.print("Max là: "+ max);
    }


}
