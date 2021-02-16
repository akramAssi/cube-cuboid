/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cubeandcuboid_akramassi_home2;

/**
 *
 * @author Assi_workstation
 */
public class  Cuboid <type>{
    private type length;
    private type width;
    private type height;

    public Cuboid(type length, type width, type height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public type getLength() {
        return length;
    }

    public void setLength(type length) {
        this.length = length;
    }

    public type getWidth() {
        return width;
    }

    public void setWidth(type width) {
        this.width = width;
    }

    public type getHeight() {
        return height;
    }

    public void setHeight(type height) {
        this.height = height;
    }
    
    

    @Override
    public String toString() {
        return "Cuboid{" + "length=" + length + ", width=" + width + ", height=" + height + '}';
    }
    
    
  
}
