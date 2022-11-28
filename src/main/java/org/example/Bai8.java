package org.example;

import java.util.Scanner;

public class Bai8 {
    public boolean kiemtra(int a[], int n, int x) {
        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                return false;
            }
            if (i == n - 1) {
                return true;
            }
        }
        return false;
    }

    public void sapXep(int a[], int n) {
        int t;
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++) {
                if (a[j] > a[i]) {
                    t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
    }

    public void inMang(int a[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\n");
    }

    public void nhapMang(int a[], int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
    }

    public void timGiaTriChung(int a[], int b[], int n) {
        int mangchung[] = new int[100];
        int vitri = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                if (a[i] == b[j] && kiemtra(mangchung, n, a[i])) {
                    mangchung[vitri] = a[i];
                    vitri++;
                }
            }
        if (vitri == 0) {
            System.out.println("Không có giá trị chung nào");

        } else {
            System.out.println("Các trị chung của 2 mảng là: ");
            inMang(mangchung, vitri);
        }

    }

    public void bai8() {
        int n;
        int mang1[] = new int[100];
        int mang2[] = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n: ");
        n = sc.nextInt();
        System.out.println("Nhập " + n + " phần tử của mảng thứ nhất:");
        nhapMang(mang1, n);
        System.out.println("Nhập " + n + " phần tử của mảng thứ hai:");
        nhapMang(mang2, n);
        sapXep(mang1, n);
        sapXep(mang2, n);
        System.out.println("Mảng thứ nhất sau khi sắp xếp tăng dần: ");
        inMang(mang1, n);
        System.out.println("Mảng thứ hai sau khi sắp xếp tăng dần: ");
        inMang(mang2, n);
        timGiaTriChung(mang1, mang2, n);

    }
}



