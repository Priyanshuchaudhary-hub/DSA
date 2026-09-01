import java.util.Scanner;
public class String_Basics {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char chrs[] = {'A', 'B', 'C', 'D', 'E'};
            String s2 = new String(chrs);
            System.out.println(s2);
        System.out.println(s2.length());

        for(int i =0;i<s2.length();i++){
            char ch = s2.charAt(i);
            System.out.println(ch);
        }
        String s3 = "abdc";
        String s4 = "abcd";

        if(s3==s4)
            System.out.println("Same");
        else
        System.out.println("Not Same");

        String s5a = "abcd";
        String s6a = new String("abcd");
        if(s5a==s6a)
            System.out.println("Same");
        else
        System.out.println("Not Same");
        System.out.println(s5a.equals(s6a));

        String s5 = "ABcd";
        String s6 = "abcd";
        System.out.println(s5.equalsIgnoreCase(s6));
        String s7 = "Hello world";
        String s8 = "Hello";
        System.out.println(s7.startsWith(s8));
        String s9 = "world";
        System.out.println(s7.endsWith(s9));
        String s10 = "ello";
        System.out.println(s7.contains(s10));

        String s11 = "  Hello  ";
        System.out.println(s11.trim());

        String s12 = "abcdef";
       // String s13 = s12.replace( 'a, 'z);
        String s13 = s12.replaceFirst("abc", "z");
        System.out.println(s12);
        System.out.println(s13);
//substring
        String s14 = "Abcdef";
        System.out.println(s14.substring(2));
        System.out.println(s14.substring( 0,5));

    }
        }


