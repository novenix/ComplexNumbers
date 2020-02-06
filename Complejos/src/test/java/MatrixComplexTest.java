/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import edu.eci.cnyt.complejos.*;
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
public class MatrixComplexTest {
    
    public MatrixComplexTest() {
    }
    
 @Test
 
    public void SumaMatritest() {
        boolean flagEsperada = true;
        MatrixComplex valorEsperado = new MatrixComplex(2,2);
        Complex valor1 = new Complex(-1, 1);
        valorEsperado.AddInPosition(0,0,valor1);
        Complex valor2 = new Complex(-2, 2);
        valorEsperado.AddInPosition(0,1,valor2);
        Complex valor3 = new Complex(1, -1);
        valorEsperado.AddInPosition(1,0,valor3);
        Complex valor4 = new Complex(2, -2);
        valorEsperado.AddInPosition(1,1,valor4);
        MatrixComplex matriz1 = new MatrixComplex(2,2);
        valor1 = new Complex(0, -1);
        matriz1.AddInPosition(0,0,valor1);
        valor2 = new Complex(-1, 0);
        matriz1.AddInPosition(0,1,valor2);
        valor3 = new Complex(-5, 0);
        matriz1.AddInPosition(1,0,valor3);
        valor4 = new Complex(-2, 2);
        matriz1.AddInPosition(1,1,valor4);
        MatrixComplex matriz2 = new MatrixComplex(2,2);
        valor1 = new Complex(-1, 2);
        matriz2.AddInPosition(0,0,valor1);
        valor2 = new Complex(-1, 2);
        matriz2.AddInPosition(0,1,valor2);
        valor3 = new Complex(6, -1);
        matriz2.AddInPosition(1,0,valor3);
        valor4 = new Complex(4, -4);
        matriz2.AddInPosition(1,1,valor4);
        MatrixComplex matrizFinal = MatrixBasicOp.SumaMatriz(matriz1, matriz2);
        boolean flag = MatrixBasicOp.IgualMatrix(matrizFinal, valorEsperado);
        assertEquals(flagEsperada, flag);
    }
public void testInverso() {
        boolean flagEsperada = true;
        MatrixComplex valorEsperado = new MatrixComplex(2,2);
        Complex valor1 = new Complex(-1, 1);
        valorEsperado.AddInPosition(0,0,valor1);
        Complex valor2 = new Complex(-2, 2);
        valorEsperado.AddInPosition(0,1,valor2);
        Complex valor3 = new Complex(1, -1);
        valorEsperado.AddInPosition(1,0,valor3);
        Complex valor4 = new Complex(2, -2);
        valorEsperado.AddInPosition(1,1,valor4);
        MatrixComplex matriz1 = new MatrixComplex(2,2);
        valor1 = new Complex(1, -1);
        matriz1.AddInPosition(0,0,valor1);
        valor2 = new Complex(2, -2);
        matriz1.AddInPosition(0,1,valor2);
        valor3 = new Complex(-1, 1);
        matriz1.AddInPosition(1,0,valor3);
        valor4 = new Complex(-2, 2);
        matriz1.AddInPosition(1,1,valor4);
        MatrixComplex matrizFinal = matriz1.Inverso();
        boolean flag = MatrixBasicOp.IgualMatrix(matrizFinal, valorEsperado);
        assertEquals(flagEsperada, flag);
    }
 @Test
    public void testMultiplicacionScalarMatrices() {
        boolean flagEsperada = true;
        MatrixComplex valorEsperado = new MatrixComplex(2,2);
        Complex valor1 = new Complex(12, 21);
        valorEsperado.AddInPosition(0,0,valor1);
        Complex valor2 = new Complex(0, 0);
        valorEsperado.AddInPosition(0,1,valor2);
        Complex valor3 = new Complex(13, 13);
        valorEsperado.AddInPosition(1,0,valor3);
        Complex valor4 = new Complex(12, 8);
        valorEsperado.AddInPosition(1,1,valor4);
        MatrixComplex matriz1 = new MatrixComplex(2,2);
        valor1 = new Complex(6, 3);
        matriz1.AddInPosition(0,0,valor1);
        valor2 = new Complex(0, 0);
        matriz1.AddInPosition(0,1,valor2);
        valor3 = new Complex(5, 1);
        matriz1.AddInPosition(1,0,valor3);
        valor4 = new Complex(4, 0);
        matriz1.AddInPosition(1,1,valor4);
        Complex complejo = new Complex(3, 2);
        MatrixComplex matrizFinal = MatrixBasicOp.multiEscalarMatriz(matriz1, complejo);
        boolean flag = MatrixBasicOp.IgualMatrix(matrizFinal, valorEsperado);
        assertEquals(flagEsperada, flag);
    }
    @Test
    public void testMultiplicacionMatrices() {
        boolean flagEsperada = true;
        MatrixComplex valorEsperado = new MatrixComplex(3,3);
        Complex valor1 = new Complex(26, -52);
        valorEsperado.AddInPosition(0,0,valor1);
        Complex valor2 = new Complex(60, 24);
        valorEsperado.AddInPosition(0,1,valor2);
        Complex valor3 = new Complex(26, 0);
        valorEsperado.AddInPosition(0,2,valor3);
        Complex valor4 = new Complex(9, 7);
        valorEsperado.AddInPosition(1,0,valor4);
        Complex valor5 = new Complex(1, 29);
        valorEsperado.AddInPosition(1,1,valor5);
        Complex valor6 = new Complex(14, 0);
        valorEsperado.AddInPosition(1,2,valor6);
        Complex valor7 = new Complex(48, -21);
        valorEsperado.AddInPosition(2,0,valor7);
        Complex valor8 = new Complex(15, 22);
        valorEsperado.AddInPosition(2,1,valor8);
        Complex valor9 = new Complex(20, -22);
        valorEsperado.AddInPosition(2,2,valor9);
        MatrixComplex matriz1 = new MatrixComplex(3,3);
        valor1 = new Complex(3, 2);
        matriz1.AddInPosition(0,0,valor1);
        valor2 = new Complex(0, 0);
        matriz1.AddInPosition(0,1,valor2);
        valor3 = new Complex(5, -6);
        matriz1.AddInPosition(0,2,valor3);
        valor4 = new Complex(1, 0);
        matriz1.AddInPosition(1,0,valor4);
        valor5 = new Complex(4, 2);
        matriz1.AddInPosition(1,1,valor5);
        valor6 = new Complex(0, 1);
        matriz1.AddInPosition(1,2,valor6);
        valor7 = new Complex(4, -1);
        matriz1.AddInPosition(2,0,valor7);
        valor8 = new Complex(0, 0);
        matriz1.AddInPosition(2,1,valor8);
        valor9 = new Complex(4, 0);
        matriz1.AddInPosition(2,2,valor9);
        MatrixComplex matriz2 = new MatrixComplex(3,3);
        valor1 = new Complex(5, 0);
        matriz2.AddInPosition(0,0,valor1);
        valor2 = new Complex(2, -1);
        matriz2.AddInPosition(0,1,valor2);
        valor3 = new Complex(6, -4);
        matriz2.AddInPosition(0,2,valor3);
        valor4 = new Complex(0, 0);
        matriz2.AddInPosition(1,0,valor4);
        valor5 = new Complex(4, 5);
        matriz2.AddInPosition(1,1,valor5);
        valor6 = new Complex(2, 0);
        matriz2.AddInPosition(1,2,valor6);
        valor7 = new Complex(7, -4);
        matriz2.AddInPosition(2,0,valor7);
        valor8 = new Complex(2, 7);
        matriz2.AddInPosition(2,1,valor8);
        valor9 = new Complex(0, 0);
        matriz2.AddInPosition(2,2,valor9);
        MatrixComplex matrizFinal = MatrixBasicOp.multiMatrices(matriz1, matriz2);
        boolean flag = MatrixBasicOp.IgualMatrix(matrizFinal, valorEsperado);
        assertEquals(flagEsperada, flag);
    }
        @Test
    public void testProductoTensor() {
        boolean flagEsperada = true;
        MatrixComplex valorEsperado = new MatrixComplex(6,4);
        Complex valor1 = new Complex(-3, 0);
        valorEsperado.AddInPosition(0,0,valor1);
        valorEsperado.AddInPosition(0,1,valor1);
        valorEsperado.AddInPosition(0,2,valor1);
        valorEsperado.AddInPosition(0,3,valor1);
        Complex valor2 = new Complex(-4, 0);
        valorEsperado.AddInPosition(1,0,valor2);
        valorEsperado.AddInPosition(1,1,valor2);
        valorEsperado.AddInPosition(1,2,valor2);
        valorEsperado.AddInPosition(1,3,valor2);
        Complex valor3 = new Complex(-7, 0);
        valorEsperado.AddInPosition(2,0,valor3);
        valorEsperado.AddInPosition(2,1,valor3);
        valorEsperado.AddInPosition(2,2,valor3);
        valorEsperado.AddInPosition(2,3,valor3);
        Complex valor4 = new Complex(6, 0);
        valorEsperado.AddInPosition(3,0,valor4);
        valorEsperado.AddInPosition(3,1,valor4);
        valorEsperado.AddInPosition(3,2,valor4);
        valorEsperado.AddInPosition(3,3,valor4);
        Complex valor5 = new Complex(8, 0);
        valorEsperado.AddInPosition(4,0,valor5);
        valorEsperado.AddInPosition(4,1,valor5);
        valorEsperado.AddInPosition(4,2,valor5);
        valorEsperado.AddInPosition(4,3,valor5);
        Complex valor6 = new Complex(14, 0);
        valorEsperado.AddInPosition(5,0,valor6);
        valorEsperado.AddInPosition(5,1,valor6);
        valorEsperado.AddInPosition(5,2,valor6);
        valorEsperado.AddInPosition(5,3,valor6);
        MatrixComplex matriz1 = new MatrixComplex(2,2);
        valor1 = new Complex(-1, 0);
        matriz1.AddInPosition(0,0,valor1);
        matriz1.AddInPosition(0,1,valor1);
        valor2 = new Complex(2, 0);
        matriz1.AddInPosition(1,0,valor2);
        matriz1.AddInPosition(1,1,valor2);
        MatrixComplex matriz2 = new MatrixComplex(3,2);
        valor1 = new Complex(3, 0);
        matriz2.AddInPosition(0,0,valor1);
        matriz2.AddInPosition(0,1,valor1);
        valor2 = new Complex(4, 0);
        matriz2.AddInPosition(1,0,valor2);
        matriz2.AddInPosition(1,1,valor2);
        valor3 = new Complex(7, 0);
        matriz2.AddInPosition(2,0,valor3);
        matriz2.AddInPosition(2,1,valor3);
        MatrixComplex matrizFinal = MatrixBasicOp.ProductoTensor(matriz1, matriz2);
        boolean flag = MatrixBasicOp.IgualMatrix(matrizFinal, valorEsperado);
        assertEquals(flagEsperada, flag);
    }
     @Test
     public void TestHermitianMatriz()
     {
        boolean flagEsperada = true;
        MatrixComplex matriz1 = new MatrixComplex(3,3);
        Complex valor1 = new Complex(5, 0);
        matriz1.AddInPosition(0,0,valor1);
        Complex valor2 = new Complex(4, 5);
        matriz1.AddInPosition(0,1,valor2);
        Complex valor3 = new Complex(6, -16);
        matriz1.AddInPosition(0,2,valor3);
        Complex valor4 = new Complex(4, -5);
        matriz1.AddInPosition(1,0,valor4);
        Complex valor5 = new Complex(13, 0);
        matriz1.AddInPosition(1,1,valor5);
        Complex valor6 = new Complex(7, 0);
        matriz1.AddInPosition(1,2,valor6);
        Complex valor7 = new Complex(6, 16);
        matriz1.AddInPosition(2,0,valor7);
        Complex valor8 = new Complex(7, 0);
        matriz1.AddInPosition(2,1,valor8);
        Complex valor9 = new Complex(-2.1, 0);
        matriz1.AddInPosition(2,2,valor9);        
        boolean flag = MatrixBasicOp.IsHermitian(matriz1);
        assertEquals(flagEsperada, flag);
     }  
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
