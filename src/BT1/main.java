/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

/**
 *
 * @author admin
 */
public class main {
    
    public static void main(String[] args) {
        
        Context tinhToan = new  Context();
        
        tinhToan.setTinhToan(new Cong());
        System.out.println("75 + 12 = "+tinhToan.tinh(75,12));     
        
        tinhToan.setTinhToan(new Tru());
        System.out.println("54 - 78 = "+tinhToan.tinh(54, 78));
        
        tinhToan.setTinhToan(new Nhan());
        System.out.println("5 * 10 = "+tinhToan.tinh(5, 10));
        
        tinhToan.setTinhToan(new Chia());
        System.out.println("500/0 = "+tinhToan.tinh(500, 0));
        
    }
}
