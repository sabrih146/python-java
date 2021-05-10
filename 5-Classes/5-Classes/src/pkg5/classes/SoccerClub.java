/*
 * SoccerClub
 */
package pkg5.classes;

import java.util.Scanner;

public class SoccerClub {

    private String name;
    private String city;
    private int yearBuilt;
    private int leaguePosition;
    final double HEIGHT_OF_POST = 7.9;
    final double T_PRICE = 3;

    public SoccerClub() {
    }

    public SoccerClub(String name, String city, int yearBuilt, int leaguePosition) {
        this.name = name;
        this.city = city;
        this.yearBuilt = yearBuilt;
        this.leaguePosition = leaguePosition;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public int getLeaguePosition() {
        return leaguePosition;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public void setLeaguePosition(int leaguePosition) {
        this.leaguePosition = leaguePosition;
    }

    // jerseyNameLength, length
    public int jerseyNamelength(SoccerPlayer player) {
        String playerName = player.getName();
        return (playerName.length());
    }

    // listMenuItems, indexOF, substring
    // Prerequisite is the inclusion of a :
    public String listMenuItems(String fullMenu) {
        int pos = fullMenu.indexOf(":") + 2;
        String items = fullMenu.substring(pos);
        return items;
    }

    // favouriteItem, indexOf, substring
    public String favouriteItem(String fullMenu) {
        int startPos = fullMenu.indexOf(":") + 2;
        int stopPos = fullMenu.indexOf(",");
        String bestItem = fullMenu.substring(startPos, stopPos);
        return bestItem;
    }

    // compareTo, listOrderedNames
    public void listOrderedNames(String name1, String name2) {
        int comp = name1.compareTo(name2);
        String names
                = (comp < 0) ? name1 + " " + name2 : name2 + " " + name1;
        System.out.println(names);
    }

    public double distanceToTopOfGoal(double distanceFromGoal) {
        double sumOfSquares = Math.pow(HEIGHT_OF_POST, 2)
                + Math.pow(distanceFromGoal, 2);
        double distance = Math.sqrt(sumOfSquares);
        return distance;
    }

// Gets a random number between min and max
    public int getRandomNumber(int min, int max) {
        int randNum = (int) (Math.random() * (max - min + 1)) + min;
        return randNum;
    }

// Gets a number between 0 and max
    public int getRandomNumber(int max) {
        int randNum = (int) (Math.random() * (max + 1));
        return randNum;
    }

    public int luckyJerseyNumber(int lowJerseyNum,
            int highJerseyNum) {
        int luckyNum
                = (int) (Math.random() * (highJerseyNum - lowJerseyNum + 1)) + lowJerseyNum;
        return luckyNum;
    }

    public boolean canBuyPlayer(double playerCost) {
        //return (playerCost <= T_PRICE);
        if (playerCost > T_PRICE) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isPlayerSeniorStriker(SoccerPlayer player) {
     // Note, could also have
     // (player.getPosition().equals("Striker") && player.getAge() >= 18)
     if (player.getPosition().equals("Striker")) {
         if (player.getAge() >= 18)
             return true;
        } 
     return false;
    }
    
    public String formatPlayerName(SoccerPlayer player) {
        String formattedStr = "";
        if (player.getPosition().equals("Keeper")) {
           if (player.getAge() >= 30)
               formattedStr = "Veteran Keeper, " +
                       player.getName();
           else
               formattedStr = "Keeper, " + player.getName();
        }
        else
            formattedStr = player.getName();
        
        return formattedStr;
    }
    
    public void quizlet() {
        System.out.println("Team of the month : "
                + "Tottenham Hotspurs");
        Scanner userIN = new Scanner(System.in);
        
        System.out.println("\nQuestion 1\n");
        System.out.println("What year was Tottenham Hotspurs  "
                + "established?");
        String answer = userIN.nextLine();
        int points = 0;
        if (answer.equals("1882")) {
            points += 1;
            System.out.println("Correct! " + points +
                    " points");
        }
        else
            System.out.println("Incorrect :(");
    }
}





