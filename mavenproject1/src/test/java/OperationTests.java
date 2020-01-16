/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2137260
 */
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*; 
import edu.eci.cnyt.complex.*;

public class OperationTests {
    
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
    
    
    
}
