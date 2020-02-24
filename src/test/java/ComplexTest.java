/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import edu.eci.cnyt.complejos.BasicOperations;
import edu.eci.cnyt.complejos.Complex;
import java.util.Objects;
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
public class ComplexTest {
    public ComplexTest(){
    }
   @Test
    public void sumaTest(){
        Complex rta=new Complex(4, 3);
        double real1=rta.getReal();
        double ima1=rta.getImaginary();
        Complex n1=new Complex(3, -1);
        Complex n2=new Complex(1, 4);
        BasicOperations op=new BasicOperations();
        Complex rtas= op.suma(n1, n2);
        double real2=rtas.getReal();
        double ima2=rtas.getImaginary();
        boolean b1= real1==real2;
        boolean b2= ima1==ima2;
        
        assertTrue(real1==real2 && ima1==ima2);
        
    }
    
    @Test
    public void restaTest(){
       
        Complex rta = new Complex(4, 12);
        double real1=rta.getReal();
        double ima1=rta.getImaginary();
        Complex n1 = new Complex(8, 20);
        Complex n2 = new Complex(4, 8);
        BasicOperations op=new BasicOperations();
        Complex rtas= op.resta(n1, n2);
        double real2=rtas.getReal();
        double ima2=rtas.getImaginary();
        boolean b1= real1==real2;
        boolean b2= ima1==ima2;
        assertTrue(real1==real2 && ima1==ima2);
        
    }
    @Test
    public void multiTest(){
       
        Complex rta = new Complex(7, 4);
        double real1=rta.getReal();
        double ima1=rta.getImaginary();
        
        Complex n1 = new Complex(3, -2);
        Complex n2 = new Complex(1, 2);
        BasicOperations op=new BasicOperations();
        Complex rtas= op.multi(n1, n2);
        double real2=rtas.getReal();
        double ima2=rtas.getImaginary();
        boolean b1= real1==real2;
        boolean b2= ima1==ima2;
       
        assertTrue(real1==real2 && ima1==ima2);
    }
    @Test
    public void divTest(){
        
        Complex rta = new Complex(0, 1);
        double real1=rta.getReal();
        double ima1=rta.getImaginary();
        Complex n1 = new Complex(-2, 1);
        Complex n2 = new Complex(1, 2);
        BasicOperations op=new BasicOperations();
        
        Complex rtas= op.div(n1, n2);
        //System.out.println(real1 +" " +ima1+" real1");
        double real2=rtas.getReal();
        double ima2=rtas.getImaginary();
        boolean b1= real1==real2;
        boolean b2= ima1==ima2;
        //System.out.println(real2 +" " +ima2+" real 2");
       
        assertTrue(real1==real2 && ima1==ima2);
     
    }
      @Test
    public void CartesianoAPolarTest(){
        boolean flagEsperada = true;
        Complex valorEsperado = new Complex(1.4142135623730951,0.7853981633974483);
        Complex valor1 = new Complex(1, 1);
        BasicOperations op=new BasicOperations();
        Complex valorRespuesta = op.CartesianoAPolar(valor1);
        boolean flag = op.iguales(valorEsperado, valorRespuesta);
        assertEquals(flagEsperada, flag);
    }
    
    
    @Test
    public void TestModulo() {
        Complex a = new Complex(1.0, -1.0);
        Double rta = a.Module();
        assertTrue((Objects.equals(rta, (Double) (Math.sqrt(2)))));
    }

    @Test
    public void TestConjugado() {
        Complex a = new Complex(1.0, -1.0);
        Complex rta = a.getconjugado();
        assertTrue(rta.getReal() == 1.0 && rta.getImaginary()== 1.0);
    }
    @Test
    public void TestFase() {
        Complex a = new Complex(1.0, 1.0);
        Double rta = a.fase();
        assertTrue(rta==0.7853981633974483 );
    }
    
}
