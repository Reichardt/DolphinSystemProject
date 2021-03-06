/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Login {

    public static void main(String[] args) throws FileNotFoundException, IOException {
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

        boolean loginSuccess = false;
        int loginMemberID = 0;
        /**
         Login:
         Brugeren indtaster et medlems ID og et password. Systemet søger
         * derefter igennem ArrayListen til den finder det medlemsID & password kombination.
         * Hvis systemet ikke finder kombinationen skal brugeren forsøge login igen.
         **/

        /** Login loop kører indtil for loop sætter loginSuccess = true **/
        do {
            System.out.print("LOGIN" +
                    "\nMedlems ID: ");
            loginMemberID = sc.nextInt();
            System.out.print("Password: ");
            String loginPassword = sc.next();
            System.out.println("");
            int searchListLength = memberList.size();

            /** For loop kører igennem ArrayListen og leder efter et index hvor
             det angivne memberID & password begge findes. Hvis det ikke findes
             starter do-while loopet om, og brugeren bedes om en ny memberID & password kombination.**/
            for (int i = 0; i < searchListLength; i++) {
                      if (memberList.get(i).getMemberID()==(loginMemberID) && memberList.get(i).getPassword().equals(loginPassword)) {
                          System.out.println("Login godkendt.");
                          loginSuccess = true;
                      }

            }
        } while (loginSuccess == false);

        int rightsID = loginMemberID/1000; //Systemet udregner hvilken menu brugeren vises baseret på deres medlemsID.
        char menu = (char)(rightsID + '0');
        switch(menu) {
            case '1' :
                ChairmanMenu.chairmanMenu();
                break;
            case '2' :
                TreasurerMenu.treasurerMenu();
                break;
            case '3' :
                CoachMenu.coachMenu();
                break;
            case '4' :
                SwimmerMenu.swimmerMenu(loginMemberID);
                break;




        }
    }
}
