/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1955201286_tugas;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class ArraySatuDimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    int NH[] = new int [3];
    int NU[] = new int [3];
    int NUAS[] = new int [3];
    String[] Murid = new String [3];
    int NA;
    
    Scanner input = new Scanner (System.in);
    
    for (int i = 0; i < Murid.length; i++){
        System.out.println("......................");
        System.out.println("input nama MURID ke-" + (1+1) + " '' ");
        Murid[i] = input.next();
        System.out.println("......................");
        System.out.println("nilai harian = ");
        NH[i] = input.nextInt();
        System.out.println("nilai UTS = ");
        NU[i] = input.nextInt();
        System.out.println("nilai UAS = ");
        NUAS[i] = input.nextInt();
        System.out.println("......................");
        
        NA = (int) ((NH[i]*0.2) + (NU[i]*0.3) + (NUAS[i] * 0.5));
        System.out.println("nilai akhir : " + NA);
    
    
        }
    }            
}

