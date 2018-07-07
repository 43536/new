/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkt02_tranhylinh;

import java.util.Scanner;

/**
 *
 * @author 陳国才
 */
public class HoaDonGiaoHang extends HoaDon{
    private String DiaChi;
    private float kc;
    private float time;

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public float getKc() {
        return kc;
    }

    public void setKc(float kc) {
        this.kc = kc;
    }

    public float getTime() {
        return time;
    }

    public void setTime(float time) {
        this.time = time;
    }

    public HoaDonGiaoHang(String DiaChi, float kc, float time, String ma, String ngaylap, String nguoiban, String nguoiMua, String tensp, int sl, double dg) {
        super(ma, ngaylap, nguoiban, nguoiMua, tensp, sl, dg);
        this.DiaChi = DiaChi;
        this.kc = kc;
        this.time = time;
    }
    
    public HoaDonGiaoHang() {
        this.DiaChi="Q.TanPhu";
        this.kc= 20;
        this.time=24;
    }
    
     public double tinhPhiGiao(){
       
        if(time<24)
        {
            if(kc<10)
              return sl*20*kc;
            else
                return 18*sl*kc;                           
        }
        else
            return 150000;       
    }

    @Override
    public void xuat() {
        super.xuat(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        String s="HoaDonGiaoHang("+ super.toString().substring(6);
    s=s.substring(0,s.length()-1)+",phiGiao="+tinhPhiGiao()+')';
    return s;
    }

    @Override
    public void nhap() {
        super.nhap(); //To change body of generated methods, choose Tools | Templates.
        Scanner nhap= new Scanner(System.in);
        System.out.println("nhap dia chi: ");
        DiaChi= nhap.nextLine();
        System.out.println("nhap khoang cach: ");
        kc= nhap.nextFloat();
        System.out.println("nhap thoi gian giao hang: ");
        time= nhap.nextFloat();
    }

    @Override
    public double tinhThanhTien() {
        return super.tinhThanhTien()+tinhPhiGiao(); //To change body of generated methods, choose Tools | Templates.
    }
     
     
}
