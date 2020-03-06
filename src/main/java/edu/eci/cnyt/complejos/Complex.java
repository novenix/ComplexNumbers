package edu.eci.cnyt.complejos;
import java.math.BigDecimal;

public class Complex {
	private double realNumber;
	private double imaginaryNumber;
        private Double  real;
        private Double  imaginrio;
        public Complex(Double real, Double imaginrio){
        this.real=real;
        this.imaginrio=imaginrio;
    }
	public Complex(double real,double imaginary){
		realNumber=real;
		imaginaryNumber=imaginary;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public double getReal() {
		return realNumber;
	}
	public double getImaginary() {
		return imaginaryNumber;
	}
        public Complex getconjugado() {
                
                Complex conju=new Complex(realNumber, imaginaryNumber*-1);
		return conju;
	}
        public double Module(){
        double a = Math.pow(realNumber, 2);
        double b = Math.pow(imaginaryNumber, 2);
        double suma = a+b;
        double respuesta =  Math.sqrt(suma);
        return respuesta;        
    }
        public double fase(){
       double tangenteH = Math.atan2(imaginaryNumber,realNumber);
        //double division = imaginaryNumber/realNumber;
        //double tangenteH = Math.atan(division);
        return tangenteH;
    }
}
