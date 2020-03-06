
package edu.eci.cnyt.complejos;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import javax.imageio.ImageIO;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


public class ClassicAndCuantic {

    public ClassicAndCuantic() {

    }

     public static Complex suma(Complex a, Complex b) {
        Double x = a.getReal() + b.getReal();
        Double y = a.getImaginary() + b.getImaginary();
        return new Complex(redondearDecimales(x, 2), redondearDecimales(y, 2));
    }
    public static Complex multiplicacion(Complex a, Complex b) {
        Double x = a.getReal() * b.getReal() - a.getImaginary()* b.getImaginary();
        Double y = a.getReal() * b.getImaginary() + a.getImaginary() * b.getReal();
        return new Complex(redondearDecimales(x, 2), redondearDecimales(y, 2));
    }




    public static Double Mod(Complex a) {
        return (a.getReal() * a.getReal()) + (a.getImaginary() * a.getImaginary());
    }

   
    
    public static Matriz productoMatrices(Complex[][] m1, Complex[][] m2) {
        Complex sum;
        Complex r[][] = new Complex[m1.length][m1[0].length];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m2[0].length; j++) {
                sum = new Complex(0.0, 0.0);
                for (int k = 0; k < m1[0].length; k++) {
                    sum = suma(sum, multiplicacion(m1[i][k], m2[k][j]));
                }
                r[i][j] = sum;
            }
        }
        return new Matriz(r);
    }

    /**
     * Este metodo permite calcular la accion entre una matriz y un vector.
     *
     * @param m1 //Complejo[][]
     * @param v //Complejo[]
     * @return Vector
     */
    public static VectorComplex accionMatrisVector(Complex[][] m1, Complex[] v) {
        Complex sum;
        Complex r[] = new Complex[v.length];
        for (int i = 0; i < m1.length; i++) {
            sum = new Complex(0.0, 0.0);
            for (int j = 0; j < v.length; j++) {
                sum = suma(sum, multiplicacion(m1[i][j], v[j]));
            }

            r[i] = sum;
        }
        ArrayList<Complex> vectorResultado = new ArrayList<Complex>();
        for (int i = 0; i < r.length; i++) {
            vectorResultado.add(r[i]);
        }
        return new VectorComplex(vectorResultado);

    }

   

    public static VectorComplex canicasExperimentoCuantico(Complex[][] m1, Complex[] v) {
        Complex[] r = v;
        VectorComplex prob = accionMatrisVector(m1, r);

        return prob;
    }

    public static Double[] CanicasClasico(int[][] m1, Double[] v, int clics) {
        Double[] r = v;
        for (int i = 0; i < clics; i++) {
            r = multiplicacionMatrisVector(m1, r);
        }
        return r;
    }

    public static Double[][] getMatrizXmatrizCuantico(int rendijas, int objetivos, HashMap<String, Complex> probabilidades) {
        Complex[][] m = new Complex[rendijas + objetivos + 1][rendijas + objetivos + 1];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (i == j && j > rendijas) {
                    m[i][j] = new Complex(1.0, 0.0);
                } else {
                    m[i][j] = new Complex(0.0, 0.0);
                }

            }
        }

        for (String key : probabilidades.keySet()) {
            String[] p = key.split("-");
            m[Integer.parseInt(p[1])][Integer.parseInt(p[0])] = probabilidades.get(key);

        }
        Double[][] resp = new Double[m.length][m[0].length];
        Complex[][] m2 = productoMatrices(m, m).getMatriz();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                resp[i][j] = Mod(m2[i][j]);
            }
        }
        return resp;
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
        for (String key : probabilidades.keySet()) {
            String[] p = key.split("-");
            m[Integer.parseInt(p[1])][Integer.parseInt(p[0])] = probabilidades.get(key);
        }
        Double[][] m2 = productoMatricesReales(m, m);
        for (Double[] e : m2) {
            System.out.println(Arrays.toString(e));
        }
        return m2;
    }

    public static Double[][] productoMatricesReales(Double[][] m1, Double[][] m2) {
        Double sum;
        Double r[][] = new Double[m1.length][m1[0].length];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m2[0].length; j++) {
                sum = 0.0;
                for (int k = 0; k < m1[0].length; k++) {
                    sum = sum + (m1[i][k] * m2[k][j]);
                }
                r[i][j] = sum;
            }
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

    private static Double[] multiplicacionMatrisVectorDouble(Double[][] m1, Double[] v) {
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

    public static Double[] MultiRendClásico(Double[][] m1, Double[] v, int clics) {
        Double[] r = v;
        for (int i = 0; i < clics; i++) {
            r = multiplicacionMatrisVectorDouble(m1, r);
        }
        return r;
    }

    public static double redondearDecimales(double valorInicial, int numeroDecimales) {
        double parteEntera, resultado;
        resultado = valorInicial;
        parteEntera = Math.floor(resultado);
        resultado = (resultado - parteEntera) * Math.pow(10, numeroDecimales);
        resultado = Math.round(resultado);
        resultado = (resultado / Math.pow(10, numeroDecimales)) + parteEntera;
        return resultado;
    }

    public static void graficarEstado(Double[] EstadoVector,String name) {
        try {
            //System.out.println(name);
            DefaultCategoryDataset ds = new DefaultCategoryDataset();
            for(int i=0;i<EstadoVector.length;i++){
                ds.addValue(EstadoVector[i],"Vertice"+Integer.toString(i),"");
            }
            JFreeChart jf = ChartFactory.createBarChart3D("Estado", "Vertices", "Probabilidad", ds, PlotOrientation.VERTICAL, true, true, true);
            ChartFrame f = new ChartFrame("Estados", jf);
            f.setSize(1000, 600);
            f.setLocationRelativeTo(null);
            f.setVisible(false);
            ChartUtilities.saveChartAsPNG(new File(name+".png"),jf, 1000,600,null);
            
        } catch (Exception e) {
            System.out.println("error" + e);
        }

    }
   
}

