/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author Nikolaj Reichardt
 */
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
      for(Member memberID: memberList)   // printing the sorted list of ages
         System.out.print(memberID.getFirstName() +"  : "+ memberID.getMemberID() + "\n");
    
    }
    
}
