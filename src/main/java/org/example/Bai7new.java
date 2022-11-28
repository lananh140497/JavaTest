package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai7new {
    public String inHoa(String s) {
        char a[] = s.toCharArray();
        for (int i = 0; i < s.length(); i++)
            if (a[i] >= 97 && a[i] <= 122) {
                a[i] -= 32;
            }
        String str = String.valueOf(a);
        return str;
    }

    public String dao(String s) {
        char t;
        char a[] = s.toCharArray();
        for (int i = 0; i < s.length() / 2; i++) {
            t = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = t;
        }
        String str = String.valueOf(a);
        return str;
    }

    public String daoChuoi(String s) {
        String str = "";
        String a[] = s.split(" ");
        for (String x : a) {
            str = str + dao(x)+ " ";
        }
        return str;
    }

    public boolean kiemtra(List <Character> list, char a) {
        for (char x : list) {
            if (a == x) {
                return false;
            }
        }
        return true;
    }

    public void demKiTu(String s) {
        char a[] = s.toCharArray();
        int dem = 1;
        int i;
        List <Character> listKiTuKhacNhau = new ArrayList<>();
        for (i = 0; i < a.length; i++) {
            if(kiemtra(listKiTuKhacNhau,a[i])){
                listKiTuKhacNhau.add(a[i]);
                List <Character> listKiTuGiongNhau = new ArrayList<>();
                for (int j = 0; j<a.length; j++){
                    if(a[i]==a[j]){
                        listKiTuGiongNhau.add(a[j]);
                    }
                }
                System.out.println(listKiTuGiongNhau.get(0)+ " : "+ listKiTuGiongNhau.size());
            }

        }
    }
    public void bai7() {
        String chuoi1;
        String chuoi2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi 1");
        chuoi1 = sc.nextLine();
        System.out.println("Nhập chuỗi 2");
        chuoi2 = sc.nextLine();
        System.out.println("Chuỗi 1 sau khi in hoa là: "+ inHoa(chuoi1));
        System.out.println("Chuỗi 2 sau khi in hoa là: "+ inHoa(chuoi2));
        System.out.println("Chuỗi 1 sau khi đảo là: "+ daoChuoi(chuoi1));
        System.out.println("Số lần xuất hiện của các kí tự trong chuỗi 2 là");
        demKiTu(chuoi2);
    }
}
