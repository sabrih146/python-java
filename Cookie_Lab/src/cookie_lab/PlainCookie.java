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
public class PlainCookie {
    private double gramsButter;
    private double gramsSugar;
    private double quantityEgg;
    private double gramsSelfRaisingFlour;

    public PlainCookie(double gramsButter, double gramsSugar, double quantityEgg, double gramsSelfRaisingFlour) {
        this.gramsButter = gramsButter;
        this.gramsSugar = gramsSugar;
        this.quantityEgg = quantityEgg;
        this.gramsSelfRaisingFlour = gramsSelfRaisingFlour;
    }

    PlainCookie() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getGramsButter() {
        return gramsButter;
    }

    public void setGramsButter(double gramsButter) {
        this.gramsButter = gramsButter;
    }

    public double getGramsSugar() {
        return gramsSugar;
    }

    public void setGramsSugar(double gramsSugar) {
        this.gramsSugar = gramsSugar;
    }

    public double getQuantityEgg() {
        return quantityEgg;
    }

    public void setQuantityEgg(double quantityEgg) {
        this.quantityEgg = quantityEgg;
    }

    public double getGramsSelfRaisingFlour() {
        return gramsSelfRaisingFlour;
    }

    public void setGramsSelfRaisingFlour(double gramsSelfRaisingFlour) {
        this.gramsSelfRaisingFlour = gramsSelfRaisingFlour;
    }
    
    public void mix() {
        System.out.println("Mix wet and dry ingredients for 2 minutes");
    }
    
    public void bake() {
        System.out.println("Add mixture to non-stick cookie pan\n"
                + "and bake at 350 degrees for 10 minutes.");
    }
    public String toString()
    {
        String cookieConstituents = this.gramsSelfRaisingFlour + "Flour," + this.gramsButter + "grams of butter," + this.gramsSugar + " grams of sugar," + this.quantityEgg + "grams of egg mix,"
                ;
        return cookieConstituents;
    }

}
