class Solution {
    public String kthDistinct(String[] arr, int k) {
        int c=0;
        for(int i=0;i<arr.length;i++){
            boolean che=true;
            for(int j=0;j<arr.length;j++){
                if(i!=j&&arr[i].equals(arr[j])){
                    che=false;
                    break;
                }
            }
        
        if(che){
            c++;
        }
        if(c==k){
            return arr[i];
        }
    }
    return "";
    }
}