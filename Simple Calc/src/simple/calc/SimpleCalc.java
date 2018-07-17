/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple.calc;

/**
 *
 * @author gory
 */
public class SimpleCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        another z = new another(8,4);
        
        System.out.println(z.Sub());
        z.setx(6);
        int result = z.Add();
        System.out.println(result);
        result = z.mul();
        System.out.println(result);
        z.sety(0);
        result = z.div();
        System.out.println(result);
    }
    
}
