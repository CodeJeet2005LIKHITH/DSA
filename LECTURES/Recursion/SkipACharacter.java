package LECTURES.Recursion;

public class SkipACharacter {
    public static void main(String[] args) {
        String string = "LIKHITH";
        String str=  "";
         Skip_ACharacter(string,str);
        System.out.println(str);

        System.out.println(SkipACharacter(string));
    }
    private static void Skip_ACharacter(String string,String new_string){
        if(string.isEmpty()){
            System.out.println(new_string);
            return;
        }
        char ch = string.charAt(0);
        if(ch == 'I'){
            Skip_ACharacter(string.substring(1), new_string);
        }
        else{
            Skip_ACharacter(string.substring(1), new_string+ch);
            // System.out.println(new_string);
        }

}
// without passing in arguments
    private static String SkipACharacter(String string){
        if(string.isEmpty()){
            return "";
        }
        char ch=string.charAt(0);
        if(ch == 'I'){
            return SkipACharacter(string.substring(1));
        }
        else{
            return ch+ SkipACharacter(string.substring(1));
        }

    }
}
