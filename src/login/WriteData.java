package login;

import java.io.*;
import java.util.*;

public class WriteData {

    public static void writeData(ArrayList<Member> memberList, String filename) {
        try {
            FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(memberList); // write memberList to ObjectOutputStream
            oos.close();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}