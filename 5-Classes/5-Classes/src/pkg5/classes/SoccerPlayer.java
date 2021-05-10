/*
 * SoccerPlayer
 */
package pkg5.classes;

public class SoccerPlayer {

    private String name;
    private int age;
    private String position;
    private String club;
    private int goalsScored;
    final int SCORING_THRESHOLD = 20;
    final int HIGH_SCORING_THRESHOLD = 15;
    final int MID_SCORING_THRESHOLD = 10;
    final int LOW_SCORING_THRESHOLD = 5;
    public static int numPlayers;

    public SoccerPlayer() {
        SoccerPlayer.numPlayers++;
        System.out.println("Number of current players : "
                + SoccerPlayer.numPlayers);
    }

    public SoccerPlayer(String name, int age,
            String position, String club) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.club = club;

        SoccerPlayer.numPlayers++;
        System.out.println("Number of current players : "
                + SoccerPlayer.numPlayers);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return this.age;
    }

    public String getPosition() {
        return position;
    }

    public String getClub() {
        return club;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    // Other Methods
    public void nextGame() {
        System.out.println("Accessing my soccer database ..."
                + " Information in your email");
    }

    public boolean isAboveScoringThreshold() {
        if (goalsScored > SCORING_THRESHOLD) {
            System.out.println(name
                    + " is a High Goal Scorer!");
            return true;
        } else {
            System.out.println(name
                    + " is a Low Goal Scorer!");
            return false;
        }

    }

    public void showPlayerEffectivenessAlt() {

    }

    public boolean isSeniorStriker() {
        // return ((this.age >= 18) && (this.position.equals("Striker")))
        if (this.age >= 18) {
            if (this.position.equals("Striker")) {
                return true;
            }
        }
        return false;
    }

    public void showPlayerEffectiveness() {
        // Use a multi-way selection statement
        if (this.goalsScored < LOW_SCORING_THRESHOLD) {
            System.out.println("Contact coach!");
        } else if (this.goalsScored <= MID_SCORING_THRESHOLD) {
            System.out.println("Not Bad");
        } else if (this.goalsScored <= HIGH_SCORING_THRESHOLD) {
            System.out.println("Amazing");
        } else if (this.goalsScored > HIGH_SCORING_THRESHOLD) {
            System.out.println("Prolific");
        } else {
            System.out.println("Ooops");
        }

    }

    public String toString() {
        String formattedPlayer
                = this.name + " plays for " + this.club + " and is "
                + this.age + " years old.";
        return formattedPlayer;
    }
    
    public static void requirements() {
        System.out.println("Must be 18+");
    }
    
    
}




