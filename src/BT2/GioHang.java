/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class GioHang {
    IThanhToan hinhThucTT;
    ArrayList<HangHoa> listHH = new ArrayList<>();
//    Thêm hàng hóa vào danh sách
    public int themHH(HangHoa hang){
        listHH.add(hang);
        return 1;
    }
//    tính tổng số tiền hàng trong danh sách
    public int tienHang(){
        int tienHang = 0;
        for(int i = 0; i < listHH.size(); i++){
            tienHang += listHH.get(i).getGia();
        }
        return tienHang;
    }
//    Chọn hình thức thanh toán
    public void sethinhThucTT(IThanhToan hinhThucTT){
        this.hinhThucTT = hinhThucTT;
    }
//    tiến hành thanh toán
    public double thanhToan(){
        return hinhThucTT.thanhToan(tienHang());
    }
    
//    in danh sách và tiền trả
    public String inDS(){
        int tong = 0;
        String sanPham = "";
        for(int i = 0; i < listHH.size(); i++){
            tong++;
            HangHoa hangHoa = listHH.get(i);
            sanPham += "Tên mặc hàng: "+hangHoa.getTenHH()+"\t\t\t"+
                    "Mô tả: "+hangHoa.getMoTa()+"\t\t\t"+
                    "Giá: "+hangHoa.getGia()+"\n";
        }
        return sanPham +
                "Số lượng sản phẩm: "+tong +"\n"+
                "Số tiền phải trả: "+thanhToan();
    }
}
