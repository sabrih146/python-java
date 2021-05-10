/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.classes;

/**
 *
 * @author tkane
 */
public class Classes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
swapper();
}

    public static void calibrate(int x, String s1, String s2) {
  x++;
  s1="The city of" + s1;
  s2 = new String(", Capital");
  }

public static void printCity() {
   int k = 1;
   String s1 = "Copenhagen";
   String s2 = "of Denmark";

   calibrate(k, s1, s2);

   System.out.println(k + ": " + s1 + " " + s2);
}
    
    
/*
        // TODO code application logic here
        SoccerPlayer.requirements();
        SoccerPlayer player1 = new SoccerPlayer();

        SoccerPlayer player2
                = new SoccerPlayer("Grant", 17, "midfield", "CHS");
        SoccerPlayer player3
                = new SoccerPlayer("Sam", 17, "midfield", "CHS");
        SoccerPlayer player4 = new SoccerPlayer();
        SoccerPlayer player5
                = new SoccerPlayer("Tynan", 17, "midfield", "CHS");
        System.out.println("Total players is "
                + SoccerPlayer.numPlayers);
        
        int val = 5;
        String name = "Purple Rain";
        System.out.println("Val : " + val + " player name : " +
                player5.getName() + " Agent name : " + name);
        changer(val, player5, name);
                System.out.println("Val : " + val + " player name : " +
                player5.getName() + " Agent name : " + name);
     
    }
  */ 
    public static void changer(int count, SoccerPlayer player,
            String agent) {
        count += 7;
        player.setName("Ben Holdcraft");
        agent += "!!!!!!!!!!!!!!";
    }
    
        public static void swapper() {
SoccerPlayer player1 = 
        new SoccerPlayer("Harry Kane", 27, "Forward", "Tottenham");
SoccerPlayer player2 = 
        new SoccerPlayer("Christy Roe", 27, "Forward", "Manchester City");
SoccerPlayer player3 = 
        new SoccerPlayer("Francis Blake", 27, "Forward", "Leeds Utd");
SoccerPlayer player4 = 
        new SoccerPlayer("Robbie Roe", 27, "Forward", "Leicester");

SoccerPlayer temp;

temp = player3;

player1 = player2;
player3 = player4;
player3 = temp;
player4 = player1;

            System.out.println(" player 1 : " + player1.getName() +
                    "  player2 : " + player2.getName() + 
                    "  player3 : " + player3.getName() + 
                    "  player4 : " + player4.getName());
    }
}
