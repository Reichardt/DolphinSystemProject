package login;

import java.io.*;
import java.util.*;

public class TestMemberList {

    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<Member> memberList = new ArrayList<Member>();

        try {
            FileInputStream fis = new FileInputStream("memberList.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            memberList = (ArrayList<Member>)ois.readObject();
            ois.close();
        } catch(Exception ex) {
            ex.printStackTrace();
        }

        double name;

        for (int i = 0; i < memberList.size(); i++) {
            name = memberList.get(i).getBestTimeButterfly();
            System.out.println(name);
        }
    }
}
