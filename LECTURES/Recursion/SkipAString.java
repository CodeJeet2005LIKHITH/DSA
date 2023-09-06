package LECTURES.Recursion;

public class SkipAString {
    public static void main(String[] args) {
        String string = "THE APPLES ARE VERY GOOD";
        String string1 = "THE APPLES ARE VERY GOOD APP GOOD";
    
        System.out.println(SKipAString(string));
        System.out.println(SKip_A_STRING_IF_ITS_NOT_THE_REQUIRED_STRING(string1));

    }
    private static String SKipAString(String string){
        if(string.isEmpty()){
            return "";
        }

        if(string.startsWith("APPLES")){
            return SKipAString(string.substring(6));
        }
        else{
            return string.charAt(0) + SKipAString(string.substring(1));
        }
    }
    // SKIP A STRING IF IT'S NOT THE REQUIRED STRING
    // ONLY SKIP THE APP WHEN IT IS NOT APPLE   
    private static String SKip_A_STRING_IF_ITS_NOT_THE_REQUIRED_STRING(String string){

        if(string.isEmpty()){
            return "";
        }
        if(string.startsWith("APP") && !string.startsWith("APPLE") ){
            return SKip_A_STRING_IF_ITS_NOT_THE_REQUIRED_STRING(string.substring(3));
        }
        else{
            return string.charAt(0)+SKip_A_STRING_IF_ITS_NOT_THE_REQUIRED_STRING(string.substring(1));
        }
        
    }
}
