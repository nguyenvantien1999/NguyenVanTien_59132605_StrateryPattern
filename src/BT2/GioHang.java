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
    
    public int themHH(HangHoa hang){
        listHH.add(hang);
        return 1;
    }
    
    public void sethinhThucTT(IThanhToan hinhThucTT){
        this.hinhThucTT = hinhThucTT;
    }
    public double thanhToan(){
        return 0;
    }
}
