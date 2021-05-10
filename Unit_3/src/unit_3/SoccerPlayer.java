package Unit_3;

public class SoccerPlayer {

    private String name;
    private int age;
    private String position;
    private String club;
    private int goalsScored;
    final int SCORING_THRESHOLD = 20;

    public SoccerPlayer() {
    }

    public SoccerPlayer(String name, int age, String position, String club) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.club = club;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
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
    public boolean isJuniorPlayer(){
        if (age >= 19)
        {
            System.out.println("Senior Player");
            return true;
        }
        else{
            System.out.println("Junior Player");
            return false;
        }
        
    }
    public int biggerValue(int val1, int val2) {
    if (val1 > val2)
        {
            return val1;
        }
        else{
            return val2;
        }
        
    }
    
}