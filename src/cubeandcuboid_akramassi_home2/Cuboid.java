/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cubeandcuboid_akramassi_home2;
import java.util.Scanner;

/**
 *
 * @author Assi_workstation
 */
public class  Cuboid implements Comparable<Cuboid> {
    private double length;
    private double width;
    private double height;
    
   
    public Cuboid() {
        this.length = 0;
        this.width = 0;
        this.height = 0;
    }

    public Cuboid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume()
    {
        return getHeight()*getWidth()*getLength();
    }
    public double getSurfaceArea()
    {
           return  2*(getLength()*getHeight()+getLength()*getWidth()+getWidth()*getHeight());
    }
    public double getBaseArea()
    {
        return getWidth()*getLength();
    }
    public double getSideArea()
    {
        return getSurfaceArea()-2*getBaseArea();
    }
    protected void finalize(){}
    @Override
    public String toString() {
        return "Cuboid{ " + "length=" + length + ", width=" + width + ", height=" + height+ ", Volume="+
                getVolume() + ", Surface=" + getSurfaceArea() + ", SideArea="+ getSideArea() + ", BaseArea=" + getBaseArea() + " }";
    }
    public void write (){
        System.out.println(this);
    }
    public void read(){
        try{
        Scanner in=new Scanner(System.in);
        System.out.print("Please Enetr A Length For Cuboid : ");
        this.setLength(in.nextDouble());
        System.out.print("Please Enetr A Height For Cuboid : ");
        this.setHeight(in.nextDouble());
        System.out.print("Please Enetr A Width For Cuboid : ");
        this.setWidth(in.nextDouble());
        }
        catch(NumberFormatException f)
        {
            System.out.println("please insert number only");
        }
    }
    
    @Override
     public int compareTo(Cuboid candidate) {
         return (this.getVolume() < candidate.getVolume() ? -1 :
                 (this.getVolume() == candidate.getVolume() ? 0 : 1));
     }    
    
    
  
}
