/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wrapper;

/**
 *
 * @author sabri
 */
public class Class {
    
    static public double Calc_Sum(double operand1, double operand2)
    {
       Double A = new Double(operand1 + operand2);
       return A;
    }
    static public double Calc_Sub(double operand1, double operand2)
    {
        Double A = new Double(operand1 - operand2);
       return A;
    }
    static public double Calc_Mul(double operand1, double operand2)
    {
        Double A = new Double(operand1 * operand2);
       return A;
    }
    static public double Calc_Quo(double operand1, double operand2)
    {
        Double A = new Double(operand1 / operand2);
       return A;
    }
    
}
