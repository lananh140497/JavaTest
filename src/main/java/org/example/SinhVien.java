package org.example;

public class SinhVien {
    private String maSinhVien;
    private String hoTen;
    private double diemLyThuyet;
    private double diemThucHanh;
    public SinhVien(String maSinhVien, String hoTen, double diemLyThuyet, double diemThucHanh){
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.diemLyThuyet = diemLyThuyet;
        this.diemThucHanh = diemThucHanh;
    }
    public double tinhDiem(){
        return (diemLyThuyet+ diemThucHanh)/2;
    }
    public void xepLoai(){
        String loai="";
        double diemTB = tinhDiem();
        if(diemTB<5){
            loai = "Trung Bình";
        }
        if(diemTB>= 5&&diemTB<7.9){
            loai = "Khá";
        }
        if(diemTB>= 8&&diemTB<=10){
            loai = "Giỏi";
        }
        System.out.println("Mã SV: "+maSinhVien+" - "+ "Họ tên: "+ hoTen+ " - "+ "ĐTB: "+ tinhDiem()+ " - "+"Xếp loại: "+ loai);
    }
}
