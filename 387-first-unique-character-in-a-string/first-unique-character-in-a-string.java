class Solution {
    public int firstUniqChar(String s) {
       // String s = sc.nextLine();
        for(int i = 0; i<s.length();i++){
            char ch = s.charAt(i);

            if(s.indexOf(ch) == s.lastIndexOf(ch)){
                System.out.println(ch);
                return i;
            }
        }
        return -1;
    }
}