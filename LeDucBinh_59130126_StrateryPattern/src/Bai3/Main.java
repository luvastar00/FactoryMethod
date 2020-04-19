/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author GIGABYTE
 */
public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat fd = new SimpleDateFormat("dd/MM/yyyy");
        QLSV qlsv = new QLSV();
        SinhVien sv1 = new SinhVien("Tran Van A", fd.parse("03/01/1999"), 8);
        SinhVien sv2 = new SinhVien("Tran Van B", fd.parse("01/01/1999"), 6);
        SinhVien sv3 = new SinhVien("Tran Van C", fd.parse("13/11/1999"), 10);
        SinhVien sv4 = new SinhVien("Tran Van D", fd.parse("23/03/1999"), 9);
        

 
        qlsv.them(sv1);
        qlsv.them(sv2);
        qlsv.them(sv3);
        qlsv.them(sv4);
        


        qlsv.setSoSanh(new SoSanhTheoTen());
        qlsv.sapXep();
        System.out.println("Danh Sach Sinh Vien Sap xep theo ten : ");
        qlsv.inDS();

   
        qlsv.setSoSanh(new SoSanhTheoDiem());
        qlsv.sapXep();
        System.out.println("Danh Sach Sinh Vien Sap xep theo diem : ");
        qlsv.inDS();
    }

    
}
