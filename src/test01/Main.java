package test01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
//        stage1("aabcccbbad");
//        System.out.println("-------------");
//        stage2("abcccbad");
        System.out.println("-------------");
        System.out.println("stage1:");
        stage1(s);
        System.out.println("-------------");
        System.out.println("stage2:");
        stage2(s);



        StringBuilder sbs = new StringBuilder();
        int Upper=0;
        int Lower=0;
        StringBuilder res = new StringBuilder();

        System.out.println(res);
        return;
    }

    public static void stage1(String s){
        StringBuilder a = new StringBuilder(s);
        for (int i=0;i<s.length();i++){
            if (s.length()-i>=3){
                char c1 = s.charAt(i);
                char c2 = s.charAt(i+1);
                char c3 = s.charAt(i+2);
                if (c1==c2&&c2==c3){
                    a=a.replace(i,i+3,"");
                    s=a.toString();
                    System.out.println(s);
                    stage1(s);
                }
            }else {
                break;
            }
        }
    }

    public static void stage2(String s){
        StringBuilder a = new StringBuilder(s);
        for (int i=0;i<s.length();i++){
            if (s.length()-i>=3){
                char c1 = s.charAt(i);
                char c2 = s.charAt(i+1);
                char c3 = s.charAt(i+2);
                if (c1==c2&&c2==c3){
                    if (c1=='a'){
                        a=a.replace(i,i+3,"");
                    }else {
                        a=a.replace(i,i+3,String.valueOf((char) (c1-1)));
                    }
                    s=a.toString();
                    System.out.println(s);
                    stage2(s);
                }
            }else {
                break;
            }
        }
    }
}