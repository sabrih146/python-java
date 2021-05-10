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
public class methods {
    public String holder;
    public void swapPlayers(int index1, int index2, String[] Soccer_Names)
    {
        holder = Soccer_Names[index1];
        Soccer_Names[index1] = Soccer_Names[index2];
        Soccer_Names[index2] = holder;
    }
}
