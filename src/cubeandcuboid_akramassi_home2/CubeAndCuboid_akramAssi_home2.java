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
public class CubeAndCuboid_akramAssi_home2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        list l = new list();
        
        while(true)
        {
            
            int ch=-1;
            System.out.println(
                      "1) insert cubes and cuboids.\n"
                    + "2)Display all shape.\n"
                    + "3) find shape have  max volume.\n"
                    + "4) find shape have  min volume.\n"
                    + "5) sort the list in ascending order.\n"
                    + "6) Compute  the average volume for all cubes and cuboids.\n"
                    + "0) Exit.");
           System.out.println("enter number from 1 to 6");
            while(true)
            {
                Scanner in =new Scanner(System.in);
                try
                {
                    ch=in.nextInt();
                    if(ch<0||ch>6)
                        throw new Exception("my error");
                    break;
                }
                catch(Exception f)
                {
                    System.out.println("Please enter a number only from 1 to 6");
                }
            }
            switch(ch)
                {
                    case 0:System.exit(0);
                    case 1:{l.insert(); break;}
                    case 2:{
                        if(l.isEmpty())
                        {
                            System.out.println("------------------");
                            System.out.println("|please enter shape|");
                            System.out.println("------------------");
                            break;
                        }
                        l.print();
                        System.out.println("----------------------------------------------");
                        break;
                    }
                    case 3:{
                         if(l.isEmpty())
                        {
                            System.out.println("------------------");
                            System.out.println("|please enter shape|");
                            System.out.println("------------------");
                            break;
                        }
                        System.out.println("the max volume = "+l.max().getVolume());
                        System.out.println(l.max());
                        System.out.println("----------------------------------------------");
                        break;
                    }
                    case 4:{
                        if(l.isEmpty())
                        {
                            System.out.println("------------------");
                            System.out.println("|please enter shape|");
                            System.out.println("------------------");
                            break;
                        }
                        System.out.println("the min volume = "+l.min().getVolume());
                        System.out.println(l.min());
                        System.out.println("----------------------------------------------");
                        break;
                    }
                    case 5:{
                         if(l.isEmpty())
                        {
                            System.out.println("------------------");
                            System.out.println("|please enter shape|");
                            System.out.println("------------------");
                            break;
                        }
                        l.sort();
                        l.print();
                        System.out.println("----------------------------------------------");
                        break;}
                    case 6:{
                         if(l.isEmpty())
                        {
                            System.out.println("------------------");
                            System.out.println("|please enter shape|");
                            System.out.println("------------------");
                            break;
                        }
                        System.out.println("the average volume = "+l.avg());
                        System.out.println("----------------------------------------------");
                        break;
                    }
                }
            
        }
        
    }
    
}
