/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7_arraylist;

import java.util.ArrayList;

/**
 *
 * @author sabri
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create an arraylist
        
        ArrayList <Questions> AllQuestions = new ArrayList<>();
        
        
                
        AllQuestions.add(new Questions("What is 1 + 1", 2, "2"));
        AllQuestions.add(new Questions("What is 1 + 2", 2, "3"));
        AllQuestions.add(new Questions("What is 1 + 3", 2, "4"));
        AllQuestions.add(new Questions("What is 1 + 4", 2, "5"));
        AllQuestions.add(new Questions("What is 1 + 5", 2, "6"));
        
        System.out.print(AllQuestions.get(0).gettext());
        //Questions question1 = AllQuestions.get(0);
        
        
    }
    
}
