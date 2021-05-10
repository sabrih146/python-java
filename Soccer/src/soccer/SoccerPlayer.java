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
    
public SoccerPlayer(){

}


public SoccerPlayer(String name, int age, String position, String club){
this.name= name;
this.age=  age;
this.position=  position;
this.club= club;
System.out.println(name+" "+ age+ " "+ position+ " " + club);
}
public void Soccerclubbase(String name, String club){
this.name= name;
this.club= club;
System.out.println(name+" "+ club);
}
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
    public static void Id()
{

        String stadium = "stadium";
        String oldStadium = "White Hart leng";
        int len = stadium.length();
        Club club = new Club();
        SoccerPlayer player = new SoccerPlayer();
        player.setName("Harry kim");
        String food = "Hot Dogs";
        int pos = food.indexOf("D");
        System.out.print(pos);

}


public int numLettersOnJersey(String playerName)
{
return (playerName.length());

}

public String topMenu(String fullMenu)
{
int startPos = fullMenu.indexOf(".") + 1;
int stopPos = fullMenu.indexOf(",");
}
public void ListNamesinorder(String name1, String name2)
{
int res = name1.compareTo(name2);
String orderedNames = (res > 0) ? name1 +" " + name2: name2 + " " + name1;
}
    
    
    
    public void nextgame(){
        //System.out.println("Saturday at 1pm Whitehart lane");
    
    }
}
