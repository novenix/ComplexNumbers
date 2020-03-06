package edu.eci.cnyt.complejos;


import java.util.ArrayList;

public class Matriz {

    private Complex[][] matriz;

    public Complex[][] getMatriz() {
        return matriz;
    }
    private int length;

    public Matriz(int m, int n) {
        matriz = new Complex[m][n];
        length = m;
    }

    public Matriz(Complex[][] M) {
        matriz = M;
    }

    public void AgregarElemento(Complex x, int i, int j) {
        matriz[i][j] = x;
    }

    @Override
    public String toString() {
        return null;
    }

    public int getLength() {
        return length;
    }
    
}