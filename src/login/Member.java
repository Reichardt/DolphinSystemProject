
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
        "\nTrænerprioritet 1: " + coachChoice1 +
        "\nTrænerprioritet 2: " + coachChoice2 +
        "\nTrænerprioritet 3: " + coachChoice3;
        

    }

    @Override
    public int compareTo(Object compare) {
        int compareBirthYear = ((Member)compare).getBirthYear();
        return this.birthYear - compareBirthYear;
   }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String newFirstName) {
        firstName = newFirstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String newSurName) {
        surName = newSurName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String newEmail) {
        email = newEmail;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int newBirthYear) {
        birthYear = newBirthYear;

    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int newMemberID) {
        memberID = newMemberID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String newPassword) {
        password = newPassword;
    }

    public boolean getIsFemale() {
        return isFemale;
    }

    public void setIsFemale(boolean newIsFemale) {
        isFemale = newIsFemale;
    }

    public boolean getIsTrainer() {
        return isTrainer;
    }

    public void setIsTrainer(boolean newIsTrainer) {
        isTrainer = newIsTrainer;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean newIsActive) {
        isActive = newIsActive;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double newFee) {
        fee = newFee;
    }

    public boolean getHasPaid() {
        return hasPaid;
    }

    public void setHasPaid(boolean newHasPaid) {
        hasPaid = newHasPaid;
    }

    public boolean getButterfly() {
        return butterfly;
    }

    public void setButterfly(boolean newButterfly) {
        butterfly = newButterfly;
    }

    public double getBestTimeButterfly() {
        return bestTimeButterfly;
    }

    public void setBestTimeButterfly(double newBestTimeButterfly) {
        bestTimeButterfly = newBestTimeButterfly;
    }

    public boolean getBreast() {
        return breast;
    }

    public void setBreast(boolean newBreast) {
        breast = newBreast;
    }

    public double getBestTimeBreast() {
        return bestTimeBreast;
    }

    public void setBestTimeBreast(double newBestTimeBreast) {
        bestTimeBreast = newBestTimeBreast;
    }

    public boolean getCrawl() {
        return crawl;
    }

    public void setCrawl(boolean newCrawl) {
        crawl = newCrawl;
    }

    public double getBestTimeCrawl() {
        return bestTimeCrawl;
    }

    public void setBestTimeCrawl(double newBestTimeCrawl) {
        bestTimeCrawl = newBestTimeCrawl;
    }

    public boolean getBackCrawl() {
        return backCrawl;
    }

    public void setBackCrawl(boolean newBackCrawl) {
        backCrawl = newBackCrawl;
    }

    public double getBestTimeBackCrawl() {
        return bestTimeBackCrawl;
    }

    public void setBestTimeBackCrawl(double newBestTimeBackCrawl) {
        bestTimeBackCrawl = newBestTimeBackCrawl;
    }

    public boolean getBackStroke() {
        return backStroke;
    }

    public void setBackStroke(boolean newBackStroke) {
        backStroke = newBackStroke;
    }

    public double getBestTimeBackStroke() {
        return bestTimeBackStroke;
    }

    public void setBestTimeBackStroke(double newBestTimeBackStroke) {
        bestTimeBackStroke = newBestTimeBackStroke;
    }

    public boolean getMedley200Women() {
        return medley200Women;
    }

    public void setMedley200Women(boolean newMedley200Women) {
        medley200Women = newMedley200Women;
    }

    public double getBestTimeMedley200Women() {
        return bestTimeMedley200Women;
    }

    public void setBestTimeMedley200Women(double newBestTimeMedley200Women) {
        bestTimeMedley200Women = newBestTimeMedley200Women;
    }

    public boolean getMedley200Men() {
        return medley200Men;
    }

    public void setMedley200Men(boolean newMedley200Men) {
        medley200Men = newMedley200Men;
    }

    public double getBestTimeMedley200Men() {
        return bestTimeMedley200Men;
    }

    public void setBestTimeMedley200Men(double newBestTimeMedley200Men) {
        bestTimeMedley200Men = newBestTimeMedley200Men;
    }

    public boolean getMarathon10K() {
        return marathon10K;
    }

    public void setMarathon10K(boolean newMarathon10K) {
        marathon10K = newMarathon10K;
    }

    public double getBestTimeMarathon10K() {
        return bestTimeMarathon10K;
    }

    public void setBestTimeMarathon10K(double newBestTimeMarathon10K) {
        bestTimeMarathon10K = newBestTimeMarathon10K;
    }

    public boolean getDogPaddle() {
        return dogPaddle;
    }

    public void setDogPaddle(boolean newDogPaddle) {
        dogPaddle = newDogPaddle;
    }

    public double getBestTimeDogPaddle() {
        return bestTimeDogPaddle;
    }

    public void setBestTimeDogPaddle(double newBestTimeDogPaddle) {
        bestTimeDogPaddle = newBestTimeDogPaddle;
    }

    public int getCoachChoice1() {
        return coachChoice1;
    }

    public void setCoachChoice1(int newCoachChoice1) {
        coachChoice1 = newCoachChoice1;
    }

    public int getCoachChoice2() {
        return coachChoice2;
    }

    public void setCoachChoice2(int newCoachChoice2) {
        coachChoice2 = newCoachChoice2;
    }

    public int getCoachChoice3() {
        return coachChoice3;
    }

    public void setCoachChoice3(int newCoachChoice3) {
        coachChoice3 = newCoachChoice3;
    }
}