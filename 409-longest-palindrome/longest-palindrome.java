class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            }else{
                hm.put(s.charAt(i),1);
            }
        }int odd=0;
        int sum=0;
        for(int i:hm.values()){
            if(i%2==0){
                sum+=i;
            }else{
                odd++;
                sum+=i-1;
            }
        }if(odd>0){
            return sum+1;
        }else
        return sum;
    }
}