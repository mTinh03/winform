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
public class HANGDIENMAY extends HANGHOA {
    private int thoiGianBH;
    private int dienAp;
    private int congSuat;
    public HANGDIENMAY(){
        super();
        this.thoiGianBH = 0;
        this.dienAp = 0;
        this.congSuat = 0;
    }
    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap thoi gian bao hanh: ");
        thoiGianBH = sc.nextInt();
        System.out.print("Nhap dien ap: ");
        dienAp = sc.nextInt();
        System.out.print("Nhap cong suat: ");
        congSuat = sc.nextInt();
    }
    public void output(){
        super.output();
        System.out.println("\t\tTGBH: " + thoiGianBH + "\t\tDienAp: " + dienAp + "\t\tCongSuat: " + congSuat);
    }
}