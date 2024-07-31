class Solution {
    public int diagonalPrime(int[][] nums) {
        int n=nums.length;
        List<Integer> li=new ArrayList<>();
        for(int i=0;i<n;i++){
            int p=nums[i][i];
            int s=nums[i][n-i-1];
           li.add(p);
           li.add(s);
           
        }Collections.sort(li);
        for(int i=li.size()-1;i>=0;i--){
            if(ip(li.get(i))){
                return li.get(i);
            }
        }return 0;
        
    }
    public boolean ip(int n){
        if(n==1){
            return false;
        }else{
            for(int i=2;i<=n/2;i++){
                if(n%i==0){
                    return false;
                }
            }return true;
        }
    }
}