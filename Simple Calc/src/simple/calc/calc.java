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
public class calc 
{
    private int x;
    private int y;
    
    public calc()
    {
        this.x=0;
        this.y=0;
    }
  
    public calc(int a,int b)
    {
        this.x=a;
        this.y=b;
    }
    public int Add()
    {
       return this.x+this.y;
    }
    public int Sub()
    {
        return this.x-this.y;
    }
    public void setx(int a)
    {
        this.x=a;
    }
    public void sety(int b)
    {
        this.y=b;
    }
    public int getx()
    {
        return this.x;
    }
    public int gety()
    {
        return this.y;
    }
    
}
