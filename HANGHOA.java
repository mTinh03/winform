package BTHANGHOA;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class HANGHOA {

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public String getNhaSX() {
        return nhaSX;
    }

    public void setNhaSX(String nhaSX) {
        this.nhaSX = nhaSX;
    }

    public HANGHOA(String maHang, String tenHang, double giaBan, String nhaSX) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.giaBan = giaBan;
        this.nhaSX = nhaSX;
    }
    
    public HANGHOA() {
        maHang = "";
        tenHang = "";
        giaBan = 0;
        nhaSX = "";
    }
    
    protected String maHang, tenHang;
    protected double giaBan;
    protected String nhaSX;
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma hang: ");
        maHang = sc.nextLine();
        System.out.print("Nhap ten hang: ");
        tenHang = sc.nextLine();
        System.out.print("Nhap nha san xuat: ");
        nhaSX = sc.nextLine();
        System.out.print("Nhap gia ban: ");
        giaBan = sc.nextDouble();
        
    }
    public void output(){
        System.out.print("MaHang: " + maHang + "\t\tTenHang: " + tenHang + "\t\tGiaBan: " + giaBan +"\t\tNSX: " + nhaSX);
    }
    
    
}
