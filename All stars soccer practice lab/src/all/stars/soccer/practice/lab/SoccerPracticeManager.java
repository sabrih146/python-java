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
public class SoccerPracticeManager {
    private String[] allPlayers = {"Lionel Messi", "Cristiano Ronaldo" ,"Neymar" ,"Robert Lewandowski", "Kylian Mbappé"};
     private String[] Positions = {"Goalkeeper", "Defender" ,"Midfielder" ,"Forward", "Striker"};
    
    public String[] GetPlayers ()
    {
        return allPlayers;
    }
    public String[] GetPosition ()
    {
        return Positions;
    }
    public String[] practiceLineUp ()
    {
        String[] practiceNeeds = new String[25];
        int index = 0;
        for (String playerName : allPlayers)
            for (String position : Positions) {
                practiceNeeds[index] = playerName + " : " + position;
                index++;
                 }
   return practiceNeeds;
    }
    
    public String testRandomSkills()
    {
        int random = (int) (Math.random()*(5));
        int random2 = (int) (Math.random()*(5));
        String SelectedSkills = allPlayers[random] + " " + Positions[random2];
        return SelectedSkills;
        
        
    }
    
    
    
    
    
    
}
