/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cnyt.complex;
import edu.eci.cnyt.complex.Complex;
import java.math.BigDecimal;
/**
 *
 * @author 2137260
 */
public class BasicOperations {
    double realResult;
    double imaginaryResult;
    Complex result;
    
    public BasicOperations(){
        
        //Complex Complex2;
    }
    public Complex suma (Complex n1, Complex n2){
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
    public Complex resta (Complex n1, Complex n2){
        
         double RC1=n1.getReal();
         double IC1=n1.getImaginary();
         double RC2=n2.getReal();
         double IC2=n2.getImaginary();
         realResult=RC1-RC2;
         imaginaryResult=IC1-IC2;
       
        result = new Complex(realResult, imaginaryResult);
        
        return result;
    }
    
     public Complex multi (Complex n1, Complex n2){
        
         double RC1=n1.getReal();
         double IC1=n1.getImaginary();
         double RC2=n2.getReal();
         double IC2=n2.getImaginary();
         realResult=RC1*RC2+((IC1*IC2)*-1);
         imaginaryResult=(RC1*IC2)+(IC1*RC2);
       
        result = new Complex(realResult, imaginaryResult);
        
        return result;
    }
      public Complex div (Complex n1, Complex n2){
        
         double RC1=n1.getReal();
         double IC1=n1.getImaginary();
         double RC2=n2.getReal();
         double IC2=n2.getImaginary();
         Complex conjuDen=n2.getconjugado();
         this.multi(n1, conjuDen);
         realResult=RC1*RC2+(IC1*IC2*-1);
         imaginaryResult=(RC1*IC2)+(IC1*RC2);
       
        result = new Complex(realResult, imaginaryResult);
        
        return result;
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
}
