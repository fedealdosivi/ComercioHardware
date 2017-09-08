/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author fede
 */
public abstract class CPUDecorator extends CPUAbs {

    @Override
    public void setTotalPrice(int totalPrice) {
        super.setTotalPrice(totalPrice); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getTotalPrice() {
        return super.getTotalPrice(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
