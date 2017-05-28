/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.io.*;
import java.util.*;

/**
 *
 * @author Nikolaj Reichardt
 */
public class ChairmanMenu {

    public static void chairmanMenu() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Member> memberList = new ArrayList<Member>();

        /**
         FileInputStreamen læser memberList.txt filen,
         og gendanner userList ArrayListen.
         Lige nu virker denne del ikke hvis memberList.txt
         filen er blank.
         Dette bliver forhåbenligt ikke et problem, da der vel altid vil være
         mindst formandens login i filen.
         **/
        try {
            FileInputStream fis = new FileInputStream("memberList.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            memberList = (ArrayList<Member>)ois.readObject();

            ois.close();
        } catch(Exception ex) {
            ex.printStackTrace();
        }


        char menuChoice;
        boolean choiceLoop = true;
        while (choiceLoop == true)
        {

            System.out.println("Velkommen formand, hvad vil du i dag?" +
                    "\n1. Registrer nyt medlem." + "\n2. Rediger medlem" + "\n3. Slet medlem" + "\n4. Lav backup fil af madlemslisten" + "\n5. Luk Dolphin System");
            menuChoice = sc.next().charAt(0);
            switch(menuChoice) {
                /**
                Opret nyt medlem
                **/
                case '1' :
                     /**
                    Diverse variabler der bruges når nyt medlem skal ind i ArrayListen.
                    **/
                    int year = Calendar.getInstance().get(Calendar.YEAR);
                    String addUserResponse; //Holder brugerens svar om hvorvidt tilføj nyt medlem loop skal stoppes (j/n)
                    String firstName, surName, email, password;
                    int birthYear;
                    int memberID;
                    boolean hasPaid, isFemale, isActive;
                    boolean isTrainer = false;
                    boolean isElite = false;
                    double fee = 0;
                    String keyinput;

                     /**
                     Loop som fortsætter indtil et ikke-eksisterende medlemsID vælges
                     **/
                        do {
                            System.out.println("Sæt medlemsid, ID'et SKAL være fire cifre: " +
                                        "\n1 = Formand, 2 = Kasserer, 3 = Træner, 4 = Svømmer." +
                                        "\nFørste ciffer bestemmer brugerrettighedder.");
                            memberID = sc.nextInt();
                            for (int i = 0; i < memberList.size(); i++) {
                                if(memberList.get(i).getMemberID()==(memberID)) {
                                    System.out.println("MedlemsID er allerede i brug, vælg et nyt.");
                                    memberID = sc.nextInt();
                                    i = 0;
                                }
                            }
                        System.out.println("Sæt password");
                        password = sc.next();
                        System.out.println("Fornavn:");
                        firstName = sc.next();
                        System.out.println("Efternavn:");
                        surName = sc.next();
                        System.out.println("Fødselsår:");
                        birthYear = sc.nextInt();
                        System.out.println("E-mail:");
                        email = sc.next();
                        System.out.println("Er medlemmet en kvinde (j/n)");
                        keyinput = sc.next();
                        if (keyinput.equalsIgnoreCase("j")) {
                            isFemale = true;
                        } else {
                            isFemale = false;
                        }
                        /**
                        Nogle if-s?ninger for at undg?sp?rgsm?, der allerede er udelukket
                        **/
                        System.out.println("Er medlemmet aktivt? (j/n)");
                        keyinput = sc.next();
                        if (keyinput.equalsIgnoreCase("j")) {
                            isActive = true;
                            System.out.println("Er medlemmet en træner? (j/n)");
                            keyinput = sc.next();
                            if (keyinput.equalsIgnoreCase("j")) {
                                isTrainer = true;
                            } else {
                                isTrainer = false;
                                System.out.println("Er medlemmet en Elitesvømmer? (j/n)");
                                keyinput = sc.next();
                                if (keyinput.equalsIgnoreCase("j")) {
                                    isElite = true;
                                } else {
                                    isElite = false;
                                }
                            }
                        } else {
                            isActive = false;
                        }
                        System.out.println("Har medlemmet betalt? (j/n)");
                        keyinput = sc.next();
                        if (keyinput.equalsIgnoreCase("j")) {
                            hasPaid = true;
                        } else {
                            hasPaid = false;
                        }
                        if (isTrainer) {
                            //create coach
                            Coach u1 = new Coach(firstName, surName, email, birthYear, memberID, password, isFemale, fee, hasPaid);
                            memberList.add(u1);
                        } else if (isActive) {
                            if (isElite) {
                                if (year - birthYear < 18) {
                                    //create juniorelite
                                    Member u1 = new JuniorEliteSwimmer(firstName, surName, email, birthYear, memberID, password, isFemale, fee, hasPaid);
                                    memberList.add(u1);
                                } else if (year - birthYear < 60) {
                                    //create seniorelite
                                    Member u1 = new SeniorEliteSwimmer(firstName, surName, email, birthYear, memberID, password, isFemale, fee, hasPaid);
                                    memberList.add(u1);
                                } else {
                                    //create 60pluselite
                                    Member u1 = new SixtyPlusEliteSwimmer(firstName, surName, email, birthYear, memberID, password, isFemale, fee, hasPaid);
                                    memberList.add(u1);
                                }
                            } else {
                                if (year - birthYear < 18) {
                                    //create juniorexercise
                                    Member u1 = new JuniorExerciseSwimmer(firstName, surName, email, birthYear, memberID, password, isFemale, fee, hasPaid);
                                    memberList.add(u1);
                                } else if (year - birthYear < 60) {
                                    //create seniorexercise
                                    Member u1 = new SeniorExerciseSwimmer(firstName, surName, email, birthYear, memberID, password, isFemale, fee, hasPaid);
                                    memberList.add(u1);
                                } else {
                                    //create 60plusexercise
                                    Member u1 = new SixtyPlusExerciseSwimmer(firstName, surName, email, birthYear, memberID, password, isFemale, fee, hasPaid);
                                    memberList.add(u1);
                                }
                            }
                        } else {
                            //create PassiveMember
                            Member u1 = new PassiveMember(firstName, surName, email, birthYear, memberID, password, isFemale, fee, hasPaid);
                            memberList.add(u1);
                        }
                        System.out.println("Vil du tilføje et medlem mere? j/n");
                        addUserResponse = sc.next();
                        }while(addUserResponse.equalsIgnoreCase("j"));

                    /**
                     FileOutputStreamen overskriver hele memberList.txt filen så de nye medlemmer
                     som lige er blevet tilføjet også er i filen.
                     Derfor var det nødvendigt at indlæse og oprette ArrayListen først oppe i starten
                     med FileInputStream.
                     **/


                    break;
                    /**
                    Redig? medlem
                    **/
                case '2' :
                    System.out.println("Indtast medlemsID for det medlem som skal redigeres: ");
                    int editSearch = sc.nextInt();
                    int editSearchListLength = memberList.size();
                    boolean newIsActive = false;
                    boolean newIsFemale = false;
                    for (int i = 0; i < editSearchListLength; i++) {
                        if (memberList.get(i).getMemberID()==(editSearch)) {
                            boolean editMemberLoop = true;
                            while(editMemberLoop == true) {
                                System.out.println("Medlemmets nuværende data: \n");
                                System.out.println(memberList.get(i).printMember());
                                System.out.println("");
                                System.out.println("Hvad vil du redigere?"
                                        + "\n1. Fornavn. \n2. Efternavn. \n3. Fødselsår \n4. Email. \n5. Køn \n6. Træner status. "
                                        + "\n7. Aktiv/Passiv status. \n8. Afslut redigering.");

                                char editMember = sc.next().charAt(0);
                                /**
                                Switch til at v?ge hvilken egenskab, der skal redig?es
                                **/
                                switch(editMember) {
                                    case '1' :
                                        System.out.println("Angiv medlemmets nye fornavn:");
                                        String newFirstName = sc.next();
                                        memberList.get(i).setFirstName(newFirstName);
                                        break;
                                    case '2' :
                                        System.out.println("Angiv medlemmets nye efternavn:");
                                        String newSurName = sc.next();
                                        memberList.get(i).setSurName(newSurName);
                                        break;
                                    case '3' :
                                        System.out.println("Angiv medlemmets nye fødselsår:");
                                        int newBirthYear = sc.nextInt();
                                        memberList.get(i).setBirthYear(newBirthYear);
                                        break;
                                    case '4' :
                                        System.out.println("Angiv medlemmets nye email:");
                                        String newEmail = sc.next();
                                        memberList.get(i).setEmail(newEmail);
                                        break;
                                    case '5' :
                                        System.out.println("Angiv medlemmets nye køn."
                                                + "\n Er medlemmet en kvinde? (j/n)");
                                        keyinput = sc.next();
                                        if (keyinput.equalsIgnoreCase("j")) {
                                            newIsFemale = true;
                                        } else {
                                            newIsFemale = false;
                                        }
                                        memberList.get(i).setIsFemale(newIsFemale);
                                        break;
                                    case '6' :
                                        System.out.println("Angiv medlemmets nye status."
                                                + "\n Er medlemmet en træner?");
                                        boolean newTrainer = sc.nextBoolean();
                                        memberList.get(i).setIsTrainer(newTrainer);
                                        break;
                                    case '7' :
                                        System.out.println("Angiv medlemmets nye status."
                                                + "Er medlemmet aktivt? (j/n)");
                                        keyinput = sc.next();
                                        if (keyinput.equalsIgnoreCase("j")) {
                                            newIsActive = true;
                                        } else {
                                            newIsActive = false;
                                        }
                                        memberList.get(i).setIsActive(newIsActive);
                                        break;
                                    case '8' :
                                        editMemberLoop = false;
                                        break;
                                    default :
                                        System.out.println("Ugyldigt valg, prøv igen.");
                                }
                            }
                        }
                    }
                    break;
                    /**
                    Slet medlem
                    **/
                case '3' :
                    System.out.println("Indtast medlemsID for det medlem som skal slettes: ");
                    int deleteSearch = sc.nextInt();
                    int deleteSearchListLength = memberList.size();
                    for (int i = 0; i < deleteSearchListLength; i++) {
                        if (memberList.get(i).getMemberID()==(deleteSearch)) {
                            System.out.println(memberList.get(i).printMember());
                            System.out.print("Er du sikker på at du vil slette dette medlem? (j/n)");
                            String deleteMemberConfirm = sc.next();
                            if (deleteMemberConfirm.equalsIgnoreCase("j")) {
                                memberList.remove(i);
                                System.out.println("Medlemmet er blevet slettet.");
                            }
                        } else {
                            System.out.println("Ugyldigt medlemsID. Intet medlem blev slettet!");
                            System.out.println("");
                            break;
                        }
                    }
                    break;
                    /**
                    Lav backup af medlemslisten
                    **/
                case '4' :
                    System.out.print("Vil du lave en backup af medlemslisten?");
                    keyinput = sc.next();
                    if (keyinput.equalsIgnoreCase("j")) {
                        WriteData write = new WriteData();
                        write.writeData(memberList, "memberListBACKUP.txt");
                    } else {
                        break;
                    }
                    System.out.println("");
                    System.out.println("En backup af medlemslisten findes i samme mappe som medlemslisten");
                    System.out.println("med navnet memberListBACKUP.txt. Gem denne fil på et eksternt drev");
                    System.out.println("eller en USB-stick og husk at skrive dato for backup, så du ved hvornår");
                    System.out.println("den er fra.\n\n");
                    break;
                    /**
                    Luk systemet
                    **/
                case '5' :
                    choiceLoop = false;
                    break;
                default :
                    System.out.println("Ugyldigt valg, prøv igen.");
            }
        /** Herunder kalder vi klassen WriteData, som skaber en outputstream og
        skriver vores medlemsliste i en fil
        **/
        WriteData write = new WriteData();
        write.writeData(memberList, "memberList.txt");
    }
}
}