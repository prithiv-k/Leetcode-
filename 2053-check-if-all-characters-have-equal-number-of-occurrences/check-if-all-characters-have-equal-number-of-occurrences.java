class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(hm.containsKey(c)){
                hm.put(c,hm.get(c)+1);
            }else{
                hm.put(c,1);
            }
        }int flag=0;
        for(int i:hm.values()){
            if(flag==0){
                flag=i;
            }
            else if(flag!=i){
                return false;
            }
        }return true;
    }
}