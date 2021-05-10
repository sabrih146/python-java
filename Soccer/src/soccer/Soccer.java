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
public class Soccer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SoccerPlayer player = new SoccerPlayer();
        //player.setName("Harry kim");
        System.out.println(player.getName());
        
SoccerPlayer player2 = new SoccerPlayer("Zinédine Zidane", 48, "Forward", "France");
SoccerPlayer player3 = new SoccerPlayer("Michel Platini", 65, "Forward", "France");
//SoccerPlayer player4 = new Soccerclubbase("hello" , "hello");
        player.nextgame();
        
        Club club = new Club();
       //club.setClubName("hello ");
        club.soccerMotto();
        club.setYear(20);
        SoccerPlayer.Id();
        String menuCHS = "Friday [ Pizza - Sushi";
        String allItems = menuCHs.indexOf("[")+2;
        


        //System.out.println(club.getYear());
   
    }
    
}
