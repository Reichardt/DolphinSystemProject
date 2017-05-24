
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
        return "Medlems ID: " + memberID +
        "\nFornavn: " + firstName +
        "\nEfternavn: " + surName +
        "\nFødselsdato: " + birthYear +
        "\nE-mail: " + email +
        "\nKvinde?: "+isFemale +
        "\nTræner?: " +isTrainer +
        "\nAktivt medlem? : " + isActive +
        "\nKontingentafgift: " + getFee() +
        "\nBetalt? " + hasPaid;

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

}