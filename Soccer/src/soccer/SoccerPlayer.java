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
public class SoccerPlayer {
    private String name;
    private double age;
    private String position;
    private String club;
    
    //setters
    public  void setName(String playerName)
    {
       name = playerName; 
    }
    public  void setage(Double playerName)
    {
       age = playerName; 
    }
    public  void setposition(String playerName)
    {
       position = playerName; 
    }
    public  void setclub(String playerName)
    {
       club = playerName; 
    }
    //Getters
    public String getName(){ 
        return name;
    }
    public double getage(){ 
        return age;
    }
    public String getposition(){ 
        return position;
    }
    public String getclub(){ 
        return club;
    }
    
    
    
    
    public void nextgame(){
        System.out.println("Saturday at 1pm Whitehart lane");
    
    }
}
