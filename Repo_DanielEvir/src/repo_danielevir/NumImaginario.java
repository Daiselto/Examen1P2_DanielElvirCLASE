/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repo_danielevir;

/**
 *
 * @author HP
 */
public class NumImaginario {
    private double numReal; 
    private double numImag; 

    public NumImaginario(double numReal, double numImag) {
        this.numReal = numReal;
        this.numImag = numImag;
    }

    public double getNumReal() {
        return numReal;
    }

    public void setNumReal(double numReal) {
        this.numReal = numReal;
    }

    public double getNumImag() {
        return numImag;
    }

    public void setNumImag(double numImag) {
        this.numImag = numImag;
    }
        

    public NumImaginario sumar(NumImaginario num) {
        double a = this.numReal + num.numReal;
        double b = this.numImag + num.numImag;
        return new NumImaginario(a, b);
    }

    public NumImaginario multiplicar(NumImaginario num) {
    double a = (this.numReal * num.numReal) - (this.numImag * num.numImag);
    double b = (this.numReal * num.numImag) + (this.numImag * num.numReal);
    
    return new NumImaginario(a, b);
}

    
    
    public String toString() {
        if (numImag >= 0) {
            return numReal + " + " + numImag + "i";
        } else {
            return numReal + " - " + Math.abs(numImag) + "i";
        }
    }
}
