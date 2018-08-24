/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casiofx9000;

import Equations.PTBac1;
import Equations.PTBac2;
import Equations.PTBac3;
import Equations.PTBac4;
import java.util.Scanner;

/**
 *
 * @author Anlu
 */
public class CasioFX9000 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 1;
        while(i != 5){
            System.out.println("|---------------CASIO FX 1000000000000000---------------|");
            System.out.println("|-- Nhap Lua Chon:                                      |");
            System.out.println("| 1: Giai Phuong Trinh                                  |");
            System.out.println("| 2: Matrix                                             |");
            System.out.println("| 3: vector                                             |");
            System.out.println("| 4: coming soon                                        |");
            System.out.println("| 5: exit                                               |");
            System.out.println("|-------------------------------------------------------|");
            System.out.print("Lua Chon: ");
            i = new Scanner(System.in).nextInt();
            switch(i){
                case 1: {
                    giaiPT();
                    break;
                }
            }
        }
    }
    // mode Giai PT:
    public static void giaiPT(){
        int i = 1;
        while(i != 5){
            System.out.println("|--------------------Equation Sloving-------------------|");
            System.out.println("|-- Nhap Lua Chon:                                      |");
            System.out.println("| 1: Giai Phuong Trinh Bac 1                            |");
            System.out.println("| 2: Giai Phuong Trinh bac 2                            |");
            System.out.println("| 3: Giai Phuong Trinh bac 3                            |");
            System.out.println("| 4: Giai Phuong Trinh bac 4                            |");
            System.out.println("| 5: exit                                               |");
            System.out.println("|-------------------------------------------------------|");
            System.out.print("Lua Chon: ");
            i = new Scanner(System.in).nextInt();
            switch(i){
                case 1:{
                    float a;
                    float b;
                    System.out.println("---- PT bac 1: ax + b = 0 ----");
                    System.out.print("Enter a: ");
                    a = new Scanner(System.in).nextFloat();
                    System.out.print("Enter b: ");
                    b = new Scanner(System.in).nextFloat();
                    PTBac1 p1 = new PTBac1(a, b);
                    System.out.println("Result: ");
                    p1.solve();
                    break;
                }
                case 2:{
                    float a;
                    float b;
                    float c;
                    System.out.println("---- PT bac 2: ax^2 + bx + c = 0 ----");
                    System.out.print("Enter a: ");
                    a = new Scanner(System.in).nextFloat();
                    
                    System.out.print("Enter b: ");
                    b = new Scanner(System.in).nextFloat();
                    
                    System.out.print("Enter c: ");
                    c = new Scanner(System.in).nextFloat();
                    
                    PTBac2 p2 = new PTBac2(a, b, c);
                    System.out.println("Result:");
                    p2.solve();
                    break;
                    
                }
                case 3:{
                    float a;
                    float b;
                    float c;
                    float d;
                    System.out.println("--------PT bac 3: ax^3 + bx^2 + cx + d = 0-----------");
                    System.out.print("Enter a: ");
                    a = new Scanner(System.in).nextFloat();
                    System.out.print("Enter b: ");
                    b = new Scanner(System.in).nextFloat();
                    System.out.print("Enter c: ");
                    c = new Scanner(System.in).nextFloat();
                    System.out.print("Enter d: ");
                    d = new Scanner(System.in).nextFloat();
                    PTBac3 p3 = new PTBac3(a, b, c, d);
                    System.out.println("Result: ");
                    p3.solve();
                    break;
                }
                case 4:{
                    float a;
                    float b;
                    float c;
                    float d;
                    float e;
                    System.out.println("-------PT bac 4: ax^4 + ax^3 + bx^2 + cx + d = 0-----------");
                    System.out.print("Enter a: ");
                    a = new Scanner(System.in).nextFloat();
                    System.out.print("Enter b: ");
                    b = new Scanner(System.in).nextFloat();
                    System.out.print("Enter c: ");
                    c = new Scanner(System.in).nextFloat();
                    System.out.print("Enter d: ");
                    d = new Scanner(System.in).nextFloat();
                    System.out.print("Enter e: ");
                    e = new Scanner(System.in).nextFloat();
                    PTBac4 p4 = new PTBac4(a, b, c, d, e);
                    System.out.println("Result: ");
                    p4.solve();
                    break;
                }
            }
            
        }
    }
    
}
