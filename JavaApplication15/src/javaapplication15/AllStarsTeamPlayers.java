/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

/**
 *
 * @author sabri
 */
public class AllStarsTeamPlayers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Class ArrayInfo[] = new Class[5];
        ArrayInfo[0] = new Class("Precious Achiuwa", 21);
        ArrayInfo[1] = new Class("Bam Adebayo", 21);
        ArrayInfo[2] = new Class("Avery Bradley", 21);
        ArrayInfo[3] = new Class("Jimmy Butler", 21);
        ArrayInfo[4] = new Class("Goran Dragic", 21);
        
        ArrayInfo[2].display();
        
        
        int random = (int) (Math.random()*(4));
        
        ArrayInfo[random].display();
        
        
        
        
        
        
    }
    
}
