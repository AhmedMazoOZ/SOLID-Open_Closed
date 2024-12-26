/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.openclosed;

/**
 *
 * @author Electronica
 */
public class OpenClosed {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        New_ShapeClass circle=new New_Circle_Class();
        circle.calculate();  // for circle
        
        New_ShapeClass traingle=new New_Traingle_Class();
        traingle.calculate();  // for traingle
    }
}
