/*
 * 
 */
package pkg5.classes;

/**
 *
 * @author tkane
 */
public class ClubManager {

    private int yearsOfExperience;
    private String lastManagedClub;
    private int age;
    private int yearsAsPlayer;
    private int numberOfMajorClubWins;
    private String instantContact;



    public ClubManager() {
    }

    public ClubManager(int yearsOfExperience, String lastManagedClub, 
            int age, int yearsAsPlayer, int numberOfMajorClubWins) {
        this.yearsOfExperience = yearsOfExperience;
        this.lastManagedClub = lastManagedClub;
        this.age = age;
        this.yearsAsPlayer = yearsAsPlayer;
        this.numberOfMajorClubWins = numberOfMajorClubWins;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public String getLastManagedClub() {
        return lastManagedClub;
    }

    public int getAge() {
        return age;
    }

    public int getYearsAsPlayer() {
        return yearsAsPlayer;
    }

    public int getNumberOfMajorClubWins() {
        return numberOfMajorClubWins;
    }

    
        public String getInstantContact() {
        return instantContact;
    }

    public void setInstantContact(String instantContact) {
        this.instantContact = instantContact;
    }
    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public void setLastManagedClub(String lastManagedClub) {
        this.lastManagedClub = lastManagedClub;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setYearsAsPlayer(int yearsAsPlayer) {
        this.yearsAsPlayer = yearsAsPlayer;
    }

    public void setNumberOfMajorClubWins(int numberOfMajorClubWins) {
        this.numberOfMajorClubWins = numberOfMajorClubWins;
    }

    public void broadcastUrgentMessage(int indicator) {
        if (indicator == 0) {
            System.out.println("To all coaches");
        } else if (indicator == 1) {
            System.out.println("To all players");
        } else if (indicator == 2) {
            System.out.println("to all sponsors");
        }
    }
    
    private boolean submitResignation() {
        System.out.println("I Quit");
        return true;
    }

}



