package login;

public class SixtyPlusEliteSwimmer extends SeniorEliteSwimmer {

    public SixtyPlusEliteSwimmer(String firstName, String surName, String email, int birthYear, int memberID,
                        String password, boolean isFemale, double fee, boolean hasPaid) {
        super(firstName, surName, email, birthYear, memberID, password, isFemale, fee, hasPaid);
    }

    public double getFee() {
        return super.getFee() * 0.75;
    }

}