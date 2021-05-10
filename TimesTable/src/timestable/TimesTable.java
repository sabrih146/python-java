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
public class TimesTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Times Mul = new Times();
        //int[][] nums;
        //nums = new int[13][13];
        //Mul.MultiplicationTables(nums);
        //Mul.formattable(nums);
         int[][] nums = {{1,2,3}, {4,5,6}, {7,8,9}};

for (    int[] rowOfNumbers: nums) {

for (int val : rowOfNumbers) {

System.out.println(val + "");

}
   }
    
}
}
