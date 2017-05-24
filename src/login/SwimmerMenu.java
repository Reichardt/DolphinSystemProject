/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;


public class SwimmerMenu {
    public static void swimmerMenu(int memberID) {
         Scanner sc = new Scanner(System.in);
         ArrayList<Member> memberList = new ArrayList<Member>();

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

            System.out.println("Velkommen svømmer, hvad vil du i dag?" +
                    "\n1. Vælg foretrukne trænere." + "\n2. Registrér aktive discipliner" + "\n3. Luk Dolphin System");
            menuChoice = sc.next().charAt(0);
            switch(menuChoice) {
                case '1' :
                    System.out.println("Liste over trænere:");
                    for (int i = 0; i < memberList.size(); i++) {
                        if (memberList.get(i).getMemberID()/1000==3) {
                            System.out.println("ID: " +memberList.get(i).getMemberID() + 
                                    ", Fornavn: " +memberList.get(i).getFirstName() + 
                                    ", Efternavn: " +memberList.get(i).getSurName());
                        }
                    }
                    System.out.println("MedlemsID:"+memberID);
                    for (int i = 0; i < memberList.size(); i++) {
                        if (memberList.get(i).getMemberID()==memberID) {
                            System.out.println("Angiv ID på de 3 trænere du vil have.");
                            System.out.println("Træner 1 (førsteprioritet):");
                            int coachChoice1 = sc.nextInt();
                            memberList.get(i).setCoachChoice1(coachChoice1);                           
                            System.out.println("Træner 2 (andenprioritet):");
                            int coachChoice2 = sc.nextInt();
                            memberList.get(i).setCoachChoice2(coachChoice2);                           
                            System.out.println("Træner 3 (tredjeprioritet):");
                            int coachChoice3 = sc.nextInt();
                            memberList.get(i).setCoachChoice3(coachChoice3);
                            
                        }
                    }
                    try {
                        FileOutputStream fos = new FileOutputStream("memberList.txt");
                        ObjectOutputStream oos = new ObjectOutputStream(fos);
                        oos.writeObject(memberList); // write memberList to ObjectOutputStream
                        oos.close();
                    } catch(Exception ex) {
                        ex.printStackTrace();
                    }
                    break;
                case '2' :
                    for (int i = 0; i < memberList.size(); i++) {
                        if (memberList.get(i).getMemberID()==memberID) {
                            System.out.println("Er du aktiv i butterfly? (j/n)");
                            String butterflyResponse = sc.next();
                            if (butterflyResponse.equalsIgnoreCase("j")) {
                                memberList.get(i).setButterfly(true);
                            } else {
                                memberList.get(i).setButterfly(false);
                            }
                            System.out.println("Er du aktiv i brystsvømning? (j/n)");
                            String breastResponse = sc.next();
                            if (breastResponse.equalsIgnoreCase("j")) {
                                memberList.get(i).setBreast(true);
                            } else {
                                memberList.get(i).setBreast(false);
                            }
                            System.out.println("Er du aktiv i crawl? (j/n)");
                            String crawlResponse = sc.next();
                            if (crawlResponse.equalsIgnoreCase("j")) {
                                memberList.get(i).setCrawl(true);
                            } else {
                                memberList.get(i).setCrawl(false);
                            }
                            System.out.println("Er du aktiv i rygsvømning? (j/n)");
                            String backStrokeResponse = sc.next();
                            if (backStrokeResponse.equalsIgnoreCase("j")) {
                                memberList.get(i).setBackStroke(true);
                            }else {
                                memberList.get(i).setBackStroke(false);
                            }
                            System.out.println("Er du aktiv i 200 meter medley? (j/n)");
                            String medleyResponse = sc.next();
                            if (medleyResponse.equalsIgnoreCase("j")) {
                                if (memberList.get(i).getIsFemale()==(true)) {
                                   memberList.get(i).setMedley200Women(true); 
                                } else {
                                    memberList.get(i).setMedley200Men(true);
                                }
                                
                            }                         
                            System.out.println("Er du aktiv i marathon 10KM? (j/n)");
                            String marathonResponse = sc.next();
                            if (marathonResponse.equalsIgnoreCase("j")) {
                                memberList.get(i).setMarathon10K(true);
                            }else {
                                memberList.get(i).setMarathon10K(false);
                            }
                            System.out.println("Er du aktiv i hundesvømning? (j/n)");
                            String dogPaddleResponse = sc.next();
                            if (dogPaddleResponse.equalsIgnoreCase("j")) {
                                memberList.get(i).setDogPaddle(true);
                            } else {
                                memberList.get(i).setDogPaddle(false);
                            }
                        }
                    }                 
                    break;
                case '3' :
                    choiceLoop = false;
                    break;
                default : 
                    System.out.println("Ugyldigt valg, prøv igen.");
            }
        }
    
    }
    
}
