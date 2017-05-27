 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.io.*;
import java.util.*;

public class compareTime {
    public static void main(String[] args){
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

      Collections.sort(memberList);
<<<<<<< HEAD
      for(Member memberID: memberList)   // printing the sorted list of ages
         System.out.print(memberID.getFirstName() +"  : "+ memberID.getBirthYear() + "\n");

=======
      for(int i = 0; i<6; i++) {
          System.out.println(memberList.get(i).getFirstName()+ " " + memberList.get(i).getSurName() + ": " + memberList.get(i).getBirthYear());
      }   // printing the sorted list of ages
         //System.out.print(birthYear.getFirstName() +" " + birthYear.getSurName() + ": "+ birthYear.getBirthYear() + "\n");
//      for(Member birthYear: memberList)   // printing the sorted list of ages
//         System.out.print(birthYear.getFirstName() +" " + birthYear.getSurName() + ": "+ birthYear.getBirthYear() + "\n");
    
>>>>>>> origin/master
    }

}
