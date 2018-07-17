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
public class another extends calc
{
    public another()
    {
        super();
    }
    public another(int a , int b)
    {
        super(a,b);
    }
    
    public int mul()
    {
     return this.getx()*this.gety() ;
    }
    public int div()
    {
        int y =this.gety();
        if(y==0)
            return 0;
        else return this.getx()/y; 
    }
}
