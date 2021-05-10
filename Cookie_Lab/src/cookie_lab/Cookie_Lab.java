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
public class Cookie_Lab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      CookieBox cookies = new CookieBox();
      cookies.populateCookieBox();
      for ( int row =0; row < cookiebox.length; row++)
        {
            for ( int column = 0; column < cookiebox[0].length; column ++)
            {
                System.out.print(cookiebox[row][column]);
            }
        }
        return cookiebox;
      
      
    }
    
}
