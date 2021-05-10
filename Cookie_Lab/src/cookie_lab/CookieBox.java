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
public class CookieBox {
    PlainCookie[][] cookiebox = new PlainCookie[5][5];
    
    public void addCookie(PlainCookie cookie, int row, int col)
    {
        cookiebox[row][col] = cookie;
    }
    public PlainCookie orderCookie()
    {
        int Random = (int)(Math.random() * 3) + 1;
        if (Random == 1)
        {
            PlainCookie cookie1 = new PlainCookie();
            return cookie1;
        }
        else if (Random == 2)
        {
            PlainCookie cookie2 = new ChocolateChipCookie();
            return cookie2;
        }
        else if (Random == 3)
        {
            PlainCookie cookie3 = new NutChocolateChipCookie();
            return cookie3;
        }
        else
        {
            return new PlainCookie();
        }
    }
   
        
    public PlainCookie[][] populateCookieBox() {
        for ( int row =0; row < cookiebox.length;row++)
        {
            for ( int column = 0; column < cookiebox[0].length; column ++)
            {
                cookiebox[row][column] =  orderCookie();
            }
        }
        return cookiebox;
    }
    
    
    
    
    

    
    
    
    
    
    
    
    
}
    
