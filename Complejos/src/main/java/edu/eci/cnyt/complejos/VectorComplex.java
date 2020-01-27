/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cnyt.complejos;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author User
 */

public class VectorComplex {
    
    //Atributos
    List<Complex> ListVector = new ArrayList<Complex>();
    int size;
    
    public VectorComplex(int sizeN){
        size = sizeN;
    }
    
    public void AddValue(Complex CompNew){
        if(ListVector.size() < size){
            ListVector.add(CompNew);
        }        
    }    
    
    public int GetSize(){
        return size;
    }
    
    
    public Complex GetPosition(int pos){
        return ListVector.get(pos);
    }    
    
    public VectorComplex Inverso(){
        VectorComplex listaN = new VectorComplex(size);
        for(int i = 0; i < size; i++){
            Complex complejoRespaldo;
            complejoRespaldo = ListVector.get(i);
            double realN = (complejoRespaldo.getReal()* -1);
            double imaginarioN = (complejoRespaldo.getImaginary()* -1);
            complejoRespaldo = new Complex(realN, imaginarioN);
            listaN.AddValue(complejoRespaldo);
        }
        return listaN;
    }    
    
    public void Print(){
        for(int i = 0; i < size; i++){
            System.out.println(this.GetPosition(i).getReal()+ " " +this.GetPosition(i).getImaginary());
        }
            System.out.println("");
    }
    
    
}
