/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cnyt.complejos;

import java.util.HashMap;

/**
 *
 * @author nicolas.torres-p
 */
public class ClassicAndCuantic { 
    public static Double[] CanicasClasico(int[][] m1, Double[] v, int clics) {
        Double[] r = v;
        for (int i = 0; i < clics; i++) {
            r = multiplicacionMatrisVector(m1, r);
        }
        return r;
    }
    private static Double[] multiplicacionMatrisVector(int[][] m1, Double[] v) {
        Double sum;
        Double r[] = new Double[v.length];
        for (int i = 0; i < m1.length; i++) {
            sum = 0.0;
            for (int j = 0; j < v.length; j++) {
                sum += m1[i][j] * v[j];
            }
            r[i] = sum;
        }
        return r;
    }
    private static Double[] MatrixXVectD(Double[][] m1, Double[] v) {
        Double sum;
        Double r[] = new Double[v.length];
        for (int i = 0; i < m1.length; i++) {
            sum = 0.0;
            for (int j = 0; j < v.length; j++) {
                sum += m1[i][j] * v[j];
            }
            r[i] = sum;
        }
        return r;
    }
     public static Double[][] getMatrizXmatriz(int rendijas, int objetivos, HashMap<String, Double> probabilidades) {
        Double[][] m = new Double[rendijas + objetivos + 1][rendijas + objetivos + 1];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (i == j && j > rendijas) {
                    m[i][j] = 1.00;
                } else {
                    m[i][j] = 0.00;
                }

            }
        }
         public static Double[] MultiRendClásico(Double[][] m1, Double[] v, int clics) {
        Double[] r = v;
        for (int i = 0; i < clics; i++) {
            r = MatrixXVectD(m1, r);
        }
        return r;
    }
}
