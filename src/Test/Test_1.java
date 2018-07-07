/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;
import bkt02_tranhylinh.HoaDon;
import bkt02_tranhylinh.HoaDonGiaoHang;
import java.util.Scanner;
/**
 *
 * @author 陳国才
 */
public class Test_1 {
     public static void main(String[] args) {
         int n;
        Scanner nhap= new Scanner (System.in);
        
        System.out.println("nhap so luong hoa don: ");
        n= nhap.nextInt();
        HoaDon dshd[]= new HoaDon[n];
        for(int i=0; i<n;i++)
        {
            int chon;
            System.out.println("ban muon nhap hoa don(0) hay nhap hoa don giao hang(1)");
            chon= nhap.nextInt();
            HoaDon hd;
            if(chon==0)
                hd= new HoaDon();
            else 
                hd= new HoaDonGiaoHang();
            hd.nhap();
            dshd[i]= hd;
            
        }
         System.out.println("DANH SACH HOA DON DA NHAP : \n");
        for (int i=0; i<n; i++)
            dshd[i].xuat();
        System.out.println("DANH SACH HOA DON GIAO HANG : \n");
        for (int i=0; i<n; i++)
            if(dshd [i] instanceof HoaDonGiaoHang)
                dshd[i].xuat();
        {
        double tong=0;
        for(int i=0; i<n; i++){
        tong= tong+dshd[i].tinhTongTien();
        }
        System.out.println("TONG = "+tong);
        }
        System.out.println("TONG TIEN MAX :");
         double max=dshd[0].tinhTongTien();
        for(int i=1;i<n;i++){
            
            if(max<dshd[i].tinhTongTien())
                max=dshd[i].tinhTongTien();
        }
        for(int j=0;j<n;j++)
           if(dshd[j].tinhTongTien()==max) 
               dshd[j].xuat();
                
        
        
    }
}


