class Solution {
    public int maximumValue(String[] strs) {
        List<Integer> li=new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            int sum=0;
            String x=strs[i];
            for(int j=0;j<x.length();j++){
                if(x.charAt(j)>='a'&&x.charAt(j)<='z'){
                    li.add(x.length());
                    sum=0;
                    break;
                }else{
                    sum=1;
                }
            }if(sum!=0)  li.add(Integer.parseInt(x));
        }Collections.sort(li);
        return li.get(li.size()-1);
    }
}