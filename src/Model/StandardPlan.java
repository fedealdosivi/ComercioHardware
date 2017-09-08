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
public class StandardPlan implements PlanEnsambler{

    CPU plan;
    
    @Override
    public void buildPlan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getPrice() {
      return 1200;
    }
    
}
