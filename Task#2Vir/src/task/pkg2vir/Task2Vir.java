/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task.pkg2vir;

/**
 *
 * @author sabri
 */
public class Task2Vir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Class Object1 = new Class();
       
       Object1.set_1string("Hello!");
       Object1.set_2string("Hello!");
       System.out.println(Object1.Return_1string());
       System.out.println(Object1.Return_2string());
       System.out.println(Object1.joiner(Object1.Return_1string(), Object1.Return_2string()));
       System.out.println(Object1.greaterString());
       System.out.println(Object1.sameString());
       System.out.println(Object1.combo());
       
       
       
    }
    
}
