class Solution {
    public int[] sortByBits(int[] arr) {
        int ans[]=new int[arr.length];
        Arrays.sort(arr);
        int count[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            count[i]=Integer.bitCount(arr[i]);
        }
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
            if(count[j]>count[j+1]){
                int temp=arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=temp;
                int tp=count[j+1];
                count[j+1]=count[j];
                count[j]=tp;
            }
        }
        }return arr;
    }
}