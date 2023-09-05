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
public class HANGTHUCPHAM extends HANGHOA{
    private String ngaySanXuat;
    private String hanSuDung;
    public HANGTHUCPHAM(){
        super();
        this.ngaySanXuat = "";
        this.hanSuDung = "";
    }
    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ngay san xuat: ");
        ngaySanXuat = sc.nextLine();
        System.out.print("Nhap han su dung: ");
        hanSuDung = sc.nextLine();
    }
    public void output(){
        super.output();
        System.out.println("\t\tNSX: " + ngaySanXuat + "\t\tHSD: " + hanSuDung );
    }
}