//package QUESTIONS.Leetcode.RecursionMedium;
//
//public class TowerOfHanoi {
//    public static void main(String[] args) {
//        int discs = 3;
//        Tower(discs,"abc","","");
//    }
//    private static void Tower(int discs,String Origin,String helper,String destination){
//        if(discs == 1){
//            System.out.print(Origin + " ");
//            System.out.print(helper + " ");
//            System.out.print(destination + " ");
//            return;
//        }
//        Tower(discs-1,Origin.substring(1),helper+Origin.charAt(0),destination);
//        System.out.print(Origin + " ");
//        System.out.print(helper + " ");
//        System.out.print(destination + " ");
//        Tower(discs-1,Origin.substring(1),helper);
//
//
//
//    }
//}
