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
public class BasicPLan implements PlanEnsambler {

    CPU plan;
    
    public BasicPLan()
    {
        plan=new CPU();
    }
    
    @Override
    public void buildPlan() {
        
    }

    @Override
    public int getPrice() {
        return 500;
    }
    
}
