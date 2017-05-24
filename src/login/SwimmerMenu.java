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
                            System.out.println("Angiv ID på de trænerer du vil have:");
                            System.out.println("Træner 1:");
                            int coachChoice1 = sc.nextInt();
                            memberList.get(i).setCoachChoice1(coachChoice1);
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
