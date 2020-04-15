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
public class ThanhToanOnline implements IThanhToan{

    @Override
    public double thanhToan(int tienHang) {
        if(tienHang < 1000000)
            tienHang -= 5 * tienHang/100;
        else
            tienHang -= 7 * tienHang/100;
        return tienHang;
    }
    
}
