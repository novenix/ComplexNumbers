/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sun.swing.plaf.windows.ClassicSortArrowIcon;
import edu.eci.cnyt.complejos.*;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;
/**
 *
 * @author nicolas.torres-p
 */
public class ClasicoAloCuanticoTest {
    
    public ClasicoAloCuanticoTest() {
    }
     @Test
    public void canicas_con_coeficiente_booleanos() {
        System.out.println("---------Canicas_Con_Coeficiente_Booleanos Test---------");
        System.out.println(" ");
        System.out.println("-------Libro Ejemplo-----------");
        int[][] m = {{0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0},
        {0, 1, 0, 0, 0, 1},
        {0, 0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0, 0},
        {1, 0, 0, 0, 1, 0}};
        Double[] v = {6.0, 2.0, 1.0, 5.0, 3.0, 10.0};
        int Clicks = 1;
        Double[] r = ClassicAndCuantic.CanicasClasico(m, v, Clicks);
        for (Double e : r) {
            System.out.println(e);
        }
       
        Double[] resp = {0.0, 0.0, 12.0, 5.0, 1.0, 9.0};
        assertArrayEquals(r, resp);
        System.out.println(" ");
        System.out.println("-------Quiz pregunta 2------------");
        int[][] m2 = {{0, 0, 0, 0, 0, 0},
        {0, 0, 0, 1, 0, 0},
        {0, 1, 0, 0, 0, 1},
        {0, 0, 1, 0, 0, 0},
        {0, 0, 0, 0, 1, 0},
        {1, 0, 0, 0, 0, 0}};

        Double[] v2 = {6.0, 0.0, 3.0, 5.0, 3.0, 8.0};
        Clicks = 5000;
        r = ClassicAndCuantic.CanicasClasico(m2, v2, Clicks);
        Double[] resp2 = {0.0, 3.0, 11.0, 8.0, 3.0, 0.0};
        for (Double e : r) {
            System.out.println(e);
        }
        assertArrayEquals(r, resp2);
        System.out.println(" ");
        ClassicAndCuantic.graficarEstado(r,"canicas_con_coeficiente_booleanos_quiz");
    }

    @Test
    public void MultiplesRendijasExperiemnto() {
        System.out.println("---------Multiples Rendijas Experiemnto Clasico ---------");
        System.out.println(" ");
        HashMap<String, Double> probabilidades = new HashMap<>();
        probabilidades.put("0-1", 0.50);
        probabilidades.put("0-2", 0.50);
        probabilidades.put("1-3", 0.33);
        probabilidades.put("1-4", 0.33);
        probabilidades.put("1-5", 0.33);
        probabilidades.put("2-5", 0.33);
        probabilidades.put("2-6", 0.33);
        probabilidades.put("2-7", 0.33);
        Double[][] m = ClassicAndCuantic.getMatrizXmatriz(2, 5, probabilidades);
        Double[] v2 = {1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
        Double[] r = ClassicAndCuantic.MultiRendClásico(m, v2, 1);
        for (Double e : r) {
            System.out.println(e);
        }
        ClassicAndCuantic.graficarEstado(r,"Multiples_Rendijas_Experiemnto");
    }

    @Test
    public void MultiplesRendijasExperiemntoCuantico() {
        System.out.println("---------Multiples Rendijas Experiemnto Cuantico ---------");
        System.out.println(" ");
        DecimalFormat df = new DecimalFormat("#.00");
        HashMap<String, Complex> probabilidades = new HashMap<>();
        probabilidades.put("0-1", new Complex(1 / Math.sqrt(2), 0.0));
        probabilidades.put("0-2", new Complex(1 / Math.sqrt(2), 0.0));
        probabilidades.put("1-3", new Complex(-1 / Math.sqrt(6),1 / Math.sqrt(6)));
        probabilidades.put("1-4", new Complex(-1 / Math.sqrt(6),-1 / Math.sqrt(6)));
        probabilidades.put("1-5", new Complex(1 / Math.sqrt(6),-1 / Math.sqrt(6)));
        probabilidades.put("2-5", new Complex(-1 / Math.sqrt(6),1 / Math.sqrt(6)));
        probabilidades.put("2-6", new Complex(-1 / Math.sqrt(6),-1 / Math.sqrt(6)));
        probabilidades.put("2-7", new Complex(1 / Math.sqrt(6),-1 / Math.sqrt(6)));
        Double[][] m = ClassicAndCuantic.getMatrizXmatrizCuantico(2, 5, probabilidades);
        Double[] v2 = {1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
        Double[] r=ClassicAndCuantic.MultiRendClásico(m,v2,1);
        for(Double[] e: m){
         System.out.println(Arrays.toString(e));
         }
        for(Double e: r){
         System.out.println(e);
         }
        ClassicAndCuantic.graficarEstado(r,"Multiples_Rendijas_Experiemnto_Cuantico");
    }
    @Test
    public void graficar() {
        
    }
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

   
}
