/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baby_name;

/**
 *
 * @author sabri
 */
public class Class {
    
    public String Baby_Name(String Mom, String Dad)
    {
        String Baby_Name = Mom.substring(0,Mom.length()) + Dad.substring(0, Dad.length());
        return Baby_Name;
    }
    
    public String Easy_Baby(String Mom, String Dad)
    {
       String Baby_Name = Mom.substring(0,1) + Dad.substring(0, 1);
       return Baby_Name;
    }
    public String Complex_Baby(String Mom, String Dad)
    {
       boolean pos = Mom.equals(Dad);
       String Res = pos ? "Young" : "Star";
       
       String Baby_Name = Mom.substring(1,Mom.length()-1) + Dad.substring(0,1) + Res;
       return Baby_Name;
    }
    public String Full_Baby(String Mom, String Dad)
    {
       
       String Baby_Name = Mom.substring(0,Mom.indexOf("u")) + Dad.substring(0,Dad.length());
       return Baby_Name;
    }
    public String Weird_Baby(String Mom, String Dad)
    {
       String Baby_Name = Mom.substring(Mom.length()-1,Mom.length()) + Dad.substring(Dad.length()-1,Dad.length());
       return Baby_Name;
    }
    
    
    
}
