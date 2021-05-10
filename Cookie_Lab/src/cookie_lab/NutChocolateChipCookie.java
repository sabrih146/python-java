/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cookie_lab;

/**
 *
 * @author sabri
 */
public class NutChocolateChipCookie extends ChocolateChipCookie{
    private double gramsMixedNuts;

    public NutChocolateChipCookie(double gramsMixedNuts, double gramsChocolateChips, double gramsButter, double gramsSugar, double quantityEgg, double gramsSelfRaisingFlour) {
        super(gramsChocolateChips, gramsButter, gramsSugar, quantityEgg, gramsSelfRaisingFlour);
        this.gramsMixedNuts = gramsMixedNuts;
    }

 

    public double getGramsMixedNuts() {
        return gramsMixedNuts;
    }

    public void setGramsMixedNuts(double gramsMixedNuts) {
        this.gramsMixedNuts = gramsMixedNuts;
    }
    
    public void bake() {
        System.out.println("Add mixture to non-stick cookie pan\n"
                + "and bake at 330 degrees for 8 minutes.");
    }
    
    
}