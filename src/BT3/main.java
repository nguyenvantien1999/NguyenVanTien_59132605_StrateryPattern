/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author admin
 */
public class main {
    public static void main(String[] args) throws ParseException {
        QLDS dsSV = new QLDS();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
   
        SinhVien sv = new SinhVien("Nguyễn Văn A", formatter.parse("22/08/1999"), (float) 9.5);
        SinhVien sv1 = new SinhVien("Nguyễn Văn C", formatter.parse("25/08/1999"), (float) 10);
        SinhVien sv2 = new SinhVien("Nguyễn Văn B", formatter.parse("02/08/1997"), (float) 6.5);
        
        dsSV.them(sv);
        dsSV.them(sv1);
        dsSV.them(sv2);
        
        System.out.println("----Sắp xếp danh sách theo tên----");
        dsSV.setHinhThucSS(new SoSanhTheoTen());
        dsSV.sapXep();
        dsSV.inDS();
        
        System.out.println("----Sắp xếp danh sách theo điểm----");
        dsSV.setHinhThucSS(new SoSanhTheoDiem());
        dsSV.sapXep();
        dsSV.inDS();
        
    }
}
