/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.io.*;
import java.util.*;


public class CoachMenu {

    public static void coachMenu() {
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

            int medlemsID;
            int bestTime;
            System.out.println("Velkommen Træner, hvilken disciplin gælder dette besøg?" +
                    "\n1. Butterfly" + "\n2. Brøst" + "\n3. Crawl" + "\n4. Rygcrawl" + "\n5. Rygsvømning" +
                    "\n6. 200 m Medley kvinder" + "\n7. 200m Medley mænd" + "\n8. Marathon 10 km" + "\n9. Hundesvømning" );
            menuChoice = sc.next().charAt(0);
            switch(menuChoice) {
                case '1' :
                    System.out.println("BUTTERFLY\nHvad vil du gøre?" +
                                        "\n1. Indtast ny bedste tid" + "\n2. Se top 5 svømmere");
                    menuChoice = sc.next().charAt(0);
                    switch(menuChoice) {
                        case '1':
                            System.out.print("Indtast MedlemsID for den svømmer som har en ny bedste BUTTERFLY tid:");
                            medlemsID = sc.nextInt();
                            System.out.println("");
                            int[] c = new int[3];
                            c = bestTime(memberList, medlemsID);
                            int a = c[0];
                            int b = c[1];
                            memberList.get(a).setBestTimeButterfly(b);
                            WriteData write = new WriteData();
                            write.writeData(memberList);
                        case '2':
                            System.out.println("");
                    }

                    // for (int i = 0; i < memberList.size(); i++) {
                    //     if (memberList.get(i).getMemberID()/1000==2) {
                    //         System.out.println("ID: " +memberList.get(i).getMemberID() +
                    //                 ", Fornavn: " +memberList.get(i).getFirstName() +
                    //                 ", Efternavn: " +memberList.get(i).getSurName());
                    //     }
                    // }
                    // System.out.println("MedlemsID:"+memberID);
                    // for (int i = 0; i < memberList.size(); i++) {
                    //     if (memberList.get(i).getMemberID()==memberID) {
                    //         System.out.println("Angiv ID på de trænerer du vil have:");
                    //         System.out.println("Træner 1:");
                    //         int coachChoice1 = sc.nextInt();
                    //         memberList.get(i).setCoachChoice1(coachChoice1);
                    //     }
                    // }
                    /** Herunder kalder vi klassen WriteData, som skaber en outputstream og
                    skriver vores medlemsliste i en fil**/
                    break;
                case '2' :
                    System.out.println("BUTTERFLY\nHvad vil du gøre?" +
                                        "\n1. Indtast ny bedste tid" + "\n2. Se top 5 svømmere");
                    menuChoice = sc.next().charAt(0);

                    break;
                case '3' :
                    System.out.println("BUTTERFLY\nHvad vil du gøre?" +
                                        "\n1. Indtast ny bedste tid" + "\n2. Se top 5 svømmere");
                    menuChoice = sc.next().charAt(0);

                case '4' :
                    System.out.println("BUTTERFLY\nHvad vil du gøre?" +
                                        "\n1. Indtast ny bedste tid" + "\n2. Se top 5 svømmere");
                    menuChoice = sc.next().charAt(0);

                case '5' :
                    System.out.println("BUTTERFLY\nHvad vil du gøre?" +
                                        "\n1. Indtast ny bedste tid" + "\n2. Se top 5 svømmere");
                    menuChoice = sc.next().charAt(0);

                case '6' :
                    System.out.println("BUTTERFLY\nHvad vil du gøre?" +
                                        "\n1. Indtast ny bedste tid" + "\n2. Se top 5 svømmere");
                    menuChoice = sc.next().charAt(0);

                case '7' :
                    System.out.println("BUTTERFLY\nHvad vil du gøre?" +
                                        "\n1. Indtast ny bedste tid" + "\n2. Se top 5 svømmere");
                    menuChoice = sc.next().charAt(0);

                case '8' :
                    System.out.println("BUTTERFLY\nHvad vil du gøre?" +
                                        "\n1. Indtast ny bedste tid" + "\n2. Se top 5 svømmere");
                    menuChoice = sc.next().charAt(0);

                case '9' :
                    System.out.println("BUTTERFLY\nHvad vil du gøre?" +
                                        "\n1. Indtast ny bedste tid" + "\n2. Se top 5 svømmere");
                    menuChoice = sc.next().charAt(0);

                    choiceLoop = false;
                    break;
                default :
                    System.out.println("Ugyldigt valg, prøv igen.");
            }
        }
    }

    public static int[] bestTime(ArrayList<Member> memberList, int medlemsID) {

        Scanner sc = new Scanner(System.in);
        int bestTime = 0;
        int minutter;
        int sekunder;
        int millisekunder;
        int i;
        int g = 0;
        int[] values = new int[3];

        for (i = 0; i < memberList.size(); i++) {
            if (memberList.get(i).getMemberID()==medlemsID) {
                System.out.println("Angiv svømmetiden herunder");
                System.out.print("Angiv antal minutter:");
                minutter = sc.nextInt();
                System.out.println("");
                System.out.print("Angiv antal sekunder:");
                sekunder = sc.nextInt();
                System.out.println("");
                System.out.print("Angiv antal millisekunder:");
                millisekunder = sc.nextInt();
                System.out.println("");
                bestTime = millisekunder + (sekunder * 1000) + (minutter * 60000);
                g = i;
            }
        }
        values[0] = g;
        values[1] = bestTime;
        return values;
    }
}
