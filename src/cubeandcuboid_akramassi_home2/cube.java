/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cubeandcuboid_akramassi_home2;

import java.util.Scanner;

/**
 *
 * @author akramassi
 */
public class cube extends Cuboid {
    
    public cube()
    {
        super();
    }
    public cube(double length)
    {
        super(length,length,length);
    }
    public double getVolume()
    {
        return super.getVolume();
    }
    @Override
    public String toString() {
        return "cube{ length=" +super.getLength()+  ", Volume="+getVolume() + ", Surface=" +
                getSurfaceArea() + ", SideArea="+ getSideArea() + ", BaseArea=" + getBaseArea() + " }";
    }
    public void read()
    {
        Scanner in=new Scanner(System.in);
        double x;
        System.out.print("Please Enetr A Length For cube : ");
        try{
            x=in.nextDouble();
            super.setLength(x);
            super.setHeight(x);
            super.setWidth(x);
        }
        catch(NumberFormatException f)
        {
            System.out.println("please insert number only");
        }
        
    }

    protected void finalize(){}
    
    

    
    
    
 }
