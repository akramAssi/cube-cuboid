/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cubeandcuboid_akramassi_home2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

/**
 *
 * @author akramassi
 */
public class list {
    private ArrayList lis;
    
    public list()
    {
        this.lis=new ArrayList<Cuboid>();
    }
    public void insert()
    {
        Scanner in = new Scanner(System.in);
        String s;
        System.out.println("Note:You can insert a shape unless you type 'exit' to Stop insert ( ex -> exit)");
        System.out.println("enter length ,width,height to insert cuboid\n ex -> 10,20,30");
        System.out.println("enter length to insert cube\n ex -> 10");
        while(true)
        {
            System.out.print("\nenter : ");
            s=in.next();
            String[] x = s.split(",");
            if(x.length==3)
            { try{
                boolean flag=true;
                for(int i=1; i<x.length; i++){
                    if(!x[0].equalsIgnoreCase(x[i])){
                        flag= false;
                    }
                }
                        System.out.println(flag);
                if(!flag)
                    lis.add(new Cuboid(Double.parseDouble(x[0]),Double.parseDouble(x[1]),Double.parseDouble(x[2])));
                else
                    lis.add(new cube(Double.parseDouble(x[0])));
            } catch (NumberFormatException nfe) {
                       System.out.println("please insert number only");
                    }
            }
            else if (x.length==1 && x[0].equalsIgnoreCase("exit") == false)
            {
                try {
                        lis.add(new cube(Double.parseDouble(x[0])));
                    } catch (NumberFormatException nfe) {
                       System.out.println("please insert number only");
                    }
            }
            else if (x.length==1 && x[0].equalsIgnoreCase("exit"))
            {
                break;
            }
            else{
                System.out.println("\n\nplease enter length ,width,height to insert cuboid\n ex -> 10,20,30");
                System.out.println("please enter length to insert cube\n ex -> 10");
                System.out.println("please enter exit to end insert \n ex exit");
            }
            
        }
    }
    public boolean isEmpty()
    {
        return lis.size()<=0;
    }
    
    public void print()
    {
        for(Object l : lis )
        {
            System.out.println(l);
        }
    }
    
    public double avg()
    {
        double sum=0;
        
        for(int i=0 ; i<lis.size();i++)
        {
            Cuboid f=(Cuboid)lis.get(i);
            sum+=f.getVolume();
        }
        return sum/lis.size() ;
    }
    
    public Cuboid max()
    {
        Cuboid max=(Cuboid)lis.get(0);
//        double max= ff.getVolume();
        for(Object item:lis)
        {
            Cuboid f=(Cuboid)item;
            if(f.getVolume()>max.getVolume())
                max=f;
        }
        return max;
    }
    public Cuboid min()
    {
        Cuboid min=(Cuboid)lis.get(0);
        for(Object item:lis)
        {
            Cuboid f=(Cuboid)item;
            if(f.getVolume()<min.getVolume())
                min=f;
        }
        return min;
    }
    
    public void sort() {         
    Collections.sort(lis);             
  } 
}
