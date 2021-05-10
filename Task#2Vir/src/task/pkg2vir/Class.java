/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task.pkg2vir;

/**
 *
 * @author sabri
 */
public class Class {
    private String str1;
    private String str2;
    
    
    public void set_1string(String str1)
    {
        this.str1 = str1;
    }
    public void set_2string(String str2)
    {
        this.str2 = str2;
    }
    public String Return_1string()
    {
        return str1;
    }
    public String Return_2string()
    {
        return str2;
    }
    public String joiner(String a, String b)
    {
        return a + b;
    }
    public String greaterString()
    {
        int mat = str1.compareTo(str2);
        String result = mat >= -1 ? str1: str2; 
        return result;
    }
    public String sameString()
    {
        int mat = str1.compareTo(str2);
        String result = mat == 0 ? "Yes": "No";
        return result;
    }
    public String combo()
    {
        String first = str1.substring(0, 3);
        String last = str2.substring(str2.length()- 3, str2.length());
        return first + last;
    }
    
    
}
