/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2;

/**
 *
 * @author admin
 */
public class main {
    public static void main(String[] args) {
        GioHang gioHang = new GioHang();
        HangHoa hang = new HangHoa("honda verza 150cc", "xe máy", 5000000);
        HangHoa hang1 = new HangHoa("Kiếm nhật", "vũ khí", 2000000);
        HangHoa hang2 = new HangHoa("Ba lô", "vật dụng", 1000000);
        gioHang.themHH(hang);
        gioHang.themHH(hang1);
        gioHang.themHH(hang2);
        gioHang.sethinhThucTT(new ThanhToanOnline());
        
        GioHang gioHang1 = new GioHang();
        HangHoa hang3 = new HangHoa("Búp bê", "đồ chơi", 1000000);
        HangHoa hang4 = new HangHoa("Sữa", "Thực phẩm", 500000);
        HangHoa hang5 = new HangHoa("Áo đầm", "trang phục", 2000000);
        gioHang1.themHH(hang3);
        gioHang1.themHH(hang4);
        gioHang1.themHH(hang5);
        gioHang1.sethinhThucTT(new ThanhToanCOD());
        
        System.out.println("---Giỏ hàng 1 thanh toán Oline---");
        System.out.println(gioHang.inDS());
        
        System.out.println("\n---Giỏ hàng 2 thanh toán COD---");
        System.out.println(gioHang1.inDS());
    }
}
