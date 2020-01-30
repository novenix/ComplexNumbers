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
public class VectorBasicOp {
      public static VectorComplex sumaVectores(VectorComplex matriz1, VectorComplex matriz2){
        
        int size1 = matriz1.GetSize();
        int size2 = matriz2.GetSize();
        if (size1 == size2){
            VectorComplex newList = new VectorComplex(size1);
            for(int i = 0; i < size1; i++){
                newList.AddValue(BasicOperations.suma(matriz1.getP(i), matriz2.getP(i)));
            }
            return newList;
        }
        else{
            return null;
        }
        
        
    }  
      
    public static boolean IgualdadVectores(VectorComplex matriz1, VectorComplex matriz2){
        int tamanio = matriz1.GetSize();
        boolean iguales = true;
        for (int i = 0; i < tamanio; i++){
            System.out.println("vector1 " + matriz1.getP(i).getReal()+" " + matriz1.getP(i).getImaginary()+ " vector2 " + matriz2.getP(i).getReal()+ " " + matriz2.getP(i).getImaginary());
            if(!BasicOperations.igualdadComplejos(matriz1.getP(i), matriz2.getP(i))){
                System.out.println("Entre aqui");
                iguales = false;
            }
        }
        return iguales;
    }
     public  VectorComplex MultiEscalVect(Complex complejo1, VectorComplex lista1){
        int size = lista1.GetSize();
        VectorComplex listaN = new VectorComplex(size);
        for(int i = 0; i < size; i++){
           Complex numeroN = BasicOperations.multi(complejo1, lista1.getP(i));
           listaN.AddValue(numeroN);
        }
        return listaN;
    }
    
}
