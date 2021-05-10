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
public class ChocolateChipCookie extends PlainCookie {
    private double gramsChocolateChips;

    public ChocolateChipCookie(double gramsChocolateChips, double gramsButter, double gramsSugar, double quantityEgg, double gramsSelfRaisingFlour) {
        super(gramsButter, gramsSugar, quantityEgg, gramsSelfRaisingFlour);
        this.gramsChocolateChips = gramsChocolateChips;
    }

    

    public double getGramsChocolateChips() {
        return gramsChocolateChips;
    }

    public void setGramsChocolateChips(double gramsChocolateChips) {
        this.gramsChocolateChips = gramsChocolateChips;
    }
    
    public void bake() {
        System.out.println("Add mixture to non-stick cookie pan\n"
                + "and bake at 340 degrees for 10 minutes.");
    }
    
}