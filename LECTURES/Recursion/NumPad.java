package LECTURES.Recursion;

import java.util.ArrayList;

public class NumPad {
    public static void main(String[] args) {
        System.out.println(Num_Pad("", "27"));

    }

    static ArrayList<String> Num_Pad(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }


        int digit = up.charAt(0) - '0'; // this will convert '2' into 2


        ArrayList<String> ans = new ArrayList<>();

        if (digit >= 2 && digit <= 6) {
            for (int i = (digit - 2) * 3; i < (digit - 1) * 3; i++) {
                char ch = (char) ('a' + i);
                ans.addAll(Num_Pad(p + ch, up.substring(1)));
            }


        }
        if (digit == 7) {
            for (int i = (digit - 2) * 3; i <= (digit - 1) * 3; i++) {
                char ch = (char) ('a' + i);
                ans.addAll(Num_Pad(p + ch, up.substring(1)));
            }
            if (digit == 8) {
                for (int i = ((digit - 2) * 3) + 1; i <= (digit - 1) * 3; i++) {
                    char ch = (char) ('a' + i);
                    ans.addAll(Num_Pad(p + ch, up.substring(1)));
                }}


            }
        if (digit == 9) {
            for (int i = ((digit - 2) * 3) + 1; i <= ((digit - 1) * 3) + 1; i++) {
                char ch = (char) ('a' + i);
                ans.addAll(Num_Pad(p + ch, up.substring(1)));
            }
        }
        return ans;
    }
}
