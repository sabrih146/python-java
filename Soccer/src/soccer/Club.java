/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccer;

/**
 *
 * @author sabri
 */
public class Club {
    private String name;
    private int yearBuilt;
    private String premierLeaguePosition;
    
    public  void setClubName(String playerName)
    {
       name = playerName; 
    }
    public  void setYear(int playerName)
    {
       yearBuilt = playerName; 
    }
    public  void League(String playerName)
    {
       premierLeaguePosition = playerName; 
    }
    //Getters
    public String getName(){ 
        return name;
    }
    public double getYear(){ 
        return yearBuilt;
    }
    public String getLeague(){ 
        return premierLeaguePosition;
    }
    
    
    
    public void soccerMotto()
    {
        //System.out.println("be");
    }
    
}
