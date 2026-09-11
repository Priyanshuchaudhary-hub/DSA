class Solution {
    boolean isvowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')return true;
        return false;
    }
    
    public int maxVowels(String s, int k) {
        if(k==1)return 1;
        int count=0,i=0,j=k-1;
    for(int l=0;l<k;l++){
        if(isvowel(s.charAt(l)))count++;
    }
    int max=count;
   while(j<s.length()-1){
    if(isvowel(s.charAt(i)))count--;
    i++;j++;
    if(isvowel(s.charAt(j)))count++;
    max=Math.max(max,count);
    if(max==k)return max;
   }
   return max;
    }
}