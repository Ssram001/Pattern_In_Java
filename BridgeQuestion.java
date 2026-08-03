package partten;

import java.util.*;

public class BridgeQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Question----
//        int n = sc.nextInt();















//Method--1
//        int m = sc.nextInt();
//        for (int i = 1; i <= m; i++) {
//            for (int j = 1; j <=i; j++) {
//                System.out.print((2*j-1)+" ");
//            }
//            System.out.println();
//        }
////     Method---2
////        int m = sc.nextInt();
//
//        for (int i = 1; i <= m; i++) {
//            int a = 1;
//            for (int j = 1; j <=i; j++) {
//                System.out.print(a+" ");
//                a+=2;
//            }
//            System.out.println();
//        }











//BRIDGE--QUESTION

//METHOD -1
//        System.out.print("Enetr the value: ");
//        int m = sc.nextInt();
//        int NSP = m - 1;
//        int NST = m;
//        for (int j = 1; j <= 2*m+1; j++) {
//            System.out.print("*" + " ");
//        }
//        System.out.println();
//        for (int i = 1; i <= m; i++) {
//            for (int j = 1; j <= NST; j++) {
//                System.out.print("*" + " ");
//            }
//            for (int j = 1; j <=2*i-1; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 1; j <=NST; j++) {
//                System.out.print("*" + " ");
//            }
//////            NSP--; NST -= 1;
//            System.out.println();
//
//        }

// METHOD-2
//        System.out.print("Enetr the value: ");
//        int m = sc.nextInt();
//        int NSP =1 ;
//        for (int j = 1; j <= 2*m-1; j++) {
//            System.out.print("*" + " ");
//        }
//        System.out.println();
//
//        for (int i = 1; i <= m-1; i++) {
//            for (int j = 1; j <= m-i; j++) {
//                System.out.print("*" + " ");
//            }
//            for (int j = 1; j <= NSP; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 1; j <= m-i; j++) {
//                System.out.print("*" + " ");
//            }
//            NSP+=2;
//            System.out.println();
//
//        }






//        System.out.print("Enetr the value: ");
//        int m = sc.nextInt();
//
//        for (int i = 1; i <= m; i++) {
//            for (int j = 1; j <= m; j++) {
//                System.out.print(Math.min(i,j) + " ");
//            }
//            for (int j = 1; j <= NSP; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 1; j <= m-i; j++) {
//                System.out.print("*" + " ");
//            }
//            NSP+=2;
//            System.out.println();
//
//        }


    }
}
