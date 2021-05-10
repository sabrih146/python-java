/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package all.stars.soccer.practice.lab;

/**
 *
 * @author sabri
 */
import java.util.Random;
public class AllStarsSoccerPracticeLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SoccerPracticeManager player = new SoccerPracticeManager();
        
        String[] PlayerList;
        PlayerList = player.GetPlayers();
        
        String[] PlayerPosition;
        PlayerPosition = player.GetPosition();
        
        String[] requirements;
        requirements = player.practiceLineUp();
       
        for (int index = 0; index < requirements.length; index++)
        {
            System.out.println(requirements[index]);
        }
        
        System.out.println("Random: " + player.testRandomSkills());
        
        
        
        
    }
    
}
