/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cnyt.complejos;
import edu.eci.cnyt.complejos.Complex;
import java.math.BigDecimal;
/**
 *
 * @author 2137260
 */
public class BasicOperations {
    static double realResult;
    static double imaginaryResult;
    static Complex result;
    
    public BasicOperations(){
        
        //Complex Complex2;
    }
    public static Complex suma (Complex n1, Complex n2){
        
        realResult=0;
        imaginaryResult=0;
         double RC1=n1.getReal();
         double IC1=n1.getImaginary();
         double RC2=n2.getReal();
         double IC2=n2.getImaginary();
         realResult=RC1+RC2;
         imaginaryResult=IC1+IC2;
       
        result = new Complex(realResult, imaginaryResult);
        
        return result;
    }   
    public static Complex resta (Complex n1, Complex n2){
         
         double RC1=n1.getReal();
         double IC1=n1.getImaginary();
         double RC2=n2.getReal();
         double IC2=n2.getImaginary();
         realResult=RC1-RC2;
         imaginaryResult=IC1-IC2;
       
        result = new Complex(realResult, imaginaryResult);
        
        return result;
    }
    
     public static Complex multi (Complex n1, Complex n2){
        
         double RC1=n1.getReal();
         double IC1=n1.getImaginary();
         double RC2=n2.getReal();
         double IC2=n2.getImaginary();
         realResult=RC1*RC2+((IC1*IC2)*-1);
         imaginaryResult=(RC1*IC2)+(IC1*RC2);
       
        result = new Complex(realResult, imaginaryResult);
        
        return result;
    }
      public static Complex div (Complex n1, Complex n2){
        
         Complex numeroCNuevo;
        double vr1 = n1.getReal();
        double vr2 = n2.getReal();
        double vi1 = n1.getImaginary();
        double vi2 = n2.getImaginary(); 
        double xNumerador = (vr1*vr2)+(vi1*vi2);
        double yNumerador = (vr2*vi1) - (vr1*vi2);
        double deno = Math.pow(vr2, 2) + Math.pow(vi2, 2);
        double vr = xNumerador / deno;
        vr = Math.round(vr * 100) / 100d;
        double valorImaginario = yNumerador/deno;
        valorImaginario = Math.round(valorImaginario * 100) / 100d;
        numeroCNuevo = new Complex(vr, valorImaginario);
        
        return numeroCNuevo;
       
      
    }
   
 
 
     public static Complex CartesianoAPolar(Complex tupla){
        Complex numeroCNuevo;
        double RC1 = tupla.getReal();
        double IC1 = tupla.getImaginary();
        double div = IC1/RC1;
        double Tetha = Math.atan(div);
        RC1 = Math.pow(RC1, 2);
        IC1 = Math.pow(IC1, 2);
        double valorC = RC1 + IC1;
        double valorPfea = Math.sqrt(valorC);
        System.out.println(valorPfea);
        System.out.println(Tetha);
        numeroCNuevo = new Complex(valorPfea, Tetha);
        return numeroCNuevo;
    }
     public static boolean iguales (Complex tupla1,Complex tupla2){
        double r1 = tupla1.getReal();
        double i1 = tupla1.getImaginary();
        double r2 = tupla2.getReal();
        double i2 = tupla2.getImaginary();
        if (r2 == r1 && i1 == i2){
            return true;
        }
        else{
            return false;
        }
    }
}
