/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timestable;

/**
 *
 * @author sabri
 */
public class Times {
    public static int[][] MultiplicationTables (int Values[][])
    {
        for(int row = 0; row < Values.length; row++)
        {
            for(int column = 0; column < Values[0].length; column++)
            {
                Values[row][column] = row*column;
            }
        }
        return Values;
    }
    public static void formattable(int Values[][])
    {
        for(int row = 1; row < Values.length; row++)
        {
            for(int column = 1; column < Values[0].length; column++)
            {
                System.out.print(Values[row][column] + "\t");
            }
            System.out.println();
        }
    }
}
