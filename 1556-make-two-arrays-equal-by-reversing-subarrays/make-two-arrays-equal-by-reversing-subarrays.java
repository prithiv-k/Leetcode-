class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        if(arr.length!=target.length){
            return false;
        }else{
            int flag=0;
          for(int i=0;i<target.length;i++){
            for(int j=0;j<target.length;j++){
                if(arr[j]==target[i]){
                    arr[j]=0;
                    break;
                }
            }
        }for(int i:arr){
            if(i!=0)  return false;
        }return true;
    }
    }
}