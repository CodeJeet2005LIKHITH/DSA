package LECTURES.Recursion;
//
import java.util.ArrayList;
//
public class Dailpad {
    public static void main(String[] args) {
        pad("23","");
    }
    static void pad(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0'; // this will convert '2' into 2
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            pad(p + ch, up.substring(1));
        }

    }

//
}
