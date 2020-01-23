/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cnyt.complejos;

/**
 *
 * @author nicolas.torres-p
 */
public class MatrixBasicOp {
     public static Complex SumaComplejos(Complex n1,Complex n2){
        Complex numeroCNuevo;
        double R1 = n1.getReal();
        double R2 = n2.getReal();
        double rtaR = R1+R2;
        rtaR = Math.round(rtaR * 100) / 100d;
        double ima1 = n1.getImaginary();
        double ima2 = n2.getImaginary();         
        double rtaI = ima1+ima2;
        rtaI = Math.round(rtaI * 100) / 100d;
        numeroCNuevo = new Complex(rtaR, rtaI);
        return numeroCNuevo;
    }
}
