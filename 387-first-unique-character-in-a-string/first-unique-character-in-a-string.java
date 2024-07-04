class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            if(hm.containsKey(x)){
                hm.put(x,hm.get(x)+1);
            }else{
                hm.put(x,1);
            }
        }for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            if(hm.get(x) == 1){
                return i;
            }
        }return -1;
    }
}