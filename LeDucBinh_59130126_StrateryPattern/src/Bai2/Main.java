/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;
import java.util.ArrayList;
/**
 *
 * @author GIGABYTE
 */
public class Main {
   public static void main(String[] args) {
   
        ThanhToanOnline thanhToanOnline = new ThanhToanOnline();
        ThanhToanCOD thanhToanCOD = new ThanhToanCOD();

        HangHoa h1 = new HangHoa("Tao", 2200000, "001");
        HangHoa h2 = new HangHoa("Cam", 200000, "002");

        System.out.println("Danh sach mat hang thanh toan online:\t");
        GioHang gh = new GioHang();
        gh.setHinhthucTT(thanhToanOnline);
        gh.them(h1);
        gh.them(h2);
        gh.inDS();
        System.out.println("Thanh toan online: \t"  + gh.thanhToan());

        System.out.println("Danh sach mat hang thanh toan COD:\t");
        GioHang gh1 = new GioHang();
        gh1.setHinhthucTT(thanhToanCOD);
        gh1.them(h1);
        gh1.them(h2);
        gh1.inDS();
        System.out.println("Thanh toan COD: \t" + gh1.thanhToan());
    }
}
