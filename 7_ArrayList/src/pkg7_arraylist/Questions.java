/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7_arraylist;

/**
 *
 * @author sabri
 */
public class Questions {
    private String text; 
    private int pointvalue;
    private String CorrectAnswer;
    public Questions(String text, int pointvalue, String CorrectAnswer)
    {
        this.text = text;
        this.pointvalue = pointvalue;
        this.CorrectAnswer = CorrectAnswer;
       // System.out.println(text);
    }
    public void settext(String text) {
        this.text = text;
    }
    public String gettext() {
        return text;
    }
}
