/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import edu.eci.cnyt.complejos.ClassicAndCuantic;
import edu.eci.cnyt.complejos.Complex;
import edu.eci.cnyt.complejos.VectorComplex;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class SistemaLineasTest {
    
    public SistemaLineasTest() {
    }
    
   @Test
    public void Sistema_cuántico_de_partícula_en_una_línea() {
        System.out.println("-----------------Sistema_cuántico_de_partícula_en_una_línea-----------------------");
        Complex[] linea = {
            new Complex(2.0, 1.0),
            new Complex(-1.0, 2.0),
            new Complex(0.0, 1.0),
            new Complex(1.0, 0.0),
            new Complex(3.0, -1.0),
            new Complex(2.0, 0.0),
            new Complex(0.0, -2.0),
            new Complex(-2.0, 1.0),
            new Complex(1.0, -3.0),
            new Complex(0.0, -1.0)
        };

        for (int i = 0; i < linea.length; i++) {
            System.out.println(ClassicAndCuantic.SistemaCuanticoParticulaDeUnalínea(linea, i));
        }
        System.out.println("----------------------------------------");

    }

    @Test
    public void probTransitarVectorAtro() {
        System.out.println("-----------------Sistema_cuántico_de_transicionnnn_en_una_línea-----------------------");
        ArrayList<Complex> linea = new ArrayList<>();
        linea.add(new Complex(2.0, 1.0));
        linea.add(new Complex(-1.0, 2.0));
        linea.add(new Complex(0.0, 1.0));
        linea.add(new Complex(1.0, 0.0));
        linea.add(new Complex(3.0, -1.0));
        linea.add(new Complex(2.0, 0.0));
        linea.add(new Complex(0.0, -2.0));
        linea.add(new Complex(-2.0, 1.0));
        linea.add(new Complex(1.0, -3.0));
        linea.add(new Complex(0.0, -1.0));

        ArrayList<Complex> linea2 = new ArrayList<>();
        linea2.add(new Complex(-1.0, -4.0));
        linea2.add(new Complex(2.0, -3.0));
        linea2.add(new Complex(-7.0, 6.0));
        linea2.add(new Complex(-1.0, 1.0));
        linea2.add(new Complex(-5.0, -3.0));
        linea2.add(new Complex(5.0, 0.0));
        linea2.add(new Complex(5.0, 8.0));
        linea2.add(new Complex(4.0, -4.0));
        linea2.add(new Complex(8.0, -7.0));
        linea2.add(new Complex(2.0, -7.0));
        System.out.println(ClassicAndCuantic.transitarvectorAotro(new  VectorComplex (linea),new VectorComplex(linea2)));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
