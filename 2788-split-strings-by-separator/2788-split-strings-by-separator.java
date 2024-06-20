class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String>fin=new ArrayList<>();
        String sep="\\"+separator;
        for(int i=0;i<words.size();i++) {
            String[] s=words.get(i).split((sep));
            for(int j=0;j<s.length;j++) {
                if(!s[j].isEmpty()){ 
                    fin.add(s[j]);
                }
            }
        }
        return fin;
    }
}
