/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cnyt.complejos;

/**
 *
 * @author User
 */
public class MatrixBasicOp {
     public static MatrixComplex SumaMatriz(MatrixComplex matriz1, MatrixComplex matriz2){
        if ((matriz1.nFilas == matriz2.nFilas) && (matriz1.nColomnas == matriz2.nColomnas)){
            Complex complejoN; 
            MatrixComplex matrizN = new MatrixComplex(matriz1.nFilas, matriz1.nColomnas);
            for(int i = 0; i < matriz1.nFilas; i ++){
                for(int o = 0; o < matriz1.nColomnas; o ++){
                    complejoN = BasicOperations.suma(matriz1.GetPosition(i, o), matriz2.GetPosition(i, o));
                    matrizN.AddInPosition(i, o, complejoN);
                }
            }
            return matrizN;
        }
        else{
            System.out.println("Las matrices no tienen el mismo tamaño");
            return null;
        }
        
    }
      public static MatrixComplex multiEscalarMatriz(MatrixComplex matriz1, Complex complejo1){
        Complex complejoN; 
        MatrixComplex matrizN = new MatrixComplex(matriz1.nFilas, matriz1.nColomnas);
        for(int i = 0; i < matriz1.nFilas; i ++){
            for(int o = 0; o < matriz1.nColomnas; o ++){
                complejoN = BasicOperations.multi(matriz1.GetPosition(i, o), complejo1);
                matrizN.AddInPosition(i, o, complejoN);
            }
        }
        return matrizN;
    }
      public static MatrixComplex multiMatrices(MatrixComplex matriz1, MatrixComplex matriz2){
        if ((matriz1.nFilas == matriz2.nFilas) && (matriz1.nColomnas == matriz2.nColomnas)){
            MatrixComplex matrizN = new MatrixComplex(matriz1.nFilas, matriz1.nColomnas);
            for(int i = 0; i < matriz1.nFilas; i++){
                MultiMatrizVector(i,matriz1,matriz2,matrizN);
            }
            return matrizN;
        }
        else{
            System.out.println("Las matrices no son del mismo tamanio, la operacion entregara un valor null");
            return null;
        }
    }
        private static void MultiMatrizVector(int i, MatrixComplex matriz1, MatrixComplex matriz2, MatrixComplex N){
        Complex complejoN; 
        Complex complejoSuma;
        for(int a = 0; a < matriz2.nFilas; a++){
            complejoSuma = new Complex(0, 0);
            for(int b = 0; b < matriz2.nColomnas; b++){
                complejoN = BasicOperations.multi(matriz1.GetPosition(i, b), matriz2.GetPosition(b, a));
                complejoSuma = BasicOperations.suma(complejoN, complejoSuma);
            }
            N.AddInPosition(i, a, complejoSuma);
        }
        
    }
        //accion matriz en vector
        public static VectorComplex MultiplicacionVectorMatriz(VectorComplex vector, MatrixComplex matriz){
        VectorComplex vectorN = new VectorComplex(matriz.nColomnas);
            System.out.println(vectorN);
        Complex complejoN;
        Complex complejoSuma;
        for(int i = 0; i < matriz.nColomnas; i++){
            complejoSuma = new Complex(0, 0);
            System.out.println(i);
            for(int o = 0; o < matriz.nFilas; o++){
                System.out.println(o);
                vector.getP(o);
                 System.out.println("antes");
                 matriz.GetPosition(o, i);
                  System.out.println("despues");
                   System.out.println(o);
                   
                complejoN = BasicOperations.multi(vector.getP(o), matriz.GetPosition(o, i));
                complejoSuma = BasicOperations.suma(complejoN, complejoSuma);
                
            }
            vectorN.AddValue(complejoSuma);
            System.out.println(complejoSuma);
        }
        return  vectorN;
    }
    
         public static boolean IgualMatrix(MatrixComplex matriz1, MatrixComplex matriz2){
        boolean bandera = true;
        for (int i = 0; i < matriz1.nFilas; i++){
            for(int o = 0; o < matriz1.nColomnas; o++){
                if(!BasicOperations.igualdadComplejos(matriz1.GetPosition(i, o), matriz2.GetPosition(i, o))){
                    bandera = false;
                }
            }
        }
        return bandera;
    }
         
          private static void AnadirPosicion(Complex valor1, int Contadorfilas, int contadorColumna, MatrixComplex matrizN, MatrixComplex matriz2){
        for(int i = 0; i < matriz2.nFilas; i++){
            for(int a = 0; a < matriz2.nColomnas; a++){
                matrizN.AddInPosition(i+Contadorfilas, a+contadorColumna, BasicOperations.multi(valor1, matriz2.GetPosition(i, a)));
            }
        }
        
        
    }
         ////////////////////////////
         
          public static MatrixComplex ProductoTensor(MatrixComplex matriz1, MatrixComplex matriz2){
        int contadorFilas = 0;
        int contadorColumnas = 0;
        MatrixComplex matrizN = new MatrixComplex((matriz1.nFilas * matriz2.nFilas), (matriz1.nColomnas * matriz2.nColomnas));
        for (int i = 0; i < matriz1.nFilas; i ++){
            for(int a = 0; a < matriz1.nColomnas; a++){
                AnadirPosicion(matriz1.GetPosition(i, a), contadorFilas, contadorColumnas, matrizN,matriz2);
                contadorColumnas += (matriz2.nColomnas);
            }
            contadorColumnas = 0;
            contadorFilas += matriz2.nFilas;
        }
        return matrizN;
    }
         
         
      
         
    
     public static boolean IsHermitian(MatrixComplex matriz1){
        if (matriz1.nFilas == matriz1.nColomnas){
            MatrixComplex matrizN = new MatrixComplex(matriz1.nFilas, matriz1.nColomnas);
            MatrixComplex matrizFinal = new MatrixComplex(matriz1.nFilas, matriz1.nColomnas);
            for(int i = 0; i < matriz1.nFilas; i++){
                for(int a = 0; a < matriz1.nColomnas; a++){
                    matrizN.AddInPosition(i, a, matriz1.GetPosition(i, a).getconjugado());
                    matrizFinal.AddInPosition(a, i, matrizN.GetPosition(i, a));
                }
            }
            return IgualMatrix(matriz1, matrizFinal);
        }
        else{
            return false;
        }
    }
}

