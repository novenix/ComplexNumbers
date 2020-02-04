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
public class vectorTest {
    
    public vectorTest() {
    }
    
     @Test
    public void testCalcularSumaVectores() {
        boolean flagEsperada = true;
         VectorComplex valorEsperado = new VectorComplex(4);
        Complex valor1 = new Complex(22, -1.7);
        valorEsperado.AddValue(valor1);
        Complex valor2 = new Complex(7, -4);
        valorEsperado.AddValue(valor2);
        Complex valor3 = new Complex(10.2, -8.1);
        valorEsperado.AddValue(valor3);
        Complex valor4 = new Complex(0, -7);
        valorEsperado.AddValue(valor4);
        VectorComplex vector1 = new VectorComplex(4);
        valor1 = new Complex(6, -4);
        vector1.AddValue(valor1);
        valor2 = new Complex(7, 3);
        vector1.AddValue(valor2);
        valor3 = new Complex(4.2, -8.1);
        vector1.AddValue(valor3);
        valor4 = new Complex(0, -3);
        vector1.AddValue(valor4);
        VectorComplex vector2 = new VectorComplex(4);
        valor1 = new Complex(16, 2.3);
        vector2.AddValue(valor1);
        valor2 = new Complex(0, -7);
        vector2.AddValue(valor2);
        valor3 = new Complex(6, 0);
        vector2.AddValue(valor3);
        valor4 = new Complex(0, -4);
        vector2.AddValue(valor4);
        VectorComplex valorRespuesta = VectorBasicOp.sumaVectores(vector1, vector2);
        boolean flag = VectorBasicOp.IgualdadVectores(valorRespuesta, valorEsperado);
        assertEquals(flagEsperada, flag);
    }
      @Test
    public void testInverso(){
        boolean flagEsperada = true;
        VectorComplex valorEsperado = new VectorComplex(4);
        Complex valor1 = new Complex(-6, -3);
        valorEsperado.AddValue(valor1);
        Complex valor2 = new Complex(-2, 2);
        valorEsperado.AddValue(valor2);
        Complex valor3 = new Complex(-5, 1);
        valorEsperado.AddValue(valor3);
        Complex valor4 = new Complex(12, 0);
        valorEsperado.AddValue(valor4);
        VectorComplex vector2 = new VectorComplex(4);
        valor1 = new Complex(6, 3);
        vector2.AddValue(valor1);
        valor2 = new Complex(2, -2);
        vector2.AddValue(valor2);
        valor3 = new Complex(5, -1);
        vector2.AddValue(valor3);
        valor4 = new Complex(-12, 0);
        vector2.AddValue(valor4);
        VectorComplex valorRespuesta = vector2.Inverso();
        boolean flag = VectorBasicOp.IgualdadVectores(valorRespuesta, valorEsperado);
        assertEquals(flagEsperada, flag);
    }
     @Test
    public void testMultiplicacionScalar(){
        boolean flagEsperada = true;
        VectorComplex valorEsperado = new VectorComplex(4);
        Complex valor1 = new Complex(12, 21);
        valorEsperado.AddValue(valor1);
        Complex valor2 = new Complex(0, 0);
        valorEsperado.AddValue(valor2);
        Complex valor3 = new Complex(13, 13);
        valorEsperado.AddValue(valor3);
        Complex valor4 = new Complex(12, 8);
        valorEsperado.AddValue(valor4);
        Complex valorcomplejo = new Complex(3, 2);
        VectorComplex vector2 = new VectorComplex(4);
        valor1 = new Complex(6, 3);
        vector2.AddValue(valor1);
        valor2 = new Complex(0, 0);
        vector2.AddValue(valor2);
        valor3 = new Complex(5, 1);
        vector2.AddValue(valor3);
        valor4 = new Complex(4, 0);
        vector2.AddValue(valor4);
        VectorComplex valorRespuesta = VectorBasicOp.MultiEscalVector (valorcomplejo, vector2);
        boolean flag = VectorBasicOp.IgualdadVectores(valorRespuesta, valorEsperado);
        assertEquals(flagEsperada, flag);
    
    }
 

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
