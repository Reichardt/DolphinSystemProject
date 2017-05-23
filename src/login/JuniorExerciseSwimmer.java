package login;

public class JuniorExerciseSwimmer extends ExerciseSwimmer {

    public JuniorExerciseSwimmer(String firstName, String surName, String email, int birthYear, int memberID,
                        String password, boolean isFemale, double fee, boolean hasPaid) {
        super(firstName, surName, email, birthYear, memberID, password, isFemale, fee, hasPaid);
    }

    public double getFee() {
        return super.getFee() * 0.625;
    }

}