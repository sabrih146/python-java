/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swapping.array.elements;

/**
 *
 * @author sabri
 */
public class SwappingArrayElements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        methods Soccer = new methods();
        String[] Soccer_Names = {"Kalidou Koulibaly", "Sadio Mane", "Eden Hazard", "Paul Pogba", "Kylian Mbappe", "Kevin De Bruyne", "Virgil Van Dijk", "N'Golo Kante", "Neymar", "Lionel Messi"};
         Soccer.swapPlayers(0,1,Soccer_Names); // Switch 0 and 1 position of the array
         System.out.println(Soccer_Names[0] + " is position 0 and " +  Soccer_Names[1] +" is position 1");
         
         
    }
    
}
