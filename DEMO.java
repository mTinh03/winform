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
public class DEMO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choose, loai;
        HANGDIENMAY dm = null;
        HANGTHUCPHAM tp = null;
        HANGSANHSU ss = null;
        do{
            System.out.println("QUAN LY HANG HOA");
            System.out.println("    1. Nhap loai mat hang.");
            System.out.println("    2. Xuat mat hang.");
            System.out.println("    0. Thoat.");
            System.out.print("  Moi chon menu: ");
            choose = sc.nextInt();
            switch(choose){
                case 1:
                    do{
                        System.out.println("        LOAI MAT HANG");
                        System.out.println("        1.Hang dien may.");
                        System.out.println("        2.Hang thuc pham.");
                        System.out.println("        3. Hang sanh su.");
                        System.out.println("        0. Tro ve");
                        System.out.print("      Moi chon loai mat hang: ");
                        loai = sc.nextInt();
                        if(loai == 1){
                            dm = new HANGDIENMAY();
                            dm.input();
                        }else if(loai == 2){
                            tp = new HANGTHUCPHAM();
                            tp.input();
                        }else if(loai == 3){
                            ss = new HANGSANHSU();
                            ss.input();
                        }else{
                            break;
                        }
                    }while(loai != 0);
                    break;
                case 2:                     
                	do{
                        System.out.println("        XUAT LOAI MAT HANG");
                        System.out.println("        1.Hang dien may.");
                        System.out.println("        2.Hang thuc pham.");
                        System.out.println("        3. Hang sanh su.");
                        System.out.println("        0. Tro ve");
                        System.out.print("      Moi chon loai mat hang: ");
                        loai = sc.nextInt();
                        if(loai == 1){
                            dm.output();
                        }else if(loai == 2){
                            tp.output();
                        }else if(loai == 3){
                            ss.output();
                        }else{
                            break;
                        }
                    }while(loai != 0);
                    break;
                default: 
                	choose = 0;
                	break;
            }
        }while(choose != 0);
    }
}