class Solution {
    public int countSegments(String s) {
        String [] arr=s.split(" ");
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].isEmpty()){
               continue; 
            }else{
                count++;
            }
        }return count;
    }
}