/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author sabri
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Class Info = new Class();
        Info.GetInfo("sabri", "hamza", "programmer", "Kane", "Chem", 100, 160000);
        Info.Return_Info();
        System.out.println(Info.isJonior());
    }

    
    
}
