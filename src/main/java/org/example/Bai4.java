package org.example;

import java.util.Scanner;

public class Bai4 {
    int n;
    public void tinhTongSoChan(){
        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một số nguyên dương: ");
        while (i<1){
            n= sc.nextInt();
            if(n < 0){
                System.out.println("Nhập lại: ");
            }else {
                int tongChan =0;
                for(int j = 0; j<=n; j++){
                    if (j%2==0){
                        tongChan = tongChan + j;
                    }
                }

                System.out.println("Tổng các số chẵn là: "+ tongChan );
                i++;
            }
        }

    }
}
