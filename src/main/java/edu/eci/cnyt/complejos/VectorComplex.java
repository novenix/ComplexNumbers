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
    
    
    List<Complex> ListVector = new ArrayList<Complex>();
     private ArrayList<Complex> vec;
    int size;
    public VectorComplex(ArrayList<Complex> vec){
        this.vec=vec;
    }

    public VectorComplex(int sizeN){
        size = sizeN;
    }
    
    public void AddValue(Complex CompNew){
        if(ListVector.size() < size){
            ListVector.add(CompNew);
        }        
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
            System.out.println(this.getP(i).getReal()+ " " +this.getP(i).getImaginary());
        }
            System.out.println("");
    }
    
    public int GetSize(){
        return size;
    }
    
    
    public Complex getP(int pos){
        return ListVector.get(pos);
    }  
   public void setVec(ArrayList<Complex> vec) {
        this.vec = vec;
    }

    public ArrayList<Complex> getVec() {
        return vec;
    }
    
      public VectorComplex Conju(){
        VectorComplex retorno = new VectorComplex(size);
        for (Complex c : ListVector){
            retorno.AddValue(c.getconjugado());
                      
        }
        return retorno;
    }
    
   
    
}
