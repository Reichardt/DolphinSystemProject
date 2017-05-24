
package login;
import java.io.Serializable;
import java.util.*;

public class Member implements Serializable, Comparable {
    private static final long serialVersionUID = -388040256197985515L;

    private String firstName;
    private String surName;
    private String email;
    private int birthYear;
    private int memberID;
    private String password;
    private boolean isFemale;
    private boolean isTrainer;
    private boolean isActive;
    private double fee;
    private boolean hasPaid;
    private boolean butterfly;
    private double bestTimeButterfly;
    private boolean breast;
    private double bestTimeBreast;
    private boolean crawl;
    private double bestTimeCrawl;
    private boolean backCrawl;
    private double bestTimeBackCrawl;
    private boolean backStroke;
    private double bestTimeBackStroke;
    private boolean medley200Women;
    private double bestTimeMedley200Women;
    private boolean medley200Men;
    private double bestTimeMedley200Men;
    private boolean marathon10K;
    private double bestTimeMarathon10K;
    private boolean dogPaddle;
    private double bestTimeDogPaddle;
    private int coachChoice1;
    private int coachChoice2;
    private int coachChoice3;


    public Member(String firstName, String surName, String email, int birthYear, int memberID,
                  String password, boolean isFemale, double fee, boolean hasPaid) {
        this.firstName = firstName;
        this.surName = surName;
        this.email = email;
        this.birthYear = birthYear;
        this.memberID = memberID;
        this.password = password;
        this.isFemale = isFemale;
        this.fee = 1600;
        this.hasPaid = hasPaid;
        
    }

    public Member() {
    }

        public String printMember()
    {
        String sex;
        String coach;
        String aktiv;
        String betalt;
        if (isFemale) {
            sex = "kvinde";
        } else {
            sex = "mand";
        }
        if (isTrainer) {
            coach = "ja";
        } else {
            coach = "nej";
        }
        if (isActive) {
            aktiv = "ja";
        } else {
            aktiv = "nej";
        }
        if (hasPaid) {
            betalt = "ja";
        } else {
            betalt = "nej";
        }

        return "Medlems ID: " + memberID +
        "\nFornavn: " + firstName +
        "\nEfternavn: " + surName +
        "\nFødselsdato: " + birthYear +
        "\nE-mail: " + email +
        "\nKøn: "+ sex +
        "\nTræner: " + coach +
        "\nAktivt medlem? : " + aktiv +
        "\nKontingentafgift: " + getFee() +
        "\nBetalt? " + betalt +
        "\nCoach 1: " + coachChoice1 ;

    }

    @Override
    public int compareTo(Object compare) {
        int compareMemberID = ((Member)compare).getMemberID();
        return this.memberID - compareMemberID;
   }

    public String getFirstName() {
        return firstName;
    }

    public String setFirstName(String newFirstName) {
        firstName = newFirstName;
        return newFirstName;
    }

    public String getSurName() {
        return surName;
    }

    public String setSurName(String newSurName) {
        surName = newSurName;
        return newSurName;
    }

    public String getEmail() {
        return email;
    }

    public String setEmail(String newEmail) {
        email = newEmail;
        return newEmail;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int setBirthYear(int newBirthYear) {
        birthYear = newBirthYear;
        return newBirthYear;
    }

    public int getMemberID() {
        return memberID;
    }

    public int setMemberID(int newMemberID) {
        memberID = newMemberID;
        return newMemberID;
    }

    public String getPassword() {
        return password;
    }

    public String setPassword(String newPassword) {
        password = newPassword;
        return newPassword;
    }

    public boolean getIsFemale() {
        return isFemale;
    }

    public boolean setIsFemale(boolean newIsFemale) {
        isFemale = newIsFemale;
        return newIsFemale;
    }

    public boolean getIsTrainer() {
        return isTrainer;
    }

    public boolean setIsTrainer(boolean newIsTrainer) {
        isTrainer = newIsTrainer;
        return newIsTrainer;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public boolean setIsActive(boolean newIsActive) {
        isActive = newIsActive;
        return newIsActive;
    }

    public double getFee() {
        return fee;
    }

    public double setFee(double newFee) {
        fee = newFee;
        return newFee;
    }

    public boolean getHasPaid() {
        return hasPaid;
    }

    public boolean setHasPaid(boolean newHasPaid) {
        hasPaid = newHasPaid;
        return newHasPaid;
    }
        public boolean getButterfly() {
        return butterfly;
    }

    public boolean setButterfly(boolean newButterfly) {
        butterfly = newButterfly;
        return newButterfly;
    }

    public double getBestTimeButterfly() {
        return bestTimeButterfly;
    }

    public double setBestTimeButterfly(double newBestTimeButterfly) {
        bestTimeButterfly = newBestTimeButterfly;
        return newBestTimeButterfly;
    }

    public boolean getBreast() {
        return breast;
    }

    public boolean setBreast(boolean newBreast) {
        breast = newBreast;
        return newBreast;
    }

    public double getBestTimeBreast() {
        return bestTimeBreast;
    }

    public double setBestTimeBreast(double newBestTimeBreast) {
        bestTimeBreast = newBestTimeBreast;
        return newBestTimeBreast;
    }

    public boolean getCrawl() {
        return crawl;
    }

    public boolean setCrawl(boolean newCrawl) {
        crawl = newCrawl;
        return newCrawl;
    }

    public double getBestTimeCrawl() {
        return bestTimeCrawl;
    }

    public double setBestTimeCrawl(double newBestTimeCrawl) {
        bestTimeCrawl = newBestTimeCrawl;
        return newBestTimeCrawl;
    }

    public boolean getBackCrawl() {
        return backCrawl;
    }

    public boolean setBackCrawl(boolean newBackCrawl) {
        backCrawl = newBackCrawl;
        return newBackCrawl;
    }

    public double getBestTimeBackCrawl() {
        return bestTimeBackCrawl;
    }

    public double setBestTimeBackCrawl(double newBestTimeBackCrawl) {
        bestTimeBackCrawl = newBestTimeBackCrawl;
        return newBestTimeBackCrawl;
    }

    public boolean getBackStroke() {
        return backStroke;
    }

    public boolean setBackStroke(boolean newBackStroke) {
        backStroke = newBackStroke;
        return newBackStroke;
    }

    public double getBestTimeBackStroke() {
        return bestTimeBackStroke;
    }

    public double setBestTimeBackStroke(double newBestTimeBackStroke) {
        bestTimeBackStroke = newBestTimeBackStroke;
        return newBestTimeBackStroke;
    }

    public boolean getMedley200Women() {
        return medley200Women;
    }

    public boolean setMedley200Women(boolean newMedley200Women) {
        medley200Women = newMedley200Women;
        return newMedley200Women;
    }

    public double getBestTimeMedley200Women() {
        return bestTimeMedley200Women;
    }

    public double setBestTimeMedley200Women(double newBestTimeMedley200Women) {
        bestTimeMedley200Women = newBestTimeMedley200Women;
        return newBestTimeMedley200Women;
    }

    public boolean getMedley200Men() {
        return medley200Men;
    }

    public boolean setMedley200Men(boolean newMedley200Men) {
        medley200Men = newMedley200Men;
        return newMedley200Men;
    }

    public double getBestTimeMedley200Men() {
        return bestTimeMedley200Men;
    }

    public double setBestTimeMedley200Men(double newBestTimeMedley200Men) {
        bestTimeMedley200Men = newBestTimeMedley200Men;
        return newBestTimeMedley200Men;
    }

    public boolean getMarathon10K() {
        return marathon10K;
    }

    public boolean setMarathon10K(boolean newMarathon10K) {
        marathon10K = newMarathon10K;
        return newMarathon10K;
    }

    public double getBestTimeMarathon10K() {
        return bestTimeMarathon10K;
    }

    public double setBestTimeMarathon10K(double newBestTimeMarathon10K) {
        bestTimeMarathon10K = newBestTimeMarathon10K;
        return newBestTimeMarathon10K;
    }

    public boolean getDogPaddle() {
        return dogPaddle;
    }

    public boolean setDogPaddle(boolean newDogPaddle) {
        dogPaddle = newDogPaddle;
        return newDogPaddle;
    }

    public double getBestTimeDogPaddle() {
        return bestTimeDogPaddle;
    }

    public double setBestTimeDogPaddle(double newBestTimeDogPaddle) {
        bestTimeDogPaddle = newBestTimeDogPaddle;
        return newBestTimeDogPaddle;
    }

    public int getCoachChoice1() {
        return coachChoice1;
    }

    public int setCoachChoice1(int newCoachChoice1) {
        coachChoice1 = newCoachChoice1;
        return newCoachChoice1;
    }

    public int getCoachChoice2() {
        return coachChoice2;
    }

    public int setCoachChoice2(int newCoachChoice2) {
        coachChoice2 = newCoachChoice2;
        return newCoachChoice2;
    }

    public int getCoachChoice3() {
        return coachChoice3;
    }

    public int setCoachChoice3(int newCoachChoice3) {
        coachChoice3 = newCoachChoice3;
        return newCoachChoice3;
    }

}