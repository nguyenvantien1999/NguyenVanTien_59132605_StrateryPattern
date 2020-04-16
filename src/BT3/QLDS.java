/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author admin
 */
public class QLDS {
    ISoSanh<SinhVien> soSanhSV;
    
    ArrayList<SinhVien> listSinhVien = new ArrayList<>();
    
    public int them(SinhVien sv){
        listSinhVien.add(sv);
        return 1;
    }
    public void setHinhThucSS(ISoSanh<SinhVien> soSanhSV){
        this.soSanhSV = soSanhSV;
    }
    public void sapXep(){
        Collections.sort(listSinhVien, soSanhSV::soSanh);
    }
    public void inDS(){
        for(int i = 0; i < listSinhVien.size(); i++){
            System.out.println("Sinh viên thứ: "+(i+1));
            System.out.println(listSinhVien.get(i).inThongTinSV());
            System.out.println("---------------------");
        }
    }
    
}
