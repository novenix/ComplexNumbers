/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import edu.eci.cnyt.complejos.Complex;
import edu.eci.cnyt.complejos.MatrixBasicOp;
import edu.eci.cnyt.complejos.MatrixComplex;
import edu.eci.cnyt.complejos.VectorComplex;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nicolas.torres-p
 */
public class TestEstadosYDinamicas {
    
    public TestEstadosYDinamicas() {
    }
    //@Test
     public void TestDinamicas() {
        boolean flagEsperada = true;
        MatrixComplex valorEsperado = new MatrixComplex(6,6);
        Complex valor1 = new Complex(0, 0);
        valorEsperado.AddInPosition(0,0,valor1);
        Complex valor2 = new Complex(0, 0);
        valorEsperado.AddInPosition(0,1,valor2);
        Complex valor3 = new Complex(0, 0);
        valorEsperado.AddInPosition(0,2,valor3);
        Complex valor4 = new Complex(0, 0);
        valorEsperado.AddInPosition(0,3,valor4);
        Complex valor5 = new Complex(0, 0);
        valorEsperado.AddInPosition(0,4,valor5);
        Complex valor6 = new Complex(0, 0);
        valorEsperado.AddInPosition(0,5,valor6);
        Complex valor7 = new Complex(0, 0);
        System.out.println("0-1");
        valorEsperado.AddInPosition(1,0,valor7);
        Complex valor8 = new Complex(0, 0);
        valorEsperado.AddInPosition(1,1,valor8);
        Complex valor9 = new Complex(0, 0);
        valorEsperado.AddInPosition(1,2,valor9);
        Complex valor10 = new Complex(0, 1);
        valorEsperado.AddInPosition(1,3,valor10);
        Complex valor11 = new Complex(0, 0);
        valorEsperado.AddInPosition(1,4,valor11);
        Complex valor12 = new Complex(0, 0);
        valorEsperado.AddInPosition(1,5,valor12);
        System.out.println("1-2");
        Complex valor13 =  new Complex(0, 0);
        valorEsperado.AddInPosition(2,0,valor13);
        Complex valor14 = new Complex(0, 1);
        valorEsperado.AddInPosition(2,1,valor14);
        Complex valor15 = new Complex(0, 0);
        valorEsperado.AddInPosition(2,2,valor15);
        Complex valor16 = new Complex(0, 0);
        valorEsperado.AddInPosition(2,3,valor16);
        Complex valor17 = new Complex(0, 0);
        valorEsperado.AddInPosition(2,4,valor17);
        Complex valor18 = new Complex(0, 1);
        valorEsperado.AddInPosition(2,5,valor18);
        Complex valor19 = new Complex(0, 0);
        System.out.println("2-3");
        valorEsperado.AddInPosition(3,0,valor19);
        Complex valor20 = new Complex(0, 0);
        valorEsperado.AddInPosition(3,1,valor20);
        Complex valor21 = new Complex(0, 1);
        valorEsperado.AddInPosition(3,2,valor21);
        Complex valor22 = new Complex(0, 0);
        valorEsperado.AddInPosition(3,3,valor22);
        Complex valor23 = new Complex(0, 0);
        valorEsperado.AddInPosition(3,4,valor23);
        Complex valor24 = new Complex(0, 0);
        valorEsperado.AddInPosition(3,5,valor24);
         Complex valor25 = new Complex(0, 0);
         System.out.println("3-4");
        valorEsperado.AddInPosition(4,0,valor25);
         Complex valor26 = new Complex(0, 0);
        valorEsperado.AddInPosition(4,1,valor26);
        
        Complex valor27= new Complex(0, 0);
        valorEsperado.AddInPosition(4,2,valor27);
        Complex valor28 = new Complex(0, 0);
        valorEsperado.AddInPosition(4,3,valor28);
        Complex valor29 = new Complex(0, 1);
        valorEsperado.AddInPosition(4,4,valor29);
        Complex valor30 = new Complex(0, 0);
        valorEsperado.AddInPosition(4,5,valor30);
        Complex valor31 = new Complex(0, 1);
        valorEsperado.AddInPosition(5,0,valor31);
        System.out.println("4-5");
        Complex valor32 = new Complex(0, 0);
        valorEsperado.AddInPosition(5,1,valor32);
        Complex valor33 = new Complex(0, 0);
        valorEsperado.AddInPosition(5,2,valor33);
        Complex valor34 = new Complex(0, 0);
        valorEsperado.AddInPosition(5,3,valor34);
        Complex valor35 = new Complex(0, 0);
        valorEsperado.AddInPosition(5,4,valor35);
        Complex valor36 = new Complex(0, 0);
        valorEsperado.AddInPosition(5,5,valor36);
        
        System.out.println("5-6");
        VectorComplex vector1 = new VectorComplex(5);
        Complex valorV1 = new Complex(0, 0);
        vector1.AddValue(valorV1);
        Complex valorV2 = new Complex(0, 0);
        vector1.AddValue(valorV2);
        Complex valorv3 = new Complex(0, 0);
        vector1.AddValue(valorv3);
        Complex valorV4 = new Complex(0, 0);
        vector1.AddValue(valorV4);
          Complex valorV5 = new Complex(0, 0);
        vector1.AddValue(valorV5);
        
        Complex rta=new Complex(2,0);
        double tClicks=rta.getReal();
         MatrixComplex matrizFinal = valorEsperado;
        for(int x=0;x<tClicks;x++){
           MatrixBasicOp.multiMatrices(matrizFinal, valorEsperado);
        }
         MatrixBasicOp.MultiplicacionVectorMatriz(vector1, matrizFinal);
       
        
       
        //boolean flag = MatrixBasicOp.IgualMatrix(matrizFinal, valorEsperado);
        //assertEquals(flagEsperada, flag);
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
