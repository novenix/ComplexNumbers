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
public class MatrizComplex {
    //Atributos 
    int nFilas;
    int nColomnas;   
    Complex [][] matriz;   
    public MatrizComplex(int row, int col){
        nFilas = row;
        nColomnas = col;
        matriz = new Complex[nFilas][nColomnas];
    }    
    
    public void AddInPosition(int row, int col,Complex valor){
        matriz[row][col] = valor;
    }
    public Complex GetPosition(int row, int col){
        return matriz[row][col];
    }
    
    public MatrizComplex Inverso(){
        double vReal;
        double vIma;
        Complex nComple;
        MatrizComplex matrizNueva = new MatrizComplex(nFilas, nColomnas);
        
        
        
        for (int x = 0; x < nFilas; x++){
            
            for(int y = 0; y < nColomnas; y++){
                
                
                vReal = (matriz[x][y].getReal()* -1);
                vIma = (matriz[x][y].getImaginary()* -1);
                nComple  = new Complex(vReal, vIma);
                matrizNueva.AddInPosition(x, y, nComple);
            }
        }
        return matrizNueva;
    }
}




