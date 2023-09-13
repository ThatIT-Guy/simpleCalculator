package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = sc.next();
        int c = sc.nextInt();
        int sum = a + c;
        int sub = a- c;
        int div = a / c;
        int mult = a * c;
        int mod = a % c;

//        if (b.equals("+")) {
//            int sum = a + c;
//            System.out.println(sum);
//        } else if (b.equals("-")) {
//            int sub = a- c;
//            System.out.println(sub);
//        } else if (b.equals("/")) {
//            int div = a / c;
//            System.out.println(div);
//        } else if (b.equals("*")) {
//            int mult = a * c;
//            System.out.println(mult);
//        } else if (b.equals("%")) {
//            int mod = a % c;
//            System.out.println(mod);
//        }

        switch (b) {
            case "+" : System.out.println(sum);
            break;
            case "-" : System.out.println(sub);
            break;
            case "/" :System.out.println(div);
            break;
            case "*" :System.out.println(mult);
            break;
            case "%" :System.out.println(mod);
            break;
        }
    }
}