import java.util.Scanner;
public class StringBasic2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Basic String Functions
        //1. length()
        String s = "  Hello world ";
        System.out.println(s.length());

        //2. CharAt(index)
        System.out.println(s.charAt(9));

        //3. toUpperCase
        System.out.println(s.toUpperCase());

        //4. toLowerCase
        System.out.println(s.toLowerCase());

        //5. trim()- remove space on both side
        System.out.println(s.trim());

        //6. equal()- comparison Function
        String b = "Hello";
        String c = "Hollo";
       // String c = "World"; -false output
        System.out.println(b.equals(c));
        //7. equalsIgnorCase()-ignore small and capital word
        String d = "Hello";
        String e = "hello";
        System.out.println(d.equalsIgnoreCase(e));
        //8. compareTo()
        String f = "apple";
        String g = "banana";
        String h = "apple";
        String i = "Apple";
        System.out.println(f.compareTo(g));
        System.out.println(f.compareTo(h));
        System.out.println(f.compareToIgnoreCase(i));
       // 0       → same
        //negative → first string smaller
        //positive → first string greater
        System.out.println("Apple".compareToIgnoreCase("apple"));

        // Searching Functions
        //10. Contains()-Check karta hai substring present hai ya nahi.
        String p = "Hello world";
        String r = "w0rld";
        System.out.println(p.contains(r));

        //11. indexOf()-Character/string ka first occurrence.
        String v = "banana";
        System.out.println(v.indexOf('a'));
        System.out.println(v.indexOf('n'));
        //12. lastIndexOf()- Last occurrence.
        System.out.println(v.lastIndexOf('a'));
        System.out.println(v.lastIndexOf('v'));
        System.out.println(v.lastIndexOf('n'));

       // 13.startsWith();
        String ac = "Hello World";
        String aa = "hello";
        System.out.println(aa.startsWith("aa"));
        System.out.println(ac.startsWith("Hello"));

        //14. endsWith();
        System.out.println(ac.endsWith("Hello"));
        System.out.println(ac.endsWith("World"));

        // String Extraction;
        //15. substring(start)-Start index se end (start)
        String ax = "Hello World";
        System.out.println(ax.substring(4));

        //16. substring(start,end)
        System.out.println(ax.substring(5,11));

        //17. replace()-replace a to b;
        String az = "Hello World";
        String x = "banana";
        System.out.println(az.replace('e','P'));
        System.out.println(x.replace('a','w'));

        //18. replaceFrist()-Sirf first matching occurrence replace karta hai.
        String xc = "banana";
        System.out.println(xc.replaceFirst("a","x"));
        System.out.println(xc.replaceAll("a","x"));
     // 19. replaceAll();
        String bb = "a1b2c3";
        System.out.println(bb.replaceAll("[0-9]", " "));

        //20. split();- String ko array me divide karta hai.
        String mm = "Java is Easy";
        String[] arr = mm.split(" ");
        for(String xx : arr){
            System.out.println(xx);

            //21. reverse Function
            StringBuilder sb = new StringBuilder("Java is Easy Language");
            sb.reverse();
            System.out.println(sb);
        }
    }
}
